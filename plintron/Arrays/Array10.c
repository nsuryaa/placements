// Merge two sorted arrays into one.

#include <stdio.h>

// Function to merge two sorted arrays into one sorted array
void mergeArrays(int arr1[], int size1, int arr2[], int size2, int result[]) {
    int i = 0, j = 0, k = 0;

    // Compare elements from both arrays and insert them into the result array in sorted order
    while (i < size1 && j < size2) {
        if (arr1[i] <= arr2[j]) {
            result[k++] = arr1[i++];
        } else {
            result[k++] = arr2[j++];
        }
    }

    // Insert remaining elements from arr1 into the result array
    while (i < size1) {
        result[k++] = arr1[i++];
    }

    // Insert remaining elements from arr2 into the result array
    while (j < size2) {
        result[k++] = arr2[j++];
    }
}

// Function to print an array
void printArray(int arr[], int size) {
    for (int i = 0; i < size; i++) {
        printf("%d ", arr[i]);
    }
    printf("\n");
}

int main() {
    int arr1[] = {1, 3, 5, 7, 9};
    int size1 = sizeof(arr1) / sizeof(arr1[0]);

    int arr2[] = {2, 4, 6, 8, 10};
    int size2 = sizeof(arr2) / sizeof(arr2[0]);

    int result[size1 + size2]; // Initialize the result array with enough space

    printf("Array 1: ");
    printArray(arr1, size1);

    printf("Array 2: ");
    printArray(arr2, size2);

    mergeArrays(arr1, size1, arr2, size2, result);

    printf("Merged array: ");
    printArray(result, size1 + size2);

    return 0;
}