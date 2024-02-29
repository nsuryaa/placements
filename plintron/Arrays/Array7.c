// Find the equilibrium index of an array.
#include <stdio.h>

int findEquilibriumIndex(int arr[], int n) {
  int sum = 0;
  for (int i = 0; i < n; ++i) {
    sum += arr[i];
  }

  int leftSum = 0;
  for (int i = 0; i < n; ++i) {
    int rightSum = sum - leftSum - arr[i];
    if (leftSum == rightSum) {
      return i;
    }
    leftSum += arr[i];
  }
  return -1; // No equilibrium index found
}

int main() {
    int arr[] = {-7, 1, 5, 2, -4, 3, 0};
    int size = sizeof(arr) / sizeof(arr[0]);

    int equilibriumIndex = findEquilibriumIndex(arr, size);
    if (equilibriumIndex != -1) {
        printf("Equilibrium index of the array: %d\n", equilibriumIndex);
    } else {
        printf("No equilibrium index found in the array.\n");
    }

    return 0;
}
