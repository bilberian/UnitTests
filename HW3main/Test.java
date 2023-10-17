package HW3main;
import org.junit.jupiter.api.*;
import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


public class Test {
    private HW3unittest task;

    public void setup(){
        task = new HW3unittest();
    }

    @ParameterizedTest
    @ValueSource(ints = {2, 6, 8, 16})
    public void getTrue1(int num){
        assertTrue(task.evenOddNumber(num));
    }

    @ParameterizedTest
    @ValueSource(ints = {5, 11, 29, 7})
    public void getFalse1(int num){
        assertFalse(task.evenOddNumber(num));
    }

    @ParameterizedTest
    @ValueSource(ints = {26, 99, 70, 33})
    public void getTrue2(int num){
        assertTrue(task.numberInInterval(num));
    }

    @ParameterizedTest
    @ValueSource(ints = {5, 11, 119, 17})
    public void getFalse2(int num){
        assertFalse(task.numberInInterval(num));
    }
}
