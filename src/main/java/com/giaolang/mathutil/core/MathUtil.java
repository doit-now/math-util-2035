package com.giaolang.mathutil.core;

public class MathUtil {
    public static long getFactorial(int n) {
        long result = 1;  //CỐ TÌNH THỬ GITHUB ACTIONS CÓ PHÁT HIỆN RA CODE LỖI LOGIC, LỖI TÍNH TOÁN HAY KO!!!
        //fix lại từ 10 thành 1 để passed test case, để thấy màu xanh trên github

        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid n. n must be between 0 and 20");
        }
        //n đang ổn, làm vòng for mà tính dồn, nhân dồn vào result
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}

//CODE CHÍNH, CODE BASE, CODE DÂN DEV PHẢI LÀM