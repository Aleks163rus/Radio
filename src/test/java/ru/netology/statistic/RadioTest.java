package ru.netology.statistic;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

    // тесты переключения станций

    @Test
    public void shouldCreateRadioWithDefaultValues() {
        Radio radio = new Radio(0,0,9,0,100,0);
        assertEquals(0, radio.getCurrentStation());
        assertEquals(0, radio.getCurrentVolume());
        assertEquals(0, radio.getMinStation());
        assertEquals(9, radio.getMaxStation());
        assertEquals(0, radio.getMinVolume());
        assertEquals(100, radio.getMaxVolume());

    }
    @Test
    public void shouldCreateRadioWithCustomValues() {
        Radio radio = new Radio(5, 3, 8, 3, 99, 50);
        assertEquals(3, radio.getCurrentStation());
        assertEquals(5, radio.getCurrentVolume());
        assertEquals(3, radio.getMinStation());
        assertEquals(8, radio.getMaxStation());
        assertEquals(50, radio.getMinVolume());
        assertEquals(99, radio.getMaxVolume());
    }
}