package pl.sda.tdd;
import org.assertj.core.api.AbstractIntegerAssert;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import static  org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.runners.Parameterized;

public class CalculatorTest2 {
    private Calculator calculator;
    @Before
    public  void setup(){
        calculator = new Calculator();
    }
    @Test
    public  void test1(){
        int result = calculator.add(3,2);
        assertEquals(5,result);
    }
    @Test
    public void test11(){
        AbstractIntegerAssert<?> notEqualTo = Assertions.assertThat(3 + 3)
                .as("3+3=6").isEqualTo(6)
                //.isNotEqualTo(5);
                .isLessThan(7);

    }

    @Test
    public  void test2(){
        int result = calculator.substract(3,2);
        assertEquals(1,result);
    }
    @Test
    public  void test3(){
        int result = calculator.multiply(3,2);
        assertEquals(6,result);
    }
    @Test
    //@Parameterized.Parameters({"12,4,16"})
    public  void test4(){
        int result = calculator.divide(4,0);
        assertEquals(4,result);
    }
}

