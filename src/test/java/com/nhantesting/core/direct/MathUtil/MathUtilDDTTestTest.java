package com.nhantesting.core.direct.MathUtil;


import org.junit.Assert;
import org.junit.Test;
// câu lệnh này trong junit báo hiệu là sẽ loop qua cặp data để lấy cập data
// input/ expected nhồi vào hàm test

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
@RunWith(value = Parameterized.class)
public class MathUtilDDTTestTest {
    // ta sẽ trả về mảng 2 chiều  gồm nhiều cặp Expected || Input
    @Parameterized.Parameters // junit sẽ ngầm chạy loop qua từng dòng để lây ra từng cặp data input và expected
    // tên hàm không quan trong quan trọng là @
    public static Object[][] initData() {
        return new Integer[][] {
                                    { 0, 1 },
                                    { 1, 1 },
                                    { 2, 2 },
                                    { 3, 6 },
                                    { 4, 24 },
                                    { 5, 120 },
                                    { 6, 720 }
        };
    }

    // giả sử loop qua từng dòng của mảng, ta vẫn cần gán value của cột vào biến tương ứng input, expected
    @Parameterized.Parameter(value = 0) // value = 0 map với mảng cột 0 ở trên
    public int number; // biến map với value của cột 0 của mảng
    @Parameterized.Parameter(value = 1)
    public long expected; // kiểu long vì giá trị trả về của hàm getF(n) là long


    @Test
    public void getFactorial() {
        Assert.assertEquals(expected, MathUtil.getFactorial(number));
    }
    // @Test
    // public void testGetAddValid() {
    //     assertEquals(10, MathUtilDDTTest.getAdd(5, 5));
    // }
    
    // public void testGetAdd(long expected, int a, int b) {
    //     assertEquals(expected, MathUtilDDTTest.getAdd(a, b));
    // }


// mỗi DDT chỉ có 1 bộ data thôi không là junit không biết nó phải lấy từ bộ nào
// nên là hãy tạo 1 class mới đi
    // // test resversed key
    // @Parameterized.Parameters // junit sẽ ngầm chạy loop qua từng dòng để lây ra từng cặp data input và expected
    // // tên hàm không quan trong quan trọng là @
    // public static Object[][] initDataReversed() {
    //     return new Integer[][] {
    //                                 { 10, 1 },
    //                                 { 12, 21 },
    //                                 { 23, 32 },
                                    
                                    
    //     };
    // }

    // @Parameterized.Parameter(value =  0)
    // public long numTest;

    // @Parameterized.Parameter(value =  1)
    // public long resversedExpected;


    // @Test
    // public void testReversedValid() {
    //     Assert.assertEquals(resversedExpected, MathUtil.reverseNumber(numTest));
    // }
    

    

}
