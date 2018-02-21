package BodyMassIndex;

import com.chapter4.BodyMassIndex.HumanProperties;
import com.chapter4.BodyMassIndex.BMICalculator;
import org.testng.Assert;
import org.testng.annotations.Test;


public class BMITest {

    HumanProperties human = new HumanProperties();
    BMICalculator calculator = new BMICalculator();

    @Test (groups = "unit")
    public void testWeightCalculation(){
        System.out.println("testing BMI... unit");
        human.height = 1.95;
        human.weight = 70;
        Assert.assertEquals(calculator.bmiCalculation(human), 18.41 );
    }

    @Test (groups = "web")
    public void testWeightCalculation2(){
        System.out.println("testing BMI...web");
        human.height = 1.95;
        human.weight = 90;
        Assert.assertNotEquals(calculator.bmiCalculation(human), 18.41 );
    }
}
