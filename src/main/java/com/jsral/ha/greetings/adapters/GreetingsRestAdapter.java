package com.jsral.ha.greetings.adapters;

import com.jsral.ha.greetings.ports.GreetingsPort;
import com.jsral.ha.greetings.model.Greeting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mobile.device.Device;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsRestAdapter {

        @Autowired
        GreetingsPort service;

        @RequestMapping("/greeting")
        public Greeting greeting(Device device, @RequestParam(value="language", required=false) String language) {
            return service.sayHello(language);
        }
}
