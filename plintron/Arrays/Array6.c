// Find the number of pairs with a given sum in an array.

#include <stdio.h>
#include <stdbool.h>

#define MAX_SIZE 100000 // Adjust this based on your expected input size

int countPairsWithSum(int arr[], int n, int sum) {
  // Create a hash table to store seen elements and their counts.
  bool hashTable[MAX_SIZE] = {false};

  int count = 0;
  for (int i = 0; i < n; i++) {
    // Check if the complement (required element) exists in the hash table.
    int complement = sum - arr[i];
    if (hashTable[complement]) {
      count++;
    }

    // Add the current element and its count to the hash table.
    hashTable[arr[i]] = true;
  }

  return count;
}

int main() {
  int arr[] = {1, 2, 3, 4, 5};
  int n = sizeof(arr) / sizeof(arr[0]);
  int sum = 6;

  int count = countPairsWithSum(arr, n, sum);
  printf("Number of pairs with sum %d: %d\n", sum, count);

  return 0;
}
