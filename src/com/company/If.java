package com.company;


import java.util.Scanner;

public class  If {

    public void testIfTask() {

        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'y'};
        boolean isVowel=false;
        char i;
        Scanner scan = new Scanner(System.in);
        i = scan.nextLine().toLowerCase().toCharArray()[0];

        for(char c : vowels) {
            if(i == c){
                isVowel=true;
            }
        }
        if(isVowel){
            System.out.println("letter "+i+" is a vowel ");
        }
        else
            System.out.println("letter "+i+" is a consonant ");
    }

}


