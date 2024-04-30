package com.app;

import org.springframework.context.annotation.ComponentScan;

//@ComponentScan({"com.app", "xy.ab", "abc.java"})
//@ComponentScan(basePackages = {"com.app", "xy.ab", "abc.java"})
//@ComponentScan("com.app")
@ComponentScan(basePackages = {"com.app" , "my.one"})
public class MyAppConfig {

}
