//1.Inversion count of array
import java.util.*;
public class Main
{
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int t=sc.nextInt();
   while(t>0)
   {
   int n=sc.nextInt();
   int count=0;
   int a[]=new int[n];
   for (int i=0;i<n;i++)
     a[i]=sc.nextInt();
   for(int i=0;i<n;i++)
    for(int j=i+1;j<n-1;j++)
    {
        if(a[i]>a[j])
        {
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            count++;
        }
    }
   
System.out.println(count);
t--;
   }
}
}
