import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureConverterTest {

    private final TemperatureConverter converter = new TemperatureConverter();

    @org.junit.jupiter.api.Test
    void testFahrenheitToCelsius() {
        assertEquals(-17.78, converter.fahrenheitToCelsius(0), 0.01);
        assertEquals(0, converter.fahrenheitToCelsius(32), 0.01);
    }

    @org.junit.jupiter.api.Test
    void testCelsiusToFahrenheit() {
        assertEquals(32, converter.celsiusToFahrenheit(0), 0.01);
        assertEquals(-40, converter.celsiusToFahrenheit(-40), 0.01);
    }

    @org.junit.jupiter.api.Test
    void testIsExtremeTemperature() {
        assertTrue(converter.isExtremeTemperature(-41));
        assertTrue(converter.isExtremeTemperature(51));
        assertFalse(converter.isExtremeTemperature(0));
        assertFalse(converter.isExtremeTemperature(-40));

    }
}