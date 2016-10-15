package com.jsral.ha.greetings.ports;

import com.jsral.ha.greetings.model.Greeting;

public interface GreetingsPort {
        Greeting sayHello(String language);
}
