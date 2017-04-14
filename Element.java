import java.util.Scanner;
class Element{
 public static void main(String args[]){
int[]a=new int[1000];
Scanner sur=new Scanner(System.in);
int k=sur.nextInt();
for(int i=0;i<k;i++)
{
a[i]=sur.nextInt();
}
for(int i=0;i<k;i++)
{
for(int j=0;j<k;j++)
{
for(int m=0;m<k;m++)
{	
if(a[i]+a[j]==a[m])
{
System.out.println( +a[i] +a[j] +a[m]);
}
}
}
}
}
}