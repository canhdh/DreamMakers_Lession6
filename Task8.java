package com.k001.task;

public class Task8 {
    public static void main(String[] args) {
        System.out.println("6 figures reversible numbers:");
        for (int i = 100; i <= 999; i++) {
            int original = i;
            int reversibleNum = i;

            //reverse and join
            while (original != 0){
                reversibleNum = reversibleNum * 10 + original % 10;
                original /= 10;
            }

            System.out.println("number reversation: " + reversibleNum);
        }
    }
}
