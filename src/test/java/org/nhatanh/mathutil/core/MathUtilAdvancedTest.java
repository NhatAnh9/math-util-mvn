/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.nhatanh.mathutil.core;

import static com.nhatanh.mathutil.core.MathUtility.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 *
 * @author ACER
 */
public class MathUtilAdvancedTest {
    
//    hàm trả về mảng 2 chiều gồm nhiều dòng, 2 cột
//    0 -> 1
//    1 -> 1
//    2 -> 2
//    6 -> 720
//    mảng 2 chiều, cột 0 là n, cột 1 là expected
//    n     expected
    
    public static Object[][] initTestData() {
//        int a[] = {5, 10, 15, 20};
        Object testData[][] = {{0, 1},
                               {1, 1},
                               {2, 2},
                               {4, 24},
                               {5, 120}
                               };
        
        return testData;
    }
    
    @ParameterizedTest
    @MethodSource("initTestData")
    public void checkFactorialGivenRightArgumentReturnsWell(int n, long expexted) {
//                                                          cột 0       cột  1
        assertEquals(expexted,getFactorial(n));
    }
}

// BẮT NGOẠI LỆ THÍ SAO, TỨC LÀ HÀM CỦA TA GETF() TRẢ VỀ
// NGOẠI LỆ KHI ĐƯA n CÀ CHỚN -1, -2, N > 20
// JUNIT ĐƯA RA HÀM MỚI, AsertThrows()
// hàm này lại xài LAMBDA EXPRESSION, THỨ 5 CẤM VẮNG
// VÌ ÔNG SẼ GIẢNG CĂN BẢN VỀ LAMBDA LÀ GÌ
