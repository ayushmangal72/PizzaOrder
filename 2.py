from googlesearch import *
import webbrowser
data=input("Enter your search")
webbrowser.open_new_tab("https://www.google.com/search?q="+data)
l=[]
for i in search(url,stop=10):
	l.append(i)
print(l)
file=open('url.txt','a+')
for i in l:
	f.append(i+'\n')
f.close()
