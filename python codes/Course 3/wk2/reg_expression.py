import re
all = open("Data.txt")
numlist = []
for line in all:
    line = line.rstrip()
    extract = re.findall("([0-9]+)", line)
    if len(extract) < 1 : continue
    for i in range(len(extract)):
        num = float(extract[i])
        numlist.append(num)
print(sum(numlist))
