fname = input("Enter file name: ")
file = open(fname)
s=0
c=0
for i in file:
    if  i.startswith('X-DSPAM-Confidence:'):
        i = i.rstrip()
        j = i.find('0')
        s=s+float(i[j:])
        c=c+1
print(s/c)
#Average spam confidence: 0.750718518519
