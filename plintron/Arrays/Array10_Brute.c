#include <stdio.h>

void mergeAndSort(int arr1[], int size1, int arr2[], int size2) {
    int mergedSize = size1 + size2;
    int mergedArray[mergedSize];

    // Merge the arrays
    for (int i = 0; i < size1; i++)
        mergedArray[i] = arr1[i];
    for (int i = 0; i < size2; i++)
        mergedArray[i + size1] = arr2[i];

    // Sort the merged array (bubble sort)
    for (int i = 0; i < mergedSize; i++) {
        for (int j = 0; j < mergedSize - i - 1; j++) {
            if (mergedArray[j] > mergedArray[j + 1]) {
                int temp = mergedArray[j];
                mergedArray[j] = mergedArray[j + 1];
                mergedArray[j + 1] = temp;
            }
        }
    }

    // Print the merged and sorted array
    printf("Merged and sorted array: ");
    for (int i = 0; i < mergedSize; i++)
        printf("%d ", mergedArray[i]);
    printf("\n");
}

int main() {
    int arr1[] = {1, 23, 43, 54, 87};
    int size1 = sizeof(arr1) / sizeof(arr1[0]);

    int arr2[] = {-45, 0, 4};
    int size2 = sizeof(arr2) / sizeof(arr2[0]);

    mergeAndSort(arr1, size1, arr2, size2);

    return 0;
}