import sys

def floor(nums: list[int], target: int) -> int:
    # check for empty list
    if not nums:
        return -sys.maxsize - 1

    if target < nums[0]:
        return -sys.maxsize - 1

    # apply binary search logic
    start, end = 0, len(nums) - 1

    while start <= end:
        mid = (start + end) // 2

        if nums[mid] == target:
            return nums[mid]

        if nums[mid] < target:
            start = mid + 1
        else:
            end = mid - 1

    return nums[end]

nums = [-7, -7, -7, -2, -1, 0, 0, 2, 3, 3, 3, 4, 4, 8, 9, 25]
print(floor(nums, 5))