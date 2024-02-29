// Rearrange positive and negative numbers in an array.

#include <stdio.h>

void swap(int *a, int *b) {
  int temp = *a;
  *a = *b;
  *b = temp;
}

void rearrange(int arr[], int n) {
  int i = 0, j = n - 1;
  while (i < j) {
    while (i < n && arr[i] < 0) i++; // Find the first positive element
    while (j >= 0 && arr[j] > 0) j--; // Find the last negative element
    if (i < j) {
      swap(&arr[i], &arr[j]); // Swap positive and negative elements
      i++;
      j--;
    }
  }
}
// void rearrange(int arr[], int n) {
//   int j = n - 1;
//   for (int i = 0; i < n; ++i) {
//     if (arr[i] > 0) {
//       swap(&arr[i], &arr[j]);
//       j--;
//     }
//   }
// }

int main() {
  int arr[] = {-5, 7, -2, 8, -1, 4, 1, -3};
  int n = sizeof(arr) / sizeof(arr[0]);
  rearrange(arr, n);
  printf("Rearranged array: ");
  for (int i = 0; i < n; ++i) {
    printf("%d ", arr[i]);
  }
  printf("\n");
  return 0;
}