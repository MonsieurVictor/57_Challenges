package BodyMassIndex;

import com.chapter4.bodyMassIndex.HumanProperties;
import com.chapter4.bodyMassIndex.BMICalculator;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;




public class BMITest {

    HumanProperties human;
    BMICalculator calculator;

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("BeforeMethod creating objects");
        human = new HumanProperties();
        calculator = new BMICalculator();
    }



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
