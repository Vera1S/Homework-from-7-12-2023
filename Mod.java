package Homework;

public class Mod {
    public static void main(String[] args) {
//         Задание
//
//  0. Перевести число 333 из шестнадцатиричной в десятичную
//       3*16^2 + 3*16^1 + 3*16^0 = 3*256 + 3*16 + 3*1 = 768+48+3 = 819
        System.out.println(3*Math.pow(16, 2) + 3*Math.pow(16, 1) + 3*Math.pow(16, 0));

//  1. Разложить число 200345 на разряды в десятичной системе
         // 2*10^5 + 3*10^2 + 4*10^1 + 5*1^0 = 200 000 + 300 + 40 + 5
        System.out.println((2*100000) + (3*100) + (4*10) + (5*1));

//  2. Перевести 637 из десятичной в шестнадцатиричную и обратно (10->16 и 16->10)
//        10->16
//        637/16 = 39
//        637%16 = 13 - это от 0123456789ABCD
//        39/16 = 2
//        39%16 = 7
//        Ответ: 27D

//        16->10
//        6*16^2 + 3*16^1 + 7*16^0 = 6*256 + 3*16 + 7*1 = 1536+48+7 = 1591
        System.out.println(6*Math.pow(16, 2) + 3*Math.pow(16, 1) + 7*Math.pow(16, 0));

//  3. Перевести 637 из десятичной в двоичную
        // BINARY
//         переводим число 637 из 10 -> 2

//        637 / 2 = 318
//        637 % 2 = 1
//        318 / 2 = 159
//        318 % 2 = 0
//        159 / 2 = 79
//        159 % 2 = 1
//        79 / 2 = 39
//        79 % 2 = 1
//        39 / 2 = 19
//        39 % 2 = 1
//        19 / 2 = 9
//        19 % 2 = 1
//        9 / 2 = 2
//        9 % 2 = 1
//        2 / 2 = 1
//        2 % 2 = 0
//        1 / 2 = 0
//        1 % 2 = 1

//        Ответ: 1001111101

        int a = 637;
        System.out.println(a / 2);      // 318
        System.out.println(a % 2);          // 1

        System.out.println(318 / 2);    // 159
        System.out.println(318 % 2);        // 0

        System.out.println(159 / 2);    // 79
        System.out.println(159 % 2);        // 1

        System.out.println(79 / 2);     // 39
        System.out.println(79 % 2);         // 1

        System.out.println(39 / 2);     // 19
        System.out.println(39 % 2);         // 1

        System.out.println(19 / 2);     // 9
        System.out.println(19 % 2);         // 1

        System.out.println(9 / 2);      // 4
        System.out.println(9 % 2);          //1

        System.out.println(4 / 2);      // 2
        System.out.println(4 % 2);          // 0

        System.out.println(2 / 2);      // 1
        System.out.println(2 % 2);         // 0

        System.out.println(1 / 2);      // 0
        System.out.println(1 % 2);         // 1

        System.out.println(Integer.toBinaryString(a));
        System.out.println();

//     76543210 - степени
//  4. 11100111 перевести в десятичную
        // 1*2^7 + 1*2^6 + 1*2^5 + 0*2^4 + 0*2^3 + 1*2^2 + 1*2^1 + 1*2^0
        System.out.println(1*Math.pow(2,7) + 1*Math.pow(2,6) + 1*Math.pow(2,5) + 1*Math.pow(2,2) + 1*Math.pow(2, 1) + 1*Math.pow(2, 0));
//
//  5. Перевести 637 из десятичной в троичную
//        637 / 3 = 212
//        637 % 3 =     1
//        212 / 3 = 70
//        212 % 3 =     2
//        70 / 3 = 23
//        70 % 3 =      1
//        23 / 3 = 7
//        23 % 3 =      2
//        7 / 3 = 2
//        7 % 3 =       1
//        2 / 3 = 0
//         2 % 3 =      2
//        Ответ: 212121


    }

    }
