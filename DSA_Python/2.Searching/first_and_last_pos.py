def find_first_last_pos(nums: list[int], target: int) -> list[int]:
    # check for empty list
    if not nums:
        return [-1, -1]

    if target < nums[0] or target > nums[len(nums) - 1]:
        return [-1, -1]

    # return ans
    return [find_pos(nums, target, True), find_pos(nums, target, False)]

def find_pos(nums: list[int], target: int, is_first_pos: bool) -> int:
    # apply binary search logic
    start, end = 0, len(nums) - 1

    while start <= end:
        mid = (start + end) // 2

        if is_first_pos:
            if nums[mid] < target:
                start = mid + 1
            else:
                end = mid - 1
        else:
            if nums[mid] <= target:
                start = mid + 1
            else:
                end = mid - 1

    if is_first_pos:
        return start if nums[start] == target else -1

    return end if nums[end] == target else -1


nums = [-7, -7, -7, -2, -1, 0, 0, 2, 3, 3, 3, 4, 4, 8, 9, 25]
print(find_first_last_pos(nums, 3))