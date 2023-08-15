package org.example;

public class methods {

//  public static int countChars(String word, char simple) {
//    int countChar = 0;
//    String p = word.toLowerCase();
//    char c = Character.toLowerCase(simple);
//    for (int i = 0; i < p.length(); i++) {
//      if (p.charAt(i) == c) {
//        countChar++;
//      }
//    }
//    return countChar;
//  }
//
//  ====================================================================================
//
//  public static String mySubstr(String word, int length) {
//    String subString = "";
//    for (int i = 0; i < length; i++) {
//      subString = subString + word.charAt(i);
//    }
//    return subString;
//  }

//  ====================================================================================

//  static void printNumbers(int number) {
//    for (int i = number; i >= 1; i--) {
//      System.out.println(i);
//    }
//    System.out.println("finished");
//  }

//  ====================================================================================

// Напишите функцию makeItFunny(), которая принимает на вход строку и возвращает её копию,
// у которой каждый n-ный элемент переведен в верхний регистр. n – задается на входе в функцию.

// Для определения каждого n-ного элемента понадобится остаток от деления %.
// Подумайте, как его можно использовать.

// const text = "I never look back";
// Каждый третий элемент
// makeItFunny(text, 3); // "I NevEr LooK bAck"

  public static String makeItFunny(String str, int n) {
    StringBuilder result = new StringBuilder();
    for (int i = 0; i < str.length(); i++) {
      char letter = str.charAt(i);
      if ((i + 1) % n == 0) {
        letter = Character.toUpperCase(letter);
      }
      result.append(letter);
    }
    return result.toString();
  }

//  ====================================================================================


}


























