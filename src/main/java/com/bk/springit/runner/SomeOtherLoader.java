package com.bk.springit.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class SomeOtherLoader implements CommandLineRunner {

    @Override
    public void run(String... arge) throws Exception {
        // Do some other work
        System.out.println("SomeRunner.....");
    }
}
