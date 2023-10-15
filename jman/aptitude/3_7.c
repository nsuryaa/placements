#include<stdio.h>
int main()
{
    int a[] = {1,3,5,7,9};
    int sum = 0;
    for(int i=0;i<4;i++)
    {
        sum += a[i];
    }
    printf("%d",sum);
    return 0;
}



// Let's analyze the given C program:

// c

// #include<stdio.h>
// int main()
// {
//     int a[] = {1, 3, 5, 7, 9};
//     int sum = 0;
//     for(int i = 0; i < 4; i++)
//     {
//         sum += a[i];
//     }
//     printf("%d", sum);
//     return 0;
// }

// The program initializes an array a with values {1, 3, 5, 7, 9} and then uses a loop to calculate the sum of the first 4 elements of the array.

// Here's the step-by-step breakdown:

//     sum is initialized to 0.
//     The loop runs for i from 0 to 3 (inclusive).
//     In each iteration, it adds the value of a[i] to sum.
//     The loop adds a[0] + a[1] + a[2] + a[3] to sum.
//     The final value of sum is then printed.

// So, the output of the program will be:

// 16

// It is the sum of the first four elements of the array {1, 3, 5, 7, 9}.