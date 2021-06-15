#include <pebble.h>

#include "pebble-template.h"
#include "helpers.h"
#include "config.h"
#include "ui.h"

static void handle_tick(struct tm *tick_time, TimeUnits units_changed) {
    ui_set_datetime(tick_time, units_changed);
}

static void handle_outbox_failed(DictionaryIterator *iterator, AppMessageResult reason, void *context) {
    APP_LOG(APP_LOG_LEVEL_DEBUG, "message failed to send: %s", translate_message_error(reason));
}

static void handle_inbox_received(DictionaryIterator *iter, void *context) {
    bool config_updated = false;

    Tuple *data = dict_read_first(iter);
    while(data != NULL) {
        switch(data->key) {
            default:
                config_recieved(data);
                config_updated = true;

                break;
        }

        data = dict_read_next(iter);
    }

    if (config_updated) {
        config_save();
    }
}

/*static void handle_inbox_dropped(AppMessageResult reason, void *context) {
    APP_LOG(APP_LOG_LEVEL_DEBUG, "message dropped: %s", translate_message_error(reason));
}*/

/*static void handle_outbox_sent(DictionaryIterator *iterator, void *context) {
    APP_LOG(APP_LOG_LEVEL_DEBUG, "message sent sucessfully");
}*/

/*static void handle_battery(BatteryChargeState battery) {
    ui_set_battery_level(battery.charge_percent);
}*/

/*static void handle_bluetooth(bool connected) {
    ui_set_bluetooth(connected)
}*/

/*static void handle_health(HealthEventType event, void *context) {
    switch(event) {
        case HealthEventSignificantUpdate:
            break;

        case HealthEventMovementUpdate:
            break;

        case HealthEventSleepUpdate:
            break;
    }
}*/

static void init(void) {
    setlocale(LC_ALL, "");

    config_init();
    ui_init();

    time_t now = time(NULL);
    struct tm *tick_time = localtime(&now);
    handle_tick(tick_time, MINUTE_UNIT | DAY_UNIT | MONTH_UNIT);
    tick_timer_service_subscribe(MINUTE_UNIT, &handle_tick);

    //handle_battery(battery_state_service_peek());
    //battery_state_service_subscribe(&handle_battery);

    //ui_set_bluetooth(connection_service_peek_pebble_app_connection());
    //bluetooth_connection_service_subscribe(&handle_bluetooth);

    /*
    #ifdef PBL_HEALTH
        health_service_events_subscribe(&handle_health, NULL);
    #endif
    */

    app_message_register_outbox_failed(&handle_outbox_failed);
    app_message_register_inbox_received(&handle_inbox_received);
    //app_message_register_inbox_dropped(&handle_inbox_dropped);
    //app_message_register_outbox_sent(&handle_outbox_sent);
    app_message_open(640, 64);
}

static void deinit(void) {
    ui_deinit();

    tick_timer_service_unsubscribe();
    //battery_state_service_unsubscribe();
    //bluetooth_connection_service_unsubscribe();
    //health_service_events_unsubscribe();
    app_message_deregister_callbacks();
}

int main(void) {
    init();
    app_event_loop();
    deinit();
}
