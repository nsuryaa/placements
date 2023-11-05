#include <stdio.h>

int main() {
    char far *s1, *s2;
    printf("%d %d", sizeof(s1), sizeof(s2));
    return 0;
}

// Ans : 4 2