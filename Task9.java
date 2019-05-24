package com.k001.task;

import java.util.Scanner;

public class Task9 {
    public static void figuresSum(int n){
        int sum = 0;
        while (n != 0){
            sum += n % 10;
            n /= 10;
        }
        System.out.println("FiguresSum = " + sum);
    }

    public static void primaryFactorAnalysing(int n){
        int primaryFactor = 2;
        int numOfFactor = 0;
        if (n < 2) { System.out.println("Can't analysis!"); return; }
        System.out.print(n + " = ");
        while (n != 1){
            if (n % primaryFactor == 0){
                numOfFactor++;
                int quantityOfFactors = 0;
                while (n % primaryFactor == 0 && n != 0){
                    quantityOfFactors++;
                    n /= primaryFactor;
                }
                if (numOfFactor != 1) System.out.print(" + ");
                System.out.print(primaryFactor + "^" + quantityOfFactors);
            }
            else primaryFactor++;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number n = ");
        int n = scanner.nextInt();

        System.out.println("---------------Sum of figures of n--------------");
        figuresSum(n);
        System.out.println();

        System.out.println("---------Analyse n into primary factors---------");
        primaryFactorAnalysing(n);
        System.out.println();
    }
}
