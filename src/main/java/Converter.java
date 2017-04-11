/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Matthew
 */

import java.time.*;

public class Converter {
    
    public double CurrencyConvert(double dollars){
        double yuan = dollars*6.89;
        return yuan;
    }
    
    public LocalTime TimeConvert(String currTime){
        return null;
    }
    
    public double DistanceConvert(double miles){
        double kilometers = miles*1.60934;
        return kilometers;
    }
    
    public double WeightConversion(double pounds){
        double kilo;
        kilo = 0.453592 * pounds;
        return kilo;
    }
    
    public double SpeedConversion(double miles, double hours){
        double kilometer;
        kilometer = 1.60934 * miles;
        return kilometer/hours;
    }
}
