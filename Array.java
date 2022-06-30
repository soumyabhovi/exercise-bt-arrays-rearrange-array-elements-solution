package com.java.stackroute.array;

import java.util.Scanner;

public class Array {
    //Array size Validator
    public boolean inputArraySizeValidator(int n){
        if(n<=0)
            return false;
        return true;
    }

    //Input Array Validator(sorted or not)
    public boolean inputArrayValidator(int[] a){
        if(a.length==0||a.length==1)
            return true;
        for(int i=1;i<a.length;i++)
            if (a[i - 1] > a[i])
                return false;

        return true;

        }
    public static int[] computeRearrengedArray(int[] a) {
        int temp[] = a.clone();
        int low = 0;
        int high = a.length - 1;
        boolean flag = true;
        for (int i = 0; i < a.length; i++) {
            if (flag)
                a[i] = temp[high--];
            else
                a[i] = temp[low++];

            flag = !flag;
        }
        return a;
    }



    public void displayResult(int a[]) {

            for (int i : a) {
                System.out.print(" "+i);
            }

        }

    public void inputAcceptor(){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();

        if(!inputArraySizeValidator(n))
            System.out.println("Give proper input");

        else {
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            if (!inputArrayValidator(a))
                System.out.println("Give sorted array");
            else {


                int[] temp = Array.computeRearrengedArray(a);

                new Array().displayResult(temp);
            }
        }
    }

    public static void main(String[] args) {
        new Array().inputAcceptor();
    }
}
