package com.nhantesting.core.direct.MathUtil;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(value = Parameterized.class)
public class ReversedNumberTest {
    // test resversed key
    @Parameterized.Parameters // junit sẽ ngầm chạy loop qua từng dòng để lây ra từng cặp data input và expected
    // tên hàm không quan trong quan trọng là @
    public static Object[][] initDataReversed() {
        return new Integer[][] {
                                    { 10, 1 },
                                    { 12, 21 },
                                    { 23, 32 },
                                    { -10 , -1 },
                                    { 1, 1 }
                                    
                                    
        };
    }

    @Parameterized.Parameter(value =  0)
    public long numTest;

    @Parameterized.Parameter(value =  1)
    public long resversedExpected;


    @Test
    public void testReversedValid() {
        Assert.assertEquals(resversedExpected, MathUtil.reverseNumber(numTest));
    }
}
