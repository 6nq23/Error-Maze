def factorial(n):
    if n == 0:
        return 1
    else:
        # BUG: The recursive call uses an undefined function name 'fact'
        return n * fact(n - 1)

print(factorial(5))
