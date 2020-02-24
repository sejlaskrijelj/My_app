package com.company;

import java.util.Scanner;

public class Sabiranje {

    static boolean jelDjeljiv(int x) {
        int a=x;
        int i=0;
        int cifra=0;
        while(a!=0) {
            cifra=a%10;
            i+=cifra;
            a/=10;
        }
        if(x%i==0 && x!=i)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {

        int n;
        Scanner ulaz= new Scanner(System.in);
        System.out.println("Unesite zelejni broj ");
        n= ulaz.nextInt();
        System.out.println("Brojevi koji su djeljivi sa sumoms vojih cifara su: ");
        for(int i=1; i<n; i++) {
            if(jelDjeljiv(i))
                System.out.print(i+" ");
                else
            continue;
        }

    }
}
