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
    
    }
    
    @Test
    public void TimeTest() {
    
    }
    
    @Test
    public void DistanceTest() {
    
    }
    
    @Test
    public void WeightTest() {
        double expected = 22.6796;
        double result = con.WeightConversion(50);
        assertEquals(expected, result);
        
    }
    
    @Test
    public void SpeedTest() {
        double expected = 72.4205;
        double result = con.SpeedConversion(45);
        assertEquals(expected, result);
    }
}
