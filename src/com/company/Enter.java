package com.company;

import java.util.Objects;
import java.util.Scanner;

public class Enter {
    public void enterTask(){

        Scanner scan = new Scanner(System.in);
        String i = scan.next();

        String a = "exit";


            if (!i.equals(a)) {
                System.out.println(i);
                i = scan.next();
            } else {
                System.out.println("exit from the system");
            }
        }
    }
