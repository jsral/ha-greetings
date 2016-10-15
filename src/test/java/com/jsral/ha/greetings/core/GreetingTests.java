package com.jsral.ha.greetings.core;

import com.jsral.ha.greetings.model.Greeting;
import org.junit.Test;
import org.springframework.core.env.Environment;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

public class GreetingTests {


    @Test
    public void testSayHello()
    {
        Greetings greetings = new Greetings();
        Environment repository = mock(Environment.class);
        String language = "es-ES";
        String message = "Hola mundo";

        when(repository.getProperty(language)).thenReturn(message);

        greetings.setRepository(repository);
        Greeting greeting = greetings.sayHello(language);

        assertEquals(greeting.getLanguage(), language);
        assertEquals(greeting.getMessage(), message);
    }

}
