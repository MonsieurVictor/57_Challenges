package BodyMassIndex;

import com.chapter4.BodyMassIndex.HumanProperties;
import com.chapter4.BodyMassIndex.BMICalculator;
import org.testng.Assert;
import org.testng.annotations.Test;


public class ConverterTest {

    HumanProperties human = new HumanProperties();
    BMICalculator calculator = new BMICalculator();

    @Test
    public void testWeightCalculation(){
        human.height = 1.95;
        human.weight = 70;
        Assert.assertEquals(calculator.bmiCalculation(human), 18.41 );
    }
}
