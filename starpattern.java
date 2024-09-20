/*
// printing star 
import java.util.Scanner;

public class starpattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter how many number of stars you want in order ");
        int n = sc.nextInt();
        for(int line = 1; line <= n; line++)
        {
            for(int star = 1; star <= line ; star++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
} */


/* 

// printing inverted star

import java.util.Scanner;

public class starpattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("plz enter how many stars do you want to print ");
        int n = sc.nextInt();
        for(int line = 1; line <= 4; line ++)
        {
            for(int star = 1; star<= 4-line+1; star ++)
            {
                System.out.print("*");

            }
            System.out.println();
        }
    }
}
*/

/* 
// half peramid number pattern

import java.util.Scanner;

public class starpattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the length of peramid you want : ");
        int n = sc.nextInt();

        for(int line = 1; line <= n; line++)
        {
            for(int number = 1; number <= line; number++)
            {
                System.out.print(number + " ");

            }
            System.out.println();
        }
    }
}
*/



// printing characters 
import java.util.*;
public class starpattern {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter the length of peramid you want : ");
    int n = sc.nextInt();
    char ch ='A';

    for( int line = 1; line <= n; line++)
    {
        for(int chars = 1; chars <= line; chars ++)
        {
            System.out.print(ch);
            ch++;
        }
        System.out.println();
    }
 }
}
     