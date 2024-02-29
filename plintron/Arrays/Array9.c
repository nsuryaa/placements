// Find the majority element in an array.

#include <stdio.h>

// Function to find the majority element in an array
int findMajority(int arr[], int size) {
    int candidate = 0; // Initialize the candidate for the majority element
    int count = 0; // Initialize the count of occurrences of the candidate

    // Find the candidate for the majority element
    for (int i = 0; i < size; i++) {
        if (count == 0) {
            candidate = arr[i]; // Set the current element as the candidate
            count = 1; // Reset the count to 1
        } else if (arr[i] == candidate) {
            count++; // Increment count if the current element matches the candidate
        } else {
            count--; // Decrement count if the current element does not match the candidate
        }
    }

    // Verify if the candidate is the majority element
    count = 0; // Reset the count
    for (int i = 0; i < size; i++) {
        if (arr[i] == candidate) {
            count++; // Count occurrences of the candidate
        }
    }

    // If the candidate occurs more than n/2 times, it's the majority element
    if (count > size / 2) {
        return candidate;
    }

    // No majority element found
    return -1;
}

int main() {
    int arr[] = {2, 3, 4, 4, 4, 4, 4, 6, 7, 8, 4};
    int size = sizeof(arr) / sizeof(arr[0]);

    int majorityElement = findMajority(arr, size);
    if (majorityElement != -1) {
        printf("Majority element in the array: %d\n", majorityElement);
    } else {
        printf("No majority element found in the array.\n");
    }

    return 0;
}
