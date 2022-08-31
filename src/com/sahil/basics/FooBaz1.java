package com.sahil.basics;

public class FooBaz1
{
    public static void main(String[] args)
    {
        int arr[] = new int[]{1, 2, 3, 4, 5};
        for (int i = 0; i < arr.length; i++)
        {
            int n=arr[i];
            if (((i % 2) == 0) && ((i % 3) == 0))
            {
                System.out.println(arr[i] + "FooBaz number");
            }
            else if ((i % 2) == 0)
            {
                System.out.println(arr[i] + "Foo number");
            }
            else if ((i % 3) == 0)
            {
                System.out.println(arr[i] + "Baz number");
            }
            else
            {
                System.out.println(arr[i]);
            }
        }

    }
}
