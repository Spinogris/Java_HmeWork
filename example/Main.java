package org.example;

import java.util.Arrays;
import java.util.Random;

public class Main {
  public static void main(String[] args) {
//    Pair foo = Methods.Massiv();
//    System.out.println(foo.m1);
//    System.out.println(foo.m2);

    int[] lol = Methods.strictArray();
    System.out.println(Arrays.toString(lol));

    String grow = Methods.growing(Methods.strictArray());
    System.out.println(grow);
  }
}