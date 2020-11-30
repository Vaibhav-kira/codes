small = None
Big = None
flag=0
while True:
    num = input('Enter a number !!')
    if num=='done':
        break
    else:
        try:
            num = int(num)
        except:
            print('Invalid in put')
            continue
        if flag==0 :
            small = num
            Big = num
            flag = flag + 1
        elif num < small:
            small = num
        elif num > Big:
            Big = num

print('Maximum = ',Big)
print('Smallest = ',small)
