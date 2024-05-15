package com.spring.calculator.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("login");
        registry.addViewController("/register").setViewName("register");
        registry.addViewController("/calculator").setViewName("calculator");
        registry.addViewController("/calculate").setViewName("calculate");
        registry.addViewController("/number").setViewName("number");
        registry.addViewController("/numbers").setViewName("numbers");
        registry.addViewController("/refresh").setViewName("refresh");
    }
}

// TODO:
//       1. validacija registruojant vartotoja ar emailas panaudotas
//       2. vientisas stylius (visoms formoms bendras footeris, headeris ir menu). Menu juostoje varotojas mato prisijungimo
//       varda ir gali atsijungti. Menu juostuoje yra nuorodos i formas (skaiciuoti, perziureti, atnaujinti)
//       3. username stulpelis prie iraso matomas tik admin
//       4. pajungti uservalidator (Andriaus pvz). pirmiasio nuo username ilgio kai suveiks - tada email