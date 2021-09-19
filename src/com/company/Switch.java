package com.company;

import java.util.Scanner;

public class Switch {
    public void testSwitch(){
        char i;
        Scanner scan = new Scanner(System.in);
        i = scan.nextLine().toLowerCase().toCharArray()[0];
//{'a', 'e', 'i', 'o', 'u', 'y'}
        switch (i){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'y':{
                System.out.println("is a vowel");
            }
            break;
            default:{
                System.out.println("is a consonant");
            }

        }

    }
}
