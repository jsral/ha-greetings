package com.jsral.ha.greetings.core;

import com.jsral.ha.greetings.model.Greeting;
import com.jsral.ha.greetings.ports.GreetingsPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import java.util.Locale;

@Service
@Configuration
@PropertySource("GreetingsRepository.properties")
public class Greetings implements GreetingsPort {

    @Autowired
    private Environment repository;

    public Greeting sayHello(String language) {
        if (language == null ) {
            language = Locale.getDefault().toLanguageTag();
        }
        return new Greeting(language, repository.getProperty(language));
    }

    public void setRepository(Environment repository) {
        this.repository = repository;
    }
}