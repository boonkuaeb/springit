package com.bk.springit.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Getter
@Setter
@ConfigurationProperties()
public class SpringProperties {
    /**
     * This is our welcome message.
     */
    @Value("${springit.welcome-msg:Hello, World}")
    private String welcomMsg;
}
