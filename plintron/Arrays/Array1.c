// Find the maximum and minimum element in an array using C programming

#include <stdio.h>

int main() {
    int arr[100];
    int n, i, max, min;

    // Get the number of elements from the user
    printf("Enter the number of elements in the array: ");
    scanf("%d", &n);

    // Check for valid input (array size cannot be 0)
    if (n <= 0) {
        printf("Invalid array size. Please enter a positive integer.\n");
        return 1;
    }

    // Get the elements from the user
    printf("Enter the elements of the array:\n");
    for (i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }

    // Initialize max and min with the first element
    max = min = arr[0];

    // Iterate through the array to find the maximum and minimum elements
    for (i = 1; i < n; i++) {
        if (arr[i] > max) {
            max = arr[i];
        } else if (arr[i] < min) {
            min = arr[i];
        }
    }

    // Print the maximum and minimum elements
    printf("Maximum element: %d\n", max);
    printf("Minimum element: %d\n", min);

    return 0;
}