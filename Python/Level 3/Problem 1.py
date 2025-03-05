def calculate_average(arr):
    total = 0
    # BUG: Loop iterates one extra time, causing an IndexError.
    for i in range(len(arr) + 1):
        total += arr[i]
    return total / len(arr)

print(calculate_average([10, 20, 30, 40, 50]))
