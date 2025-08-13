package com.nhantesting.core.direct.MathUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.Assert;
@RunWith(value = Parameterized.class)
public class DriverLicenseDDTUtilTest {
    @Parameterized.Parameters
    public static Object[][] initData() {
        return new Object[][] { // age || expected
                        { 18, true },
                        { 17, false },
                        { 20, true },
                        { -5, IllegalArgumentException.class},
                        { -10, IllegalArgumentException.class}
        };
    }
    @Parameterized.Parameter(value = 0)
    public static int age;

    @Parameterized.Parameter(value = 1)
    public static Object expected;

    // @Test 
    // public void testDriverLicenseValid() {
    //     Assert.assertEquals(DriverLicenseUtil.isEligible(age), expected);
    // }

    // @Test(expected = IllegalArgumentException.class) 
    // public void testDriverLicenseInvalid() {
    //     DriverLicenseUtil.isEligible2(-4);
    // }

    // một cách rút gọn và sử dụng DDT
    @Test
    public void testDriverLicense() {
        if (expected instanceof Boolean) {
            Assert.assertEquals(DriverLicenseUtil.isEligible2(age), expected);
        } else if (expected instanceof Class) {
            // Assert.assertThrows((<Class <? extends Throwable> expected), () -> {
            //     DriverLicenseUtil.isEligible2(age);
            // });
            Assert.assertThrows((Class<? extends Throwable>) expected, () -> {
                DriverLicenseUtil.isEligible2(age);
            });
        }
    }

    
}
