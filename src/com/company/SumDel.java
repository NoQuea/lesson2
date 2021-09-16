package com.company;

public class SumDel {
    public void sum(){
        int a = 1;
        int b = 27;
        int sum = 0;

        while (true){

            int count = a;

            if (count % 3 == 0){

                sum = sum + count;

            }
            a++;
            if (a == b){

                break;

            }

        }
        System.out.println(sum);
    }
}
