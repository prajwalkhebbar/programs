# s= this is amazing to e= siht is gnizama
s=raw_input("enter a str: ")
list1=s.split()
for i in list1:
    list1[list1.index(i)]="".join(list(reversed(list(i))))
print " ".join((list1))