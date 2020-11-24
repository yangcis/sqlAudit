package org.yangcis.parsing;

import org.apache.servicecomb.springboot2.starter.EnableServiceComb;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableServiceComb
@SpringBootApplication
public class ParsingApplication {
    public static void main(String[] args) {
        SpringApplication.run(ParsingApplication.class, args);
    }
}
