def peak(nums: list[int]) -> int:
    # check for empty list
    if not nums:
        return -1

    # check if first or last elements are peak
    if len(nums) == 1 or nums[0] > nums[1]:
        return 0

    if nums[-1] > nums[-2]:
        return len(nums) - 1

    # apply binary search logic
    start, end = 1, len(nums) - 2

    while start <= end:
        mid = (start + end) // 2

        if nums[mid] > nums[mid + 1] and nums[mid] > nums[mid - 1]:
            return mid
        elif nums[mid] < nums[mid + 1]:
            start = mid + 1
        else:
            end = mid - 1

    return -1

nums = [-7, -7, -7, 8, 2, 1]
print(peak(nums))