def selection_sort(nums: list[int]) -> None:
    # check for empty list
    if not nums:
        return
    
    # apply selection sort
    for i in range(0, len(nums) - 1):

        min_idx = i
        for j in range(i + 1, len(nums)):
            if nums[j] < nums[min_idx]:
                min_idx = j

        # swap
        nums[i], nums[min_idx] = nums[min_idx], nums[i]

nums = [8, 7, -8, 9, 74, 5, 2, 0, -8, -7]
print("Before sorting =", nums)
selection_sort(nums)
print("After sorting =", nums)