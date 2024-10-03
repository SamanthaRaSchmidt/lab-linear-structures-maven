package edu.grinnell.csc207.util;

import edu.grinnell.csc207.linear.Stack;
import edu.grinnell.csc207.linear.LinkedStack;

import java.io.PrintWriter;

/**
 * Assorted utilities for working with strings.
 * 
 * @author Samuel A. Rebelsky
 * @author Your Name Here
 */ 
public class StringUtils {
  // +------------------+--------------------------------------------
  // | Provided methods |
  // +------------------+
    
  /**
   * Determine whether the parens match in string.
   * @throws Exception 
   */
  public static boolean checkMatching(String str) throws Exception {
    Stack<Character> parens = new LinkedStack<Character>();
    Boolean isParen = false;

    for(int i = 0; i<str.length(); i++){
      if(str.charAt(i) == '(' || str.charAt(i) == '[') {
        parens.push(str.charAt(i));
        isParen = true;
      }

      if(str.charAt(i) == ')' || str.charAt(i) == ']' && isParen) {
        while (!parens.isEmpty()) {
          parens.pop();
          isParen = false;
        }
      }
    }
    if (parens.isEmpty()) {
      return true;
    } else {
      return false;
    }
    
  } // checkMatching
} // class StringUtils    

