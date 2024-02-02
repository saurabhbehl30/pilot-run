package com.behl.pilotrun.programs.test.sample;

public class FiboancciSeries {

    public static void main(String[] args) {

//        Input: N = 10
//        Output: 0 1 1 2 3 5 8 13 21 34
//        Explanation: Here first term of Fibonacci is 0 and second is 1,
//            so that 3rd term = first(o) + second(1) etc and so on.

        int num1 = 0;
        int num2 =1;

        for(int i = 0; i <= 10; i ++) {
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;

        }
    }
}
