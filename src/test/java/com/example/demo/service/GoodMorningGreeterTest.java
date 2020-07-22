package com.example.demo.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GoodMorningGreeterTest {
    @Test
    void shouldReturnGreetingMessage() {
        GoodMorningGreeter goodMorningGreeter = new GoodMorningGreeter();

        assertEquals("Good Morning", goodMorningGreeter.greet());
    }
}