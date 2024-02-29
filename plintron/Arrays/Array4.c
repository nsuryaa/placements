// 4. Count frequencies of all elements in an array.

#include <stdio.h>

#define MAX_SIZE 100 // Maximum size of the array

// Function to count frequencies of all elements in the array
void countFrequencies(int arr[], int size) {
    int freq[MAX_SIZE] = {0}; // Initialize frequency array with zeros

    // Iterate through the array and update frequencies
    for (int i = 0; i < size; i++) {
        freq[arr[i]]++; // Increment frequency for the current element
    }

    // Print frequencies of all elements
    printf("Element   Frequency\n");
    for (int i = 0; i < MAX_SIZE; i++) {
        if (freq[i] != 0) {
            printf("%d          %d\n", i, freq[i]);
        }
    }
}

int main() {
    int arr[] = {2, 3, 3, 2, 5, 6, 7, 2, 7, 8, 9};
    int size = sizeof(arr) / sizeof(arr[0]);

    printf("Frequencies of all elements in the array:\n");
    countFrequencies(arr, size);

    return 0;
}
