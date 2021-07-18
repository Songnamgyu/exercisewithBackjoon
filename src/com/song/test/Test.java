package com.song.test;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("두 정수를 입력해주세여");
        System.out.println("우선 첫번 째 정수를 입력하세여");
        int a = sc.nextInt();
        System.out.println("두번쨰 정수를 입력하세요");
        int b = sc.nextInt();

        int sum = a - b;
        System.out.println("1. a + b :" + sum);

        int minus = a-b;
        System.out.println("2. a - b : " + minus);

        int multi = a * b;
        System.out.println("3 . a * b : " + multi);

        int divide = a / b;
        System.out.println("4 . a / b : " + divide);

        int namuge = a % b;
        System.out.println("5 . a % b : " + namuge);

    }
}
