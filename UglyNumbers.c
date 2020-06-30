/*2.Write a C Program to generate first n Ugly Numbers*/
#include <stdio.h>

int main()
{
    int n,m,count=0;
    printf("enter the range\n");
    scanf("%d",&m);
    scanf("%d",&n);
    if(m==1)
    {
        count++;
        printf("1 ");
    }
    for(int i=m;i<=n;i++)
        {
            if(i%2==0 || i%3==0 || i%5==0)
            {
                if(i%7==0 || i%13==0)
                {
                   
                }
                else
                {
                    printf("%d ",i);
                count++;
                }
            }
        }
        printf("\nThere are %d ugly numbers",count);
    return 0;
}
