package com.nhantesting.core.direct.MathUtil;

public class MathUtil {
    // hàm f() ta thiết kế có 2 tình huống xử lý
    // đưa data cà chớn vào
    // ví dụ ta có factorial [1, 20] lả chạy trên máy oke
    // 1. nếu ta nhập âm
    // 2. nếu nhập lớn hơn 20


    // public static long getFactorial(long n) {
    //     if (n < 0 || n > 20) {
    //         throw new IllegalArgumentException("n must be between 0 and 20");
    //     }
    //     long result = 1;
    //     for (int i = 2; i <= n; i++) {
    //         result *= i;
    //     }
    //     return result;
    // }

    public static long getFactorial(long n) {
        if (n < 0 || n > 20) throw new IllegalArgumentException("n must be between 0 and 20");
        if (n <= 1) return 1;
        return n * getFactorial(n - 1);
    }
    public static long getSum(int a, int b) {

        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("a and b must be more 0");
        } else {
            return a + b;
        }

    }
    public static boolean checkActive(int number) {
        if (number > 0) return true;
        return false;
    }

    public static int getMinus(int number) {
        if (number < 0) throw new IllegalArgumentException("Number need to more than 0");
        else {
            return number;
        }
    }
    public static boolean checkLogin(String username, String password) {
        if (username == null || password == null) {
            return false; // Dữ liệu rỗng
        }
        return username.equals("admin") && password.equals("123456");
    }

    public static long reverseNumber(long n) {
        long reversed = 0;
        while (n != 0) {
            long digit = n % 10;          // Lấy chữ số cuối
            reversed = reversed * 10 + digit; // Thêm vào số đảo ngược
            n /= 10;                      // Bỏ chữ số cuối
        }
        return reversed;
    }
}
