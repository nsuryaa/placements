#include<stdio.h>
int main()
{
    int a[] = {1,3,5,7,9};
    int sum = 0;
    for(int i=0;i<4;i++)
    {
        sum += a[i];
    }
    printf("%d", sum);
    return 0;
}

// ANS : 16