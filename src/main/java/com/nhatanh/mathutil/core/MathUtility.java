/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nhatanh.mathutil.core;

/**
 *
 * @author User
 */
public class MathUtility {
    public static final double PI = 3.1415;

//    hàm này tính n! = 1.2.3...n
//    thiết kế hàm này như sau
//    0! = 1! = 1
//    ko có âm giai thừa. Nếu đưa -1!, -5!, -10!: CHỬI - NÉM NGOẠI LỆ
//    Vì giai thừa tăng rất nhanh, 20 giai thừa là vừa đủ cho long
//    long: 18 con số 0
//    21 giai thừa kiểu long chứa ko được
//    hàm chỉ cho phép n = 0..20
//    đưa n > 20; CHỬI, NÉM RA EXCEPTION
    //public static long getFactorial(int n) {
     // if (n < 0 || n > 20) throw new IllegalArgumentException("Invalid n. n must be between 0..20, please");
     //   if (n == 0 || n == 1) return 1;
     //   long product = 1; // Biến gom các tích nhân với nhau
     //  for (int i = 2; i <= n; i++) 
     //    product *= i;
     //   return product;
 //   }
     public static long getFactorial(int n) {
        if (n < 0 || n > 20) throw new IllegalArgumentException("Invalid n. n must be between 0..20, please");
        if (n == 0 || n == 1) return 1;
        
        return n * getFactorial(n-1);
       //đệ quy - recursion
    }
     //5!=1.2.3.4.5 = 4! .5=5 x 4!
     //4!= 4 x 3!
     //N! = N x (N-1)!
}   

// TDD: Test Driven Development là kĩ thuật viết code cí chất lượng bằng cách code và test case và test run được thực thi đan xen
// song song, vừa viết code, vừa test
// Công việc của QC và Developer có điểm giống nhau
// Đều phải thiết kế các test case và run chúng để coi đúng sai
// Test case run với app (QC) test case để run với code/hàm/class (Dev)
// QC và Dev khác nhau cơ bản là:
// Dev thì viết code/ viết app + thêm viết test
// QC ko viết code ra app, có thể viết code để tự động hóa thao tác
// Kiểm thử app
// Dev và QC đều phải thiết kế test case
// Test case là bộ data gốm phần input, expected dùng để đưa vào app/hàm
// để đo lường hàm đúng sai, và mô phỏng 1 tình huống xài app của user

// Test case có thể viết tự do, hoặc viết theo template

// Tự do: để test hàm getF() ta cần các test case sau
//          0! -> 1; 1! -> 1; 2! -> 2; 3! -> 6; 5! -> 120
// Đưa data vào và hy vọng trả về

// Giang hồ luôn viết theo template, 1 test case sẽ gồm nhiều info
// liên quan/nhiều mục cần điền info

// Test case #1: (mục đích test case): check getF() method with n = 0
// Steps/Procedures (các bước để run test case, input, click...)
//      1. Given n = 1
//      2. Call getF() with n = 1; getF(1) getF(n)
// Expected results (kết quả kì vọng)
//      getF(1) must return 1
//DDT: Data Driven Testing là kĩ thuật mở rộng , bổ sung thêm cho TDD trong đó
// việc viết code test đc tách riêng ra so với test data nghĩa là bộ dữ liệu test thường
// được đặt để ở 1 mảng 2 chiều hoặc để ở table, file txt, Excel sau đó ddc nhồi
//fill/map vào trong câu lệnh kiểm thử!!
//VIệc data tách riêng ra, sau đó fill trở lại hàm so sánh qua tên biến
//thì DDT còn đc gọi là parameterized testing

