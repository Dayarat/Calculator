package com.company;

import java.util.Scanner;
public class Main {

    public static double sum1(int a, int b){
        double sum1=a+b;
        return sum1;
    }

    public static double dif1(int a, int b){
        double dif1=a-b;
        return dif1;
    }

    public static double mult1(int a, int b){
        double mult1=a*b;
        return mult1;
    }

    public static double div1(int a, int b){
        double div1=a/b;
        return div1;
    }

    public static void main(String[] args) {
        Scanner sun = new Scanner(System.in);
        double sum,dif,mult,div;
        int x,num1, num2;

        System.out.println("press num 1 for sum");
        System.out.println("press num 2 for diff");
        System.out.println("press num 3 for multi");
        System.out.println("press num 4 for divid");
        System.out.println("press ur option :");
        x=sun.nextInt();

        System.out.println("enter u 1st num :");
        num1=sun.nextInt();
        System.out.println("enter u 2nd num :");
        num2=sun.nextInt();

        switch (x){
            case 1:
                sum=sum1(num1,num2);
                System.out.println("the answer is :"+sum);
                break;

            case 2:
                dif=dif1(num1,num2);
                System.out.println("the answer is :"+dif);
                break;

            case 3:
                mult=mult1(num1,num2);
                System.out.println("the answer is :"+mult);
                break;

            case 4:
                div=div1(num1,num2);
                System.out.println("the answer is :"+div);
                break;

            default:
                System.out.println("invalid");


        }




    }
    }

