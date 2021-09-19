package com.company;

import java.util.Scanner;

public class Weather {
    public void weatherSwitch(){

        Scanner scan = new Scanner(System.in);

        String month = scan.next();
        switch (month){
            case "January":
            case "February":
            case "December":{
                System.out.println("This is winter");
            }
            break;
            case "March":
            case "April":
            case "May":{
                System.out.println("This is Spring");
            }
            break;
            case "June":
            case "July":
            case "August":{
                System.out.println("This is Summer");
            }
            break;
            case "September":
            case "October":
            case "November":{
                System.out.println("This is Autumn");
            }
            break;
            default:{
                System.out.println("There is no such month");
            }

        }
    }

}
