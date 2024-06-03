package com.tka.main;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@ComponentScan(basePackages = {"com.tka"})
@PropertySource("classpath:MyFile.properties")
public class Configuration {

}
