## Prereqs

* Maven 3.0.x
* [Pygments](http://pygments.org/)  for syntax highlighting
* [Prince XML](http://princexml.com/) for creating the slides in PDF format

## Building

For building the example code (business model, JAX-RS and JAX-WS examples), just run `mvn install` in the root project directory.

In the `jaxws` and `jaxrs` module, you can execute `mvn jetty:run` to start Jetty and run the web services.

To generate the slides PDF document, run `mvn install` in the `slides` module.
