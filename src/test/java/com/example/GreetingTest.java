package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class GreetingTest {
    @Test
    void testHelloBasic() {
        Greeting greeting = new Greeting(); // ← คลาสนี้ยังไม่มี
        String result = greeting.sayHello("World");
        assertEquals("Hello, World", result);
    }
}