fname = input("Enter file name: ")
try:
    fh = open(fname)
except:
    print("Invalit input")
    exit()
for i in fh:
    j = i.rstrip()
    print(j.upper())
