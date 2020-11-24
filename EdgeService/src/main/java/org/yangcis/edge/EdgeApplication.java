package org.yangcis.edge;

import org.apache.servicecomb.springboot2.starter.EnableServiceComb;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
@EnableServiceComb
public class EdgeApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder().web(WebApplicationType.NONE).sources(EdgeApplication.class).run(args);
    }
}
