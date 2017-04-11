/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Matthew
 */
public class ConverterTests {
    
    Converter con;
    
    public ConverterTests() {
        con = new Converter();
    }

    @Test
    public void CurrencyTest() {
        System.out.println("CurrencyConvert");
        double dollars = 5;
        Converter instance = new Converter();
        double expResult = 34.45;
        double result = instance.CurrencyConvert(dollars);
        System.out.println("Expected Result: " + expResult);
        System.out.printf("Result: %.2f\n", result);
        assertEquals(expResult, result);
    }
    
    @Test
    public void TimeTest() {
    
    }
    
    @Test
    public void DistanceTest() {
        System.out.println("\nDistanceConvert");
        double miles = 5;
        Converter instance = new Converter();
        double expResult = 8.0467;
        double result = instance.DistanceConvert(miles);
        System.out.println("Expected Result: " + expResult);
        System.out.printf("Result: %.4f\n", result);
        assertEquals(expResult, result);
    }
    
    @Test
    public void WeightTest() {
    
    }
    
    @Test
    public void SpeedTest() {
    
    }
}
