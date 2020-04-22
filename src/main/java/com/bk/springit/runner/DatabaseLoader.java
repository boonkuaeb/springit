package com.bk.springit.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
public class DatabaseLoader  implements CommandLineRunner {

    @Override
    public void run(String... arge) throws Exception {
        // Do some database work
        System.out.println("Database loader...");
    }
}
