package com.k001.Lesson6;

import java.math.BigInteger;
import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n;
        n = cin.nextInt();
        BigInteger fibo_pre = new BigInteger("1",10);
        BigInteger fibo_current = new BigInteger("1",10);
        BigInteger fibo_next;
        while (n > 1){
            fibo_next = fibo_current.add(fibo_pre);
            fibo_pre = fibo_current;
            fibo_current = fibo_next;
            n--;
        }
        System.out.println(fibo_current);
    }
}
