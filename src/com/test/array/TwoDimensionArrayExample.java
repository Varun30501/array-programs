package com.test.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TwoDimensionArrayExample {

    public static void main(String[] args) throws NumberFormatException, IOException {
        
        
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number of rows:");
        int rows=Integer.parseInt(bufferedReader.readLine());
        
        System.out.println("Enter number of columns:");
        int cols=Integer.parseInt(bufferedReader.readLine());
        
        int ar[][]=new int[rows][cols];
        
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                System.out.println("Enter element at row number "+i+" and column number "+j);
                ar[i][j]=Integer.parseInt(bufferedReader.readLine());
            }
        }
        
        System.out.println("===============================================================+");
        
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                System.out.print(ar[i][j]+" ");
                
            }
            System.out.println();
        }
        int ar1[][] = {
        		{1,2},
        		{3,4}
        };
        
       
        			
        }
        
        
        

    }


