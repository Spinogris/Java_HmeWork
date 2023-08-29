package org.example.utils;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ArrayUtilsTest {
  ArrayUtils aUtild;

  @Before
  public void init() {
    aUtild = new ArrayUtils();
  }

  @Test
  public void maxIndexOfTestFindMaxPosition1() {
    int[] array = {1, 5, 4, 3, 1};
    int expectedPosition = 1;

    int actualPosition = aUtild.maxIndexOf(array);
    Assert.assertEquals(expectedPosition, actualPosition);
  }

  @Test
  public void maxIndexOfTestFindMaxPosition2() {
    int[] array = {11, 5, 4, 3, 1};
    int expectedPosition = 0;

    int actualPosition = aUtild.maxIndexOf(array);
    Assert.assertEquals(expectedPosition, actualPosition);
  }

  @Test
  public void maxIndexOfTestFindMaxPosition3() {
    int[] array = {11, 5, 4, 3, 111};
    int expectedPosition = 4;

    int actualPosition = aUtild.maxIndexOf(array);
    Assert.assertEquals(expectedPosition, actualPosition);
  }

  @Test
  public void maxIndexOfTestFindMaxPosition4() {
    int[] array = {};
    int expectedPosition = -1;

    int actualPosition = aUtild.maxIndexOf(array);
    Assert.assertEquals(expectedPosition, actualPosition);
  }

  @Test
  public void maxIndexOfTestFindMaxPosition5() {
    int[] array = null;
    int expectedPosition = -1;

    int actualPosition = aUtild.maxIndexOf(array);
    Assert.assertEquals(expectedPosition, actualPosition);
  }
}