package com.sahil.basics;
import java.util.Scanner;
public class FooBaz
{
    public static void main(String[] args)
    {
        int n=0;
        int i=n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number");
        n = sc.nextInt();
        if (((n % 2) == 0) && ((n % 3) == 0))
        {
            System.out.println("FooBaz number");
        }
        else if ((n % 2) == 0)
        {
            System.out.println("Foo number");
        }
        else if ((n % 3) == 0)
        {
            System.out.println("Baz number");
        }
        else
        {
            System.out.println(n);
        }
    }
}

