package icu.insomniac.restful.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan("icu.insomniac.restful.controller")
@EnableWebMvc
public class SpringMvcConfig {
}
