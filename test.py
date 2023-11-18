def high(s):
    maxs = 0
    maxw = ''
    summ = 0
    s = s.split()
    for elem in s:
        for i in range(len(elem)):
            summ += (ord(elem[i]) - ord('a') + 1)
        if summ > maxs: 
            maxs = summ
            maxw = elem
        summ = 0
    return maxw



print(high('aa b'))