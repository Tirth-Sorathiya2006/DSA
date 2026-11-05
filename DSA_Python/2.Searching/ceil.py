import sys

def ceil(nums: list[int], target: int) -> int:
    # check for empty list
    if not nums:
        return sys.maxsize

    if target > nums[len(nums) - 1]:
        return sys.maxsize

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

    return nums[start]

nums = [-7, -7, -7, -2, -1, 0, 0, 2, 3, 3, 3, 4, 4, 8, 9, 25]
print(ceil(nums, 5))