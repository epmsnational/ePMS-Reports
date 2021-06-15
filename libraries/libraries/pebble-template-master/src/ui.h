#pragma once

#include <pebble.h>

struct Fonts {
    GFont droidsans_bold_50;
};

struct Texts {
    char time[6];
};

struct Layers {
    Layer *window;
    TextLayer *date;
    TextLayer *time;
};

struct UI {
    Window *window;
    struct Layers layers;
    struct Fonts fonts;
    struct Texts texts;
};

void ui_set_datetime(struct tm *tick_time, TimeUnits units_changed);
void ui_set_bluetooth(bool connected);
void ui_set_battery_level(int level);

void ui_init();
void ui_deinit();

struct UI ui;
