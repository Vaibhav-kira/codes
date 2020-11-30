import urllib.request, urllib.parse, urllib.error
from bs4 import BeautifulSoup
import xml.etree.ElementTree as ET
import ssl

# Ignore SSL certificate errors
ctx = ssl.create_default_context()
ctx.check_hostname = False
ctx.verify_mode = ssl.CERT_NONE

adress = input('Enter link:- ')
html = urllib.request.urlopen(adress, context=ctx).read().decode()

a=0
b=0
data = ET.fromstring(html)
tags = data.findall('comments/comment')

for tag in tags:
    a += 1
    b += int(tag.find('count').text)
print(a)
print(b)
