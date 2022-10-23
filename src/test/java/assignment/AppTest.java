/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package assignment;

import static org.junit.Assert.*;

import java.io.*;

import org.junit.*;

import org.junit.Test;

public class AppTest {
    
  /**
     * Test of CalculateISBNCheck method, of class App.
     */
   @Test
    public void test1CalculateISBNCheck() {
        assertEquals ("304013341X",App.calculateISBNCheck(304013341));
    }
    
    @Test
    public void test2CalculateISBNCheck() {
        assertEquals ("1841462012",App.calculateISBNCheck(184146201));
    }
    
    @Test
    public void test3CalculateISBNCheck() {
        assertEquals ("1841462020",App.calculateISBNCheck(184146202));
    }
    
    /**
     * Test of isValidDNA method, of class App.
     */
    @Test
    public void test1IsValidDNA() {
        assertEquals (true,App.isValidDNA("ATAGCGGCAT"));
    }
    
    @Test
    public void test2IsValidDNA() {
        assertEquals (false,App.isValidDNA("ABCDEFHIJK"));
    }
    
    @Test
    public void test3IsValidDNA() {
        assertEquals (true,App.isValidDNA("atcgatcg"));
        
    }
    
    /**
     * Test of calculateCommon method, of class App.
     */
    @Test
    public void test1calculateCommon() {
        assertEquals (1,App.calculateCommon("Hello","Hi"));
        
    }
    @Test
    public void test2calculateCommon() {
        assertEquals (2,App.calculateCommon("Hello","Greetings"));
        
    }
    
    /**
     * Test of checkPalindrome method, of class App.
     */
    @Test
    public void test1checkPalindrome() {
        assertEquals (true,App.checkPalindrome(45554));
        
    }
    @Test
    public void test2checkPalindrome() {
        assertEquals (false,App.checkPalindrome(14651));
        
    }
    /**
     * Test of drawBarChart method, of class App.
     */
    @Test
    public void test1drawBarChart() {
        assertEquals (9,App.drawBarChart(12321));
        
    }
    
    @Test
    public void test2drawBarChart() {
        String expected = String.format("1: *2: **3: ***2: **1: *" ,
        System.lineSeparator(),
        System.lineSeparator());
        
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(baos);
        System.setOut(printStream);
        
        App.drawBarChart(12321);// call the drawBarChart method
        
      String[] lines = baos.toString().split(System.lineSeparator());
      String actual=lines[0];
      for (int i=1; i< lines.length ;i++)
            actual += lines[i];
       // checkout output
       Assert.assertEquals(expected,actual);
    }
}
