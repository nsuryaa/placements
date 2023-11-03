#include<stdio.h>
int main(){
	int i = 3;
	int *j;
	int **k;
	j = &i;
	k = &j;
	k++;
	printf("%d ",**k);
	return 0;
}