line=int(input("enter line"))
space=line//2
star=1
for i in range(line):
	for sp in range(space):
		print(" ",sep="",end="")
	for st in range(star):
		print("@",sep="",end="")
	if i< line//2:
		space=space-1
		star=star+2
	else:
		space=space+1
		star=star-2
	print()
