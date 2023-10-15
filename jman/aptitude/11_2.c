#include<stdio.h>
void solve()
{
    int a=23;
    int res = a++ + ++a + a++;
    printf("%d",res);
}

// ANS : 73