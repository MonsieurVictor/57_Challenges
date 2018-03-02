package arrayRotation;

import com.chapter4.arrayRotation90Degrees.App;
import com.chapter4.arrayRotation90Degrees.ArrayVisualizer;
import org.testng.annotations.Test;

public class ArrayRotationTest {

    @Test
    public void arrayRotationTest() {
        ArrayVisualizer tv = new ArrayVisualizer();

        int [][] arr = {
                {0, 1, 2}, // M = 2
                {3, 4, 5}, // N = 3
                {6, 7, 8}, // N = 3
        };
        tv.visualizeArrays(arr);

        int [][] r = App.rotateArray(arr);

        tv.visualizeArrays(r);

        System.out.println(r);
    }
}
