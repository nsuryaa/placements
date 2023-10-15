#include<stdio.h>
void solve()
{
    int a[] = {1,3,4,5,6};
    int sum = 0;
    for(int i=0;i<5;i++)
    {
        if(i%2 == 0)
        {
            sum = *(a + i);
        }
        else
        {
            sum = *(a - i); 
        }

    }
    printf("%d",sum);
}
    int main()
    {
        solve();
            return 0;
    }
// OUTPUT : 6