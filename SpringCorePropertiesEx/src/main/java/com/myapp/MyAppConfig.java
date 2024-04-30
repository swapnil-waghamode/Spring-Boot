package com.myapp;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@ComponentScan(basePackages = "com.myapp")
@PropertySource("classpath:myapp.properties")
public class MyAppConfig {

}
