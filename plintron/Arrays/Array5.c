// Rotate an array by "K" elements.

#include <stdio.h>

void reverseArray(int arr[], int start, int end) {
  while (start < end) {
    int temp = arr[start];
    arr[start] = arr[end];
    arr[end] = temp;
    start++;
    end--;
  }
}

void rotateArray(int arr[], int n, int k) {
  k = k % n; // Handle k larger than n.
  if (k == 0) {
    return;
  }

  // Reverse the first k elements.
  reverseArray(arr, 0, k - 1);

  // Reverse the remaining elements.
  reverseArray(arr, k, n - 1);

  // Reverse the entire array to get the final result.
  reverseArray(arr, 0, n - 1);
}

int main() {
  int arr[] = {1, 2, 3, 4, 5, 6, 7};
  int n = sizeof(arr) / sizeof(arr[0]);
  int k = 3;

  rotateArray(arr, n, k);

  printf("Rotated array: ");
  for (int i = 0; i < n; i++) {
    printf("%d ", arr[i]);
  }
  printf("\n");

  return 0;
}
