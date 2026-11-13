def solution(n):
    i = 1
    while i > 0:
        if i*6%n == 0:
            break
        i += 1
    return i