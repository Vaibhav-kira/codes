#9.4 Write a program to read through the mbox-short.txt and figure out who has sent the greatest number of mail messages. The program looks for 'From ' lines and takes the second word of those lines as the person who sent the mail. The program creates a Python dictionary that maps the sender's mail address to a count of the number of times they appear in the file. After the dictionary is produced, the program reads through the dictionary using a maximum loop to find the most prolific committer.
fname = input('enter file name')
f = open(fname)
ls = list()
d = dict()
count=0
for i in f:
    i = i.rstrip()
    m = i.split()
    if len(m)<1:
        continue
    if m[0]=='From':
        count=count+1
        ls.append(m[1])
for v in ls:
    d[v]=d.get(v,0) + 1
maxkey=None
Maxcount=None
for key,value in d.items():
    if Maxcount == None or value > Maxcount:
        maxkey=key
        Maxcount=value
print(maxkey,Maxcount)
