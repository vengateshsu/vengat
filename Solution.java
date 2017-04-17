import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
   public static void main(String[] args) {
System.out.println("Enter the number of elements:");
      Scanner obj = new Scanner(System.in); // use the Scanner class to read from stdin
     int n=obj.nextInt();
       int val[]=new int[n];
System.out.println("Enter the array elements:");
       for(int i=0;i<n;i++)
           {
           val[i]=obj.nextInt();
       }
       Arrays.sort(val);
       for(int i=0;i<n;i++)
       {
           if(val[i]==val[(i+1)%n])
                   System.out.println(val[i]);
       }
           
   }
}