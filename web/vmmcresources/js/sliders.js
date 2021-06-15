var Sliders = function () {

    // default sliders
    $("#default-slider").slider();

    // snap inc
    $("#snap-inc-slider").slider({
        value: 50,
        min: 0,
        max: 1000,
        step: 100,
        slide: function (event, ui) {
            $("#snap-inc-slider-amount").text(""+ui.value);
        }
    });

    $("#snap-inc-slider-amount").text("" + $("#snap-inc-slider").slider("value"));

    // range slider
    $("#slider-range").slider({
        range: true,
        min: 0,
        max: 500,
        values: [75, 300],
        slide: function (event, ui) {
            $("#slider-range-amount").text("$" + ui.values[0] + " - $" + ui.values[1]);
        }
    });

    $("#slider-range-amount").text("$" + $("#slider-range").slider("values", 0) + " - $" + $("#slider-range").slider("values", 1));

    //range max

    $("#slider-range-max").slider({
        range: "max",
        min: 1,
        max: 10,
        value: 2,
        slide: function (event, ui) {
            $("#slider-range-max-amount").text(ui.value);
        }
    });

    $("#slider-range-max-amount").text($("#slider-range-max").slider("value"));

    // range min for temperature
    $("#slider-range-temperature").slider({
        range: "min",        
        value: 37,
        min: 1,
        step: 0.1,
        max: 110,
        slide: function (event, ui) {
            $("#slider-range-temperature-amount").text("" + ui.value);
        }
    });

    $("#slider-range-temperature-amount").text("" + $("#slider-range-temperature").slider("value"));
   //  $("#temperature").text("" + $("#slider-range-temperature").slider("value"));
 
    
    // //  //slider-range-height
    $("#slider-range-height").slider({
        range: "min",
        value: 37,
        min: 20,
        step: 0.1,
        max: 310,
        slide: function (event, ui) {
            $("#slider-range-height-amount").text("" + ui.value);
        }
    });

    $("#slider-range-height-amount").text("" + $("#slider-range-height").slider("value"));

    //  // range min for weight
    $("#slider-range-weight").slider({
        range: "min",
        value: 37,
        min: 1,
        step: 0.1,
        max: 310,
        slide: function (event, ui) {
            $("#slider-range-weight-amount").text("" + ui.value);
        }
    });

    $("#slider-range-weight-amount").text("" + $("#slider-range-weight").slider("value"));

    //
    // //  // range min for systolic
    $("#slider-range-systolic").slider({
        range: "min",
        value: 37,
        min: 5,
        max: 310,
        slide: function (event, ui) {
            $("#slider-range-systolic-amount").text("" + ui.value);
        }
    });

    $("#slider-range-systolic-amount").text("" + $("#slider-range-systolic").slider("value"));
 
    //
    // // //  // range min for dystolic
    $("#slider-range-dystolic").slider({
        range: "min",
        value: 60,
        min: 5,
        max: 310,
        slide: function (event, ui) {
            $("#slider-range-dystolic-amount").text("" + ui.value);
        }
    });

    $("#slider-range-dystolic-amount").text("" + $("#slider-range-dystolic").slider("value"));
 
    //
    // setup graphic EQ
    $( "#eq > span" ).each(function() {
    // read initial values from markup and remove that
        var value = parseInt( $( this ).text(), 10 );
        $( this ).empty().slider({
            value: value,
            range: "min",
            animate: true,
            orientation: "vertical"
        });
    });

    // bound to select

    var select = $( "#minbeds" );
    var slider = $( "<div id='slider'></div>" ).insertAfter( select ).slider({
        min: 1,
        max: 6,
        range: "min",
        value: select[ 0 ].selectedIndex + 1,
        slide: function( event, ui ) {
            select[ 0 ].selectedIndex = ui.value - 1;
        }
    });
    $( "#minbeds" ).change(function() {
        slider.slider( "value", this.selectedIndex + 1 );
    });

    // vertical slider
    $("#slider-vertical").slider({
        orientation: "vertical",
        range: "min",
        min: 0,
        max: 100,
        value: 60,
        slide: function (event, ui) {
            $("#slider-vertical-amount").text(ui.value);
        }
    });
    $("#slider-vertical-amount").text($("#slider-vertical").slider("value"));

    // vertical range sliders
    $("#slider-range-vertical").slider({
        orientation: "vertical",
        range: true,
        values: [17, 67],
        slide: function (event, ui) {
            $("#slider-range-vertical-amount").text("$" + ui.values[0] + " - $" + ui.values[1]);
        }
    });

    $("#slider-range-vertical-amount").text("$" + $("#slider-range-vertical").slider("values", 0) + " - $" + $("#slider-range-vertical").slider("values", 1));


}();