// Find the common elements in three sorted arrays.

#include <stdio.h>

void findCommonElements(int arr1[], int n1, int arr2[], int n2, int arr3[], int n3) {
  int i = 0, j = 0, k = 0;

  // Iterate until any array reaches its end
  while (i < n1 && j < n2 && k < n3) {
    // If elements are equal, print it and move all pointers
    if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
      printf("%d ", arr1[i]);
      i++;
      j++;
      k++;
    } else if (arr1[i] <= arr2[j]) {
      // If arr1[i] is smaller, move i
      i++;
    } else if (arr2[j] <= arr3[k]) {
        
      // If arr2[j] is smaller, move j
      j++;
    } else {
      // If arr3[k] is smaller, move k (potentially duplicate element)
      k++;
    }
  }

  printf("\n");
}

int main() {
  int arr1[] = {1, 2, 3, 4, 5};
  int n1 = sizeof(arr1) / sizeof(arr1[0]);
  int arr2[] = {2, 4, 5, 6};
  int n2 = sizeof(arr2) / sizeof(arr2[0]);
  int arr3[] = {2, 3, 5, 7};
  int n3 = sizeof(arr3) / sizeof(arr3[0]);

  printf("Common elements: ");
  findCommonElements(arr1, n1, arr2, n2, arr3, n3);

  return 0;
}
