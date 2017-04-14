import java.util.Scanner;
class Near{
 public static void main(String args[]){
int[]a=new int[30];
Scanner sur=new Scanner(System.in);
int k=sur.nextInt();
for(int i=0;i<k;i++)
{
a[i]=sur.nextInt();
}
for(int i=0;i<k;i++)
{
for(int j=i+1;j<k;j++)
{
if(a[i]+a[j]==0)
{
System.out.println("Near value of zero is" +a[j]);
}
}
}
}
}