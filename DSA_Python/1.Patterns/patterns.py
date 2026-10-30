"""
    *****
    *****
    *****
    *****
    *****
"""
def pattern_1(n: int) -> None:
    for row in range(1, n + 1):
        print("*" * 5)

# pattern_1(5)


"""
    *
    **
    ***
    ****
    *****
"""
def pattern_2(n: int) -> None:
    for row in range(1, n + 1):
        for col in range(1, row + 1):
            print("*", end="")

        print()

# pattern_2(5)


"""
    *****
    ****
    ***
    **
    *
"""
def pattern_3(n: int) -> None:
    for row in range(1, n + 1):
        for col in range(1, (n - row + 1) + 1):
            print("*", end="")

        print()

# pattern_3(5)


"""
    1
    12
    123
    1234
    12345
"""
def pattern_4(n: int) -> None:
    for row in range(1, n + 1):
        for col in range(1, row + 1):
            print(col, end="")

        print()

# pattern_4(5)


"""
    *
    **
    ***
    ****
    *****
    ****
    ***
    **
    *
"""
def pattern_5(n: int) -> None:
    pattern_2(n)
    pattern_3(n - 1)

# pattern_5(5)


"""
        *
       * *
      * * *
     * * * *
    * * * * *
     * * * *
      * * *
       * *
        *
"""
def pattern_6(n: int) -> None:
    # print upper triangle
        for row in range(1, n + 1):
        
            # print space
            for col in range(1, (n - row) + 1):
                print(" ", end="")

            # print stars
            for col in range(1, row + 1):
                print("* ", end="")

            # print new line at the end of the row
            print()

        # print lower triangle
        for row in range(1, n):

            # print space
            for col in range(1, row + 1):
                print(" ", end="")

            # print stars
            for col in range(1, (n - row) + 1):
                print("* ", end="")

            # print new line at the end of the row
            print()

# pattern_6(5)


"""
        1
       212
      32123 
     4321234
    543212345
"""
def pattern_7(n: int) -> None:
    for row in range(1, n + 1):
        # print spaces
        for col in range(1, (n - row) + 1):
            print(" ", end="")

        # print numbers decresing order
        for col in range(1, row + 1):
            print((row - col + 1), end="")

        # print numbers ascending order
        num = 2
        for col in range(1, row):
            print(num, end="")
            num += 1

        # print new line at the end of the row
        print()

pattern_7(5)