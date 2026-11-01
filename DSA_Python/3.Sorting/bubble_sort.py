def bubble_sort(nums: list[int]) -> None:
    # check for empty list
    if not nums:
        return

    # apply bubble sort
    for i in range(0, len(nums) - 1):
        swapped = False

        for j in range(0, len(nums) - i - 1):
            if nums[j] > nums[j + 1]:
                nums[j], nums[j + 1] = nums[j + 1], nums[j]
                swapped = True

        if not swapped:
            break

nums = [8, 7, -8, 9, 74, 5, 2, 0, -8, -7]
print("Before sorting =", nums)
bubble_sort(nums)
print("After sorting =", nums)