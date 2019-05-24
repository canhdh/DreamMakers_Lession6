package com.k001.Lesson6;

public class Bai10 {
    public static boolean[] dd = new boolean[101];
    public static boolean check_prime(int x){
        for(int i = 2;i <= Math.sqrt(x);i++)
            if (x % i == 0) return  false;
        return  true;
    }
    public static boolean check_reverse(int x){
        int temp = x;
        int reverse = 0;
        while (temp > 0){
            reverse = reverse * 10 + temp % 10;
            temp /= 10;
        }
        return (x == reverse);
    }
    public static boolean check_fibo(int x){
        int total = 0;
        while (x > 0){
            total += x%10;
            x /= 10;
        }
        return dd[total];
    }

    public static boolean check(int x){
        return (check_fibo(x) && check_prime(x) && check_reverse(x));
    }

    public static void init(){
        int fibo_pre = 1,fibo_curent = 1,fibo_next;
        for(int i = 0;i < 100;i++) dd[i] = false;
        while (fibo_curent < 100){
            fibo_next = fibo_curent + fibo_pre;
            dd[fibo_curent] = true;
            fibo_pre = fibo_curent;
            fibo_curent = fibo_next;
        }
    }
    public static void main(String[] args) {
        init();
        System.out.println("List of satisfying number:");
        for(int i = 10000;i <= 9999999;i++)
            if (check(i)) System.out.println(i);
    }
}
