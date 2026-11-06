def search(nums: list[int], target: int) -> int:
    # check for empty array input
    if not nums:
        return -1

    # find peak
    peakIdx = peak(nums)

    if peakIdx == -1:
        return -1

    left = binary_search(nums, target, 0, peakIdx, True)

    if left != -1:
        return left

    return binary_search(nums, target, peakIdx + 1, len(nums) - 1, False)

def binary_search(nums: list[int], target: int, left: int, right: int, is_asc: bool) -> int:
    # check for empty array input
    if not nums:
        return -1

    # apply binary search logic
    start, end = left, right

    while start <= end:
        mid = (start + end) // 2

        if nums[mid] == target:
            return mid
        
        if is_asc:
            if nums[mid] < target:
                start = mid + 1
            else:
                end = mid - 1
        else:
            if nums[mid] > target:
                start = mid + 1
            else:
                end = mid - 1

    return -1
            

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
print(search(nums, 2))