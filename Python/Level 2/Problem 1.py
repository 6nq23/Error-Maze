def reverse_string(s):
    reversed_str = ""
    
    for i in range(len(s), 0, -1):
        reversed_str += s[i]
    return reversed_str

print(reverse_string("hello"))
