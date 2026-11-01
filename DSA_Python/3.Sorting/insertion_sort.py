def insertion_sort(nums: list[int]) -> None:
    # check for empty list
    if not nums:
        return
    
    # apply insertion sort
    for i in range(1, len(nums)):
        num = nums[i]
        j = i - 1

        while(j >= 0 and nums[j] > num):
            nums[j + 1] = nums[j]
            j -= 1

        # place the num to it's correct place
        nums[j + 1] = num

nums = [8, 7, -8, 9, 74, 5, 2, 0, -8, -7]
print("Before sorting =", nums)
insertion_sort(nums)
print("After sorting =", nums)