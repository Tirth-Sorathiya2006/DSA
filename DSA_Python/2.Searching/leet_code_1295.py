"""
    Given an array nums of integers, return how many of them contain an even number of digits.
    1 <= nums.length <= 500
    1 <= nums[i] <= 10^5
"""

from math import log10

def findNumbers(nums: list[int]) -> int:
    # it is a counter which stores the count of even digit numbers found in array
    even_number_count = 0

    # go through each number
    for num in nums:
        length = int(log10(num)) + 1
        
        # check for even digit of numebr
        if length % 2 == 0:
            even_number_count += 1

    # return total count of even digit numbers
    return even_number_count


nums = [555, 901, 482, 1771]
print(findNumbers(nums))