const arr = [1,2,3,4,5,6];

for(const item of arr)
{
    console.log(arr.pop())
}

// Ans : 6 5 4



// User
// const arr = [1,2,3,4,5,6];

// for(const item of arr)
// {
//     console.log(arr.pop())
// }
// What will be the output of the following program?
// ChatGPT

// The behavior of modifying an array while iterating over it using for...of can be unexpected. Let's analyze the given JavaScript code:

// javascript

// const arr = [1, 2, 3, 4, 5, 6];

// for (const item of arr) {
//     console.log(arr.pop());
// }

// Here's what happens in each iteration:

//     Iteration 1: item = 1, arr.pop() removes the last element (6), so the array becomes [1, 2, 3, 4, 5].

//     Iteration 2: item = 2, arr.pop() removes the last element (5), so the array becomes [1, 2, 3, 4].

//     Iteration 3: item = 3, arr.pop() removes the last element (4), so the array becomes [1, 2, 3].

// The loop stops here because the length of the array is now less than the number of remaining iterations. The original array was [1, 2, 3, 4, 5, 6], and only the first three elements were iterated over.

// So, the output of the program will be:

// 6
// 5
// 4

// Note: Modifying an array while iterating over it can lead to unexpected behavior, and it's generally not recommended. It's better to create a copy of the array if you need to modify it while iterating.