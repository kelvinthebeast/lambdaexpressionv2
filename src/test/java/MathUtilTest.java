
// import org.junit.jupiter.api.Test;
// // import org.junit.jupiter.params.ParameterizedTest;
// import org.junit.jupiter.api.function.Executable;

// import static org.junit.jupiter.api.Assertions.*;
// import com.nhantesting.core.direct.MathUtil.MathUtil;
// public class MathUtilTest {
//     // không thể so sánh ngoại lệ, chỉ biết là ngoại lệ nó chỉ có hoặc không, việc đánh giá ngoại lệ rất khó nói
//     // assertEqual không thể dùng để so sánh ngoại lệ được, ta có biện pháp khác là assertThrow
//     @Test()
//     void testSumInvalid() {
//         assertThrows(IllegalArgumentException.class, () -> MathUtil.getSum(-1, -2));
//     }
//     @Test
//     void testSumValid() {
//         assertEquals(5, MathUtil.getSum(2, 3));
//     }
//     @Test
//     void testFactorialInvalid3() {
//         assertEquals(1, MathUtil.getFactorial(1));
//     }
//     @Test
//     void testFactorialInvalid2() {
//         long expected = 120;
//         assertEquals(expected, MathUtil.getFactorial(5));
//     }
//     @Test
//     void testFactorialValid() {
//         assertEquals(720, MathUtil.getFactorial(6));
//         assertEquals(1, MathUtil.getFactorial(0));
//         assertEquals(5040, MathUtil.getFactorial(7));
//     }

//     @Test
//     void testFactorialInvalid() {
//         assertThrows(IllegalArgumentException.class, () -> MathUtil.getFactorial(-1));
//         assertThrows(IllegalArgumentException.class, () -> MathUtil.getFactorial(21));
//     }

//     @Test
//     void testActiveValid() {
//         assertEquals(true, MathUtil.checkActive(10));
//     }

//     @Test
//     void testGetMinusValid() {
//         assertEquals(20, MathUtil.getMinus(20));
//     }

//     @Test
//     void testGetMinusInvalid() {
//         assertThrows(IllegalArgumentException.class, () -> MathUtil.getMinus(-20));
//     }
//     // cách khác để bắt ngoại lệ xuất hiện, viết tự nhiên hơn, liên quan đến lambda expresion
//     // chỉ xảy ra khi chơi với inheritance/ interface
//     // chỉ xảy ra khi chơi với interface mà chỉ duy nhất 1 hàm abstract
//     // interface chỉ có 1 hàm duy nhất, gọi là functional interface

//     @Test
//     void testGetFactorialThrowsExceptionLambdaVersion() {
//         //assertThrows(tham số 1: loại  ngoại lệ muốn so sánh, thamn số 2: đoạn code chạy văng ra ngoại lệ)
//         assertThrows(IllegalArgumentException.class, new Executable() {
//             @Override
//             public void execute() throws Throwable {
//                 MathUtil.getFactorial(-1000);
//             }
//         });
//     }

//     @Test
//     void testGetFactorialThrowsExceptionLambdaVersion2() {
//         //assertThrows(tham số 1: loại  ngoại lệ muốn so sánh, thamn số 2: đoạn code chạy văng ra ngoại lệ)
//         assertThrows(IllegalArgumentException.class, () -> MathUtil.getFactorial(-100));
//     }

//     // bắt hàm có ném về ngoại lệ hay không khi n cà chớn
//     // có ném, tức là hàm chạy đúng thiết kế -> xanh
//     @Test
//     public void testGetFactorialThrowsExceptionTryCatchVersion() {
//         try {
//             MathUtil.getFactorial(-10);
//         } catch (Exception e) {
//             // bắt try catch là junit đã ra màu xanh do chủ động kiểm soát ngoại lệ
//             // nhưng không chắc ngoại lệ mình cần có xuất hiện hay không??
//             // có đoạn code kiểm soát ngoại lệ illegalArgumentException hay không
//             // throw IllegalArgumentException.class;
//             System.out.println("msg; "  + e.getMessage());
//             assertEquals("n must be between 0 and 20", e.getMessage());
//         }
//     }
//     @Test
//     public void testGetMinusInvalid2() {
//         assertThrows(IllegalArgumentException.class,  () -> { MathUtil.getMinus(-10); });
//     }

//     @Test
//     public void testGetMinusInvalid3() {
//         try {
//             MathUtil.getMinus(10);
//         } catch (Exception e) {

//             assertEquals("Number need to more than 0", e.getMessage());
//         }
//     }

//     @Test
//     public void testGetMinusInvalid4() {
//         assertThrows(IllegalArgumentException.class,  () -> { MathUtil.getMinus(-10); });
//     }

//     @Test
//     public void checkLoginUserNameValid() {
//         assertEquals(true, MathUtil.checkLogin("admin", "123456"));
//     }
//     @Test
//     public void testNullUserAndPassword() {
//         assertEquals(false, MathUtil.checkLogin("", ""));
//     }

//     @Test
//     public void testFalsePassword() {
//         // assertEquals(false, MathUtil.checkLogin("admin", "12345"));
//         assertTrue(MathUtil.checkLogin("admin", "123456"));
//     }
// }


