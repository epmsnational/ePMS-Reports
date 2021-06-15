window.location = {}; //shim for iOS
document.createElement = null; //shim to trick the browserify shims (also for iOS)

var config = require('config');
var logger = require('logger');
var metadata = require('metadata');
var constants = require('constants');

Pebble.addEventListener('ready', function(e) {
    console.log('starting js, v' + metadata.versionLabel);

    logger.load();
    logger.log(logger.APP_START);

    config.load();
    config.send();
});

Pebble.addEventListener('appmessage', function(e) {
    logger.log(logger.MESSSAGE_RECIEVED);
    console.log('Received message: ' + JSON.stringify(e.payload));
});

Pebble.addEventListener('showConfiguration', function(e) {
    logger.log(logger.CONFIGURATION);

    var platform = 'aplite';
    if (Pebble.getActiveWatchInfo) {
        platform = Pebble.getActiveWatchInfo().platform;
    }

    var url = '<%= config_url %>?platform=' +
        platform + '&version=' + metadata.versionLabel +
        '&dl=' + logger.getLog() + '&lsc=' + logger.getStatusCode() +
        '&llec=' + logger.getLocationErrorCode() + '&token=' + Pebble.getAccountToken() +
        '#' + encodeURIComponent(JSON.stringify(config.config));

    Pebble.openURL(url);
    console.log(url);
});

Pebble.addEventListener('webviewclosed', function(e) {
    if (!e.response || e.response == 'cancel') {
        logger.log(logger.CONFIGURATION_CANCELED);
        console.log('config canceled');
    }
    else {
        logger.log(logger.CONFIGURATION_CLOSE);

        config.save(JSON.parse(decodeURIComponent(e.response)));
        config.send();
    }
});
