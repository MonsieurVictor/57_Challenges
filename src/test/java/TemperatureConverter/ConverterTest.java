package TemperatureConverter;


import com.chapter4.TemperatureConverter.TemperatureValues;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.chapter4.TemperatureConverter.Converter;


import java.io.IOException;

public class ConverterTest {

    TemperatureValues temperatureValues = new TemperatureValues();
    Converter converter = new Converter();

    @Test (groups = "web")

    public void testFahrenheit() throws IOException {
        System.out.println("temperature web...");
        temperatureValues.initialTemp = 551;
        temperatureValues.typeOfInitialTemp = "Fahrenheit";
        Assert.assertEquals(converter.convertFtoK(temperatureValues),561.4833333333333);
    }

    @Test (groups = "unit")

    public void testCelsius() throws IOException {
        System.out.println("temperature unit...");
        temperatureValues.initialTemp = 36.6;
        temperatureValues.typeOfInitialTemp = "Celsius";
        Assert.assertEquals(converter.convertCtoK(temperatureValues),309.75);
    }
}
