package com.nhantesting.core.direct.MathUtil;

public class DriverLicenseUtil {
    public static boolean isEligible(int age) {
        if (age < 0) throw new IllegalArgumentException("Age must be non-negative");

        if (age >= 18) return true;
        else 
            return false;
    }
    public static boolean isEligible2(int age) {
        if (age < 0) throw new IllegalArgumentException("Age must be non-negative");
        return age >= 18;
    }
}
