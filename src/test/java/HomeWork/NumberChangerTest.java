package HomeWork;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;


@RunWith(JUnitParamsRunner.class)
public class NumberChangerTest {

    @Test
    @Parameters({
            "1, 1",
            "4, 4",
            "3, Fizz",
            "5, Buzz",
            "15, FizzBuzz"
    })
    public void notChangeNumberTest(int input, String expected) {
        Assert.assertEquals(expected, NumberChanger.changeNumber(input));
    }

    @Before
    public void before(){
      NumberChanger numberChanger = new NumberChanger();
    }
}
