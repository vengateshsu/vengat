import java.util.Scanner;
class Subset{
 public static void main(String args[]){
int []a1=new int[30];
int []a2=new int[30];
int c=0;
Scanner sur=new Scanner(System.in);
int k=sur.nextInt();
int n=sur.nextInt();
for(int i=0;i<n;i++)
	{
	 a1[i]=sur.nextInt();
	}
for(int i=0;i<n;i++)
{
    a2[i]=sur.nextInt();	
 }
 for(int i=0;i<k;i++)
 {
	 for(int j=0;j<n;j++)
	 {
		 if(a1[i]==a2[j])
		 {
			 c++;
 }
	 }
 }
 if(c==k)
 {
	 System.out.println("a1 is subset of a2");
 }
 else
 {
	 System.out.println("a1 is notsubset of a2");
 }
 }
}
 