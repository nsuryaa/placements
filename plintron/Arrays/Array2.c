#include <stdio.h>
#define min(x, y) (((x) < (y)) ? (x) : (y))
#define max(x, y) (((x) > (y)) ? (x) : (y))

// Function to count elements less than or equal to mid
int count(int nums[], int size, int mid) {
    int cnt = 0;
    for (int i = 0; i < size; i++) {
        if (nums[i] <= mid) {
            cnt++;
        }
    }
    return cnt;
}

// Function to find the Kth smallest element
int kthSmallest(int nums[], int size, int K) {
    int low = 0;
    int high = 1000;

    // Find the minimum and maximum elements in the array
    for (int i = 0; i < size; i++) {
        low = min(low, nums[i]);
        high = max(high, nums[i]);
    }

    // Binary search on the answer
    while (low < high) {
        int mid = low + (high - low) / 2;
        if (count(nums, size, mid) < K) {
            low = mid + 1;
        } else {
            high = mid;
        }
    }

    return low;
}

int main() {
    int nums[] = {1, 4, 5, 3, 19, 3};
    int size = sizeof(nums) / sizeof(nums[0]);
    int K = 5;

    printf("K'th smallest element is %d\n", kthSmallest(nums, size, K));

    // To find Kth largest, reverse the logic in the kthSmallest function
    int largest_k = size - K + 1; // Calculate the index for Kth largest
    printf("K'th largest element is %d\n", kthSmallest(nums, size, largest_k));

    return 0;
}