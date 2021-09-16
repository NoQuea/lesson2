package com.company;

public class Array {
    public void moreAndLess(){
        int[] array = {23, 24, 10, 1023, -1 , 0};

        int min = array[0];
        int max = array[0];

        for (int i = 0; i<array.length; i ++){

                if(array[i]>max){
                    max = array[i];
                }
                else if(array[i]<min){
                    min = array[i];
                }
            }

        System.out.println("Largest is  " + max);
        System.out.println("Smallest is  " + min);
    }

}


