a=int(input("ingresa el numero de likes de su primer video:"))
a1=int(input("ingresa el numero de vistas de sus primer video:"))
b=int(input("ingresa el numero de likes de su segundo video:"))
b1=int(input("ingresa el numero de vistas de su segundo video:"))
c=int(input("ingresa el numero de likes de su tercer video:"))
c1=int(input("ingresa el numero de vistas de su tercer video:"))
if a or b or c <200 and a1 or b1 or c1 <1000:
    print("dedicate a otra cosa, no seas youtuber u.u")   
if 5000>a1>=1000 and a>=200:
    p1=2.5
elif a>=200 and a1>=5000:
    p1=3
if 5000>b1>=1000 and b>=200:
    p2=2.5
elif b>=200 and b1>=5000:
    p2=3
if 5000>c1>=1000 and c>=200:
    p3=2.5
elif c>=200 and c1>=5000:
    p3=3
    print("su pago será de:",p1+p2+p3,"USD")


    
