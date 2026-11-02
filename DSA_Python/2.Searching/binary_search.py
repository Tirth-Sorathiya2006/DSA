def binary_search(nums: list[int], target: int) -> int:
    # check for empty list
    if not nums:
        return -1

    # apply binary search logic
    start, end = 0, len(nums) - 1

    while start <= end:
        mid = (start + end) // 2

        if nums[mid] == target:
            return mid
        elif nums[mid] < target:
            start = mid + 1
        else:
            end = mid - 1

    # if target not found then return -1
    return -1

nums = [-8, -2, 0, 1, 5, 5, 8, 9, 12, 25]
print(binary_search(nums, 8))