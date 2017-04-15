import java.util.Scanner;
class Array{
	 public static void main(String args[]){
	int []a=new int[50];
	System.out.println("Enter the number of array elements:");
	Scanner sur=new Scanner(System.in);
	int n=sur.nextInt();
	System.out.println("Enter the array elements:");
	for(int i=0;i<n;i++)
	{
		a[i]=sur.nextInt();
	}
	int k=a[0];
	for(int i=1;i<n;i++)
	{
		if(k==a[i])
	
  System.out.println("Repeat element is:"+a[i]);
}
	}
}