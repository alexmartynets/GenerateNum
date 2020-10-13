import org.junit.Assert;
import org.junit.Test;
import test.GenerateNum;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GenerateNumTest {

    @Test
    public void testListWithoutGaps() {
        List<Integer> numbers = Arrays.asList(1, 2, 3);
        String result = GenerateNum.generateNum(numbers);
        Assert.assertEquals("004", result);
    }

    @Test
    public void testListWithGaps() {
        List<Integer> numbers = Arrays.asList(1, 3);
        String result = GenerateNum.generateNum(numbers);
        Assert.assertEquals("002", result);
    }

    @Test
    public void testListWithSingleNumber1() {
        List<Integer> numbers = Collections.singletonList(1);
        String result = GenerateNum.generateNum(numbers);
        Assert.assertEquals("002", result);
    }

    @Test
    public void testListWithSingleNumber2() {
        List<Integer> numbers = Collections.singletonList(5);
        String result = GenerateNum.generateNum(numbers);
        Assert.assertEquals("001", result);
    }

    @Test
    public void testListWithoutGapsNotSorted() {
        List<Integer> numbers = Arrays.asList(5, 1, 3, 2, 4, 6, 10, 7, 9, 8);
        String result = GenerateNum.generateNum(numbers);
        Assert.assertEquals("011", result);
    }

    @Test
    public void testListWithGapsNotSorted() {
        List<Integer> numbers = Arrays.asList(5, 3, 2, 6, 10, 7, 9, 8, 12);
        String result = GenerateNum.generateNum(numbers);
        Assert.assertEquals("004", result);
    }
}