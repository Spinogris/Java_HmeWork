package org.example;

import java.util.Arrays;
import java.util.Random;

public class Main {
  public static void main(String[] args) {

    System.out.println(Main.averege());

    System.out.println(Main.sum3not5());

    System.out.println(Main.bigSum());

  }

  static int[] arrRand() {
    int[] arr = new int[10];
    Random rand = new Random();

    for (int i = 0; i < arr.length; i++) {
      int a = rand.nextInt(-50, 50);
      arr[i] = a;
    }
    return arr;
  }

  private static int averege() {
    int[] a = Main.arrRand();
    int av = 0;
    System.out.println(Arrays.toString(a));
    for (int i = 0; i < a.length; i++) {
      if (a[i] > 0) {
        av += a[i];
      }
    }
    return av;
  }

  private static int sum3not5() {
    int[] a = {10, 12, 15, 21, 30, 33};
    int sum = 0;
    System.out.println(Arrays.toString(a));
    for (int i = 0; i < a.length; i++) {
      if ((a[i] % 3) == 0 & (a[i] % 5) != 0) {
        sum += a[i];
      }
    }
    return sum;
  }

  private static int bigSum() {
    int[] a = Main.arrRand();
    System.out.println(Arrays.toString(a));
    int sum = 0;
    for (int i = 0; i < a.length - 1; i++) {
      if ((a[i] + a[i + 1]) > sum) {
        sum = a[i] + a[i + 1];
      }
    }
    return sum;
  }

}