package by.belstu.it.lyskov.calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator;

    @BeforeEach
    void init() {
        calculator = new Calculator();
    }

    @Test
    void testPlusOperation() {
        String line = "111+12";
        Optional<Double> actual = calculator.solve(line);
        double expected = 123;
        assertTrue(actual.isPresent());
        assertEquals(expected, actual.get());
    }

    @Test
    void testMinusOperation() {
        String line = "534-690";
        Optional<Double> actual = calculator.solve(line);
        double expected = -156;
        assertTrue(actual.isPresent());
        assertEquals(expected, actual.get());
    }

    @Test
    void testMultiplyOperation() {
        String line = "17*42";
        Optional<Double> actual = calculator.solve(line);
        double expected = 714;
        assertTrue(actual.isPresent());
        assertEquals(expected, actual.get());
    }

    @Test
    void testDivideOperation() {
        String line = "1593/59";
        Optional<Double> actual = calculator.solve(line);
        double expected = 27;
        assertTrue(actual.isPresent());
        assertEquals(expected, actual.get());
    }

}