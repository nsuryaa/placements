def min_changes_to_lucky(N, s):
    # Split the string into two halves
    first_half = s[:N // 2]
    second_half = s[N // 2:]

    # Count the changes required for each case
    changes_case1 = sum(1 for char1, char2 in zip(first_half, second_half) if char1 >= char2)
    changes_case2 = sum(1 for char1, char2 in zip(first_half, second_half) if char1 <= char2)
    changes_case3 = N // 2 - max(changes_case1, changes_case2)

    # Output the minimum changes required
    return min(changes_case1, changes_case2, changes_case3)

# Input
N = int(input())
s = input()

# Output
result = min_changes_to_lucky(N, s)
print(result)
