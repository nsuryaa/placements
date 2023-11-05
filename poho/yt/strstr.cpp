#include <stdio.h>
#include<string.h>

int strstr(string s, string x) {
    int index = -1;
    int l;

    for (int i = 0; s[i] != '\0'; i++) {
        l = i;
        int flag = 0;
        if (s[i] == x[0]) {
            for (int j = 0; x[j] != '\0'; j++) {
                if (x[j] == s[i]) {
                    l++;
                    flag = 1;
                } else {
                    flag = 0;
                    break;
                }
            }
            if (flag == 1) {
                index = i;
                return index;
            }
        }
    }
    return index;
}
