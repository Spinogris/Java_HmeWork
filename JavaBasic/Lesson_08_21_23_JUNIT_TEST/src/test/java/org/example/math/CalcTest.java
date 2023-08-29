package org.example.math;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class CalcTest {
  Calc calc;
  String result;

  // Метод, который выполняется перед запуском каждого @Test
  @Before
  public void init() {
    calc = new Calc();
    result = "";
  }

  @Test
  public void divTestIntDivInt() {
    int x = 10;
    int y = 5;
    double expected =2.0;

    double actual = calc.div(x, y);
    result = String.format("divTestIntDivInt: %d / %d = %f [%f]", x, y, actual, expected);
    Assert.assertEquals(expected, actual, 0.05);
  }

  @Test
  public void divTestIntDivDouble() {
    int x = 100;
    int y = 35;
    double expected = 2.85;

    double actual = calc.div(x, y);
    result = String.format("divTestIntDivDouble: %d / %d = %f [%f]", x, y, actual, expected);
    Assert.assertEquals(expected, actual, 0.05);
  }

  @Test
  public void divTestIntDivZero() {
    int x = 123;
    int y = 0;
    result = String.format("divTestIntDivZero - true");
    Assert.assertThrows(
            ArithmeticException.class,
            () -> calc.div(x, y));
  }

  @Test(expected = ArithmeticException.class)
  public void divTestIntDivZero2() {
    int x = 123;
    int y = 0;
    result = String.format("divTestIntDivZero - true");
    calc.div(x, y);
  }

  @Test
  public void isEvenTestEven() {
    int x = 10;
    boolean actual = calc.isEven(x);
    Assert.assertTrue(actual);
  }

  @Test
  public void isEvenTestOdd() {
    int x = 11;
    boolean actual = calc.isEven(x);
    Assert.assertFalse(actual);
  }

  @Test
  public void barTestExpectedNull() {
    String actual = calc.bar();
    Assert.assertNull(actual);
  }

  // Метод, который выполняется после запуском каждого @Test
  @After
  public void cancelTest() {
    System.out.println(result + " -> " + LocalTime.now());
  }
}