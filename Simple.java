import java.util.Scanner;
class Simple{
public static void main(String args[])
{
int sum=0;
int[] x=new int[20];
Scanner ob1=new Scanner(System.in);
int n=ob1.nextInt();
for(int i=0;i<n;i++){
x[i]=ob1.nextInt();
}
for(int i=0;i<n;i++){
sum=sum^x[i];
}
System.out.println("The one time repeat element is:"+sum);
}
}
