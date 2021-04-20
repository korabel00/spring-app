package com.solovev.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.solovev.spring")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
}
