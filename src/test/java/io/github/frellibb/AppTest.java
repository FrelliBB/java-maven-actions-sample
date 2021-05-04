package io.github.frellibb;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void getMessage() {
        Assertions.assertEquals("Hello, world!", App.getMessage());
    }
}