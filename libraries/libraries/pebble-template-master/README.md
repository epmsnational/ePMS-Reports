# Brian's Opinionated Pebble Template

This is an opinionated template for a Pebble app. It's designed to help me quickly
bootstrap new Pebble apps and watchfaces.

It uses:

* A [Gulp](http://gulpjs.com/) lint/build/deploy system
* Default [Bower](http://bower.io/) components for the config page
    * [Angular](https://angularjs.org/)
    * [Angular-Slate](https://github.com/bhdouglass/angular-slate)
    * [Slate](https://github.com/pebble/slate)
* A custom configuration build system
    * See below
* Default components for the Pebble javascript
    * [MessageQueue](https://github.com/smallstoneapps/js-message-queue)
* Deployment to [Surge](https://surge.sh/)

## Usage

Grab a [copy of this repo](https://github.com/bhdouglass/pebble-template/archive/master.zip)
and change the references to pebble-template to your own project.

* Run the dev server for the config page: `gulp serve`
* Install the app to your pebble: `gulp pebble-install`
    * Specify your phone's IP in tasks/pebble.js or the PHONE env var
* Deploy the config page: `gulp config-deploy`
    * Change the CNAME file to reflect your domain name
    * The deployment is done using [surge.sh](https://surge.sh/)

## Other Useful Commands

* Build the pbw: `gulp pebble-build`
* Build the config page: `gulp config-build`

## Generated Configuration

TODO

## Recommended Extra Components

* [WeatherMan](https://github.com/bhdouglass/weather-man) - A weather library with multiple weather povider options
* [Moment.js](http://momentjs.com/) - A library for parsing, validating, manipulating, and displaying dates

## License

Copyright (C) 2016 [Brian Douglass](http://bhdouglass.com/)

This program is free software: you can redistribute it and/or modify it under
the terms of the GNU General Public License version 3, as published by the Free
Software Foundation.

This program is distributed in the hope that it will be useful, but WITHOUT ANY
WARRANTY; without even the implied warranties of MERCHANTABILITY, SATISFACTORY
QUALITY, or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public
License for more details.

You should have received a copy of the GNU General Public License along with
this program.  If not, see <http://www.gnu.org/licenses/>.
