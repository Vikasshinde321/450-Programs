package simple;

import java.util.Scanner;

public class Power {
    public static void main(String args[])
    {
        int n,p=3,result=1;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=1;i< p;i++)
        {
          result=n*p;
        }
        System.out.println("power="+result);
    }
    
}
