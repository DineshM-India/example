package com.ecs.collections;

import java.util.*;

public class TaxCalculation {
	public static void main(String[] args) 
    {   int n;
        double  sum = 0,dis,tax,cal,total;
        double qty,unpr;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter how many entries you want");
        n = s.nextInt();
        double a[] = new double[n];
        String des ;
        
        for(int i = 0; i < n ; i++)
        {
            System.out.println("Enter Description");
            des = s.next();
            System.out.println("Enter Quantity");
            qty = s.nextDouble();
            System.out.println("Enter Unit Price");
            unpr = s.nextDouble();
            a[i] = qty * unpr;
            sum = sum + a[i];
            System.out.println("Description : "+des+" QTY = "+qty+ " UnitPrice ="+unpr+" Amount ="+a[i]);
        }
        
         
           
        System.out.println("Enter Description");
            des = s.next();
        System.out.println("Enter UnitPrice");
            dis = s.nextDouble();
            System.out.println("Description : "+des+" UnitPrice ="+dis+" Amount ="+dis);
            sum = sum - dis;
            System.out.println("Enter TaxRate(%)");
            tax = s.nextDouble();
            cal=sum*(tax*0.01);
            total=sum+cal;
            System.out.println("------------------------");
            System.out.println("SubTotal:"+sum);
            System.out.println("TaxRate:"+tax);
            System.out.println("Tax:"+cal);
            System.out.println("Total:"+total);
        
    }

}
