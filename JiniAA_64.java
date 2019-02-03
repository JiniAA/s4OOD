import java.io.*;
import java.util.Scanner;
import java.lang.*;
class JiniAA_64
    {
      public static void main(String args[])
          {
             int n;
             Scanner s=new Scanner(System.in);
             System.out.println("Enter the number of rows in the triangle");
             n=s.nextInt();
             pattern(n);
          }
      static void pattern(int n)
                         { 
                           int i,j,space,k=0,temp=n;
                           // printing up triangle
                           for(i=1;i<=n;i++)
                              {
                                //spacing
                                  for(j=1;j<=(temp-1);j++)
                                     {
                                       System.out.print(" ");
                                     }
                                  while(k!=(2*i-1))
                                       {
                                         if((k==0)||(k==1)||(k==((2*i)-2))||(k==((2*i)-3)))
                                           System.out.print("1");
                                         else
                                           System.out.print(" ");
                                         k++;
                                       }
                                  k=0;
                                  temp=temp-1;
                                //next row
                                  System.out.println();
                              }
                            n--;
                            temp=1;
                           //second triangle printing
                           for(i=n;i>=1;i--)
                              {
                                 //space printing
                                 for(j=1;j<=temp;j++)
                                    {
                                      System.out.print(" ");
                                    }
                                //printing 1
                                k=0;
                                while(k!=((2*i)-1))
                                     {
                                      if((k==0)||(k==1)||(k==((2*i)-2))||(k==((2*i)-3)))
                                        System.out.print("1");
                                      else
                                        System.out.print(" ");
                                      k++;
                                     }
                                System.out.println();
                                temp=temp+1;
                              }
                           System.out.println();
                         }
    }