#include "pebble-template.h"
#include "ui.h"
#include "helpers.h"
#include "config.h"

int PWIDTH = 144;
int HALFPWIDTH = 72;
int PHEIGHT = 168;
int HALFPHEIGHT = 84;

void ui_set_datetime(struct tm *tick_time, TimeUnits units_changed) {
    if (units_changed & MINUTE_UNIT) {
        strftime(ui.texts.time, sizeof(ui.texts.time), clock_is_24h_style() ? "%H:%M" : "%I:%M", tick_time);

        //Remove leading 0
        if (ui.texts.time[0] == '0') {
            memmove(ui.texts.time, &ui.texts.time[1], sizeof(ui.texts.time) - 1);
        }

        text_layer_set_text(ui.layers.time, ui.texts.time);
    }
}

/*void ui_set_bluetooth(bool connected) {

}*/

/*void ui_set_battery_level(int level) {

}*/

void ui_window_load(Window *window) {
    ui.layers.window = window_get_root_layer(window);

    //Dynamically set sizes
    GRect window_bounds = layer_get_bounds(ui.layers.window);
    PWIDTH = window_bounds.size.w;
    HALFPWIDTH = window_bounds.size.w / 2;
    PHEIGHT = window_bounds.size.h;
    HALFPHEIGHT = window_bounds.size.h / 2;

    ui.layers.time = text_layer_init(
        ui.layers.window,
        GRect(0, 0, PWIDTH, 100),
        ui.fonts.droidsans_bold_50,
        GColorClear,
        GColorBlack,
        GTextAlignmentCenter
    );

    text_layer_show(ui.layers.time);
}

void ui_window_unload(Window *window) {
    text_layer_destroy_safe(ui.layers.time);
}

void ui_init() {
    struct Fonts fonts;
    struct Texts texts;
    struct Layers layers;

    fonts.droidsans_bold_50 = fonts_load_resource_font(RESOURCE_ID_DROIDSANS_BOLD_50);

    ui.layers = layers;
    ui.texts = texts;
    ui.fonts = fonts;

    strncpy(ui.texts.time, "", sizeof(ui.texts.time));

    ui.window = window_create();
    window_set_window_handlers(ui.window, (WindowHandlers) {
        .load = ui_window_load,
        .unload = ui_window_unload,
    });

    const bool animated = true;
    window_stack_push(ui.window, animated);
}

void ui_deinit() {
    window_destroy(ui.window);

    fonts_unload_custom_font_safe(ui.fonts.droidsans_bold_50);
}
