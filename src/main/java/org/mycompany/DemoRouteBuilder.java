package org.mycompany;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class DemoRouteBuilder extends RouteBuilder {

    @Override
    public void configure() {
        from("timer:{{timer.name}}?period={{timer.period}}")
            .setBody(simple("{{greeting.word}}, this is Camel running in Spring Boot!"))
            .to("log:out");

    }

}
