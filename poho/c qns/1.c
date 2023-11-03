#include<stdio.h>
int main(){
	int a = 130;
	char *ptr;
	ptr = (char *)&a;
	printf("%d ",*ptr);
	return 0;
}