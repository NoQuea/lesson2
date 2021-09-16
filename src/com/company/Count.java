package com.company;

import java.util.Scanner;

public class Count {
    public int countNumbers(){
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        int a = scan.nextInt();


        int min = Math.min(i, a);
        int max = Math.max(i, a);
        int sum = 0;
        for( i = min; i < max; i++)
        {
            sum += i;
            System.out.println(i);
        }
             sum =+ max;
        return sum;
    }

}
