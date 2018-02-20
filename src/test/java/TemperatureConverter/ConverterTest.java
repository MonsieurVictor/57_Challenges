package TemperatureConverter;


import org.testng.Assert;
import org.testng.annotations.Test;
import com.chapter4.TemperatureConverter.Values;
import com.chapter4.TemperatureConverter.Converter;


import java.io.IOException;

public class ConverterTest {

    Values values = new Values();
    Converter converter = new Converter();

    @Test
    public void testFahrenheit() throws IOException {
        values.initialTemp = 451;
        values.typeOfInitialTemp = "Fahrenheit";
        Assert.assertEquals(converter.convertFromFahrenheit(values),232.8);
    }

    @Test
    public void testCelsius() throws IOException {
        values.initialTemp = 36.6;
        values.typeOfInitialTemp = "Celsius";
        Assert.assertEquals(converter.convertFromCelsius(values),97.9);
    }
}
