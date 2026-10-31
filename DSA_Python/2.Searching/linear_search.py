def linear_search(nums: list[int], target: int) -> int:
    # check for empty list input
    if not nums: 
        return -1

    # check for target in the list
    for idx, num in enumerate(nums):
        if num == target:
            return idx

    # if target not found return -1
    return -1


def linear_search_in_range(nums: list[int], target: int, start: int, end: int) -> int:
    # check for empty list input
    if not nums: 
        return -1

    # check for invalid range input
    n = len(nums)
    if start < 0 or end < 0 or start >= n or end >= n or start > end:
        return -1

    # check for target in the list in given range
    for i in range(start, end + 1):
        if nums[i] == target:
            return i

    # if target not found return -1
    return -1

def search_in_string(string: str, target: str) -> int:
    # check for empty string input
    if not string:
        return -1

    # return the target character index if not found then return -1
    return string.find(target)

def find_min(nums: list[int]):
    # check if array is empty
    if not nums:
        return -1

    # return minimum value in the list
    return min(nums)

def search_in_2D_array(nums: list[list[int]], target: int) -> int:
    # check for empty list input
    if not nums: 
        return [-1, -1]

    # iterate through the each row
    for row in range(0, len(nums)):

        # check for empty row if row is empty then go to next row
        if not nums[row]:
            continue

        # iterate to each element in row for target
        for col in range(0, len(nums[row])):
            if nums[row][col] == target:
                return [row, col]

    # if we not find out the target then return [-1, -1]
    return [-1, -1]


nums = [4, 7, 8, 5, 7, -8, 9, 0]
print(linear_search(nums, 5))
print(linear_search_in_range(nums, 5, 1, 5))

mat = [[1, 2, 3], [4, 5, 6], [-8, 7, 5]]
print(search_in_2D_array(mat, 5))

name = "Tirth Sorathiya"
print(search_in_string(name, 'a'))
print(find_min(nums))