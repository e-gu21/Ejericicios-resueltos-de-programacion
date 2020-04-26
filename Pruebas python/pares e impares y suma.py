suma=0
sumi=0
sumapares=0
sumaimpares=0
n=int(input("ingrese un número:"))
for i in range(1,n+1):
    if i%2==0:
        suma=suma+1
        sumapares=sumapares+i
    if i%2!=0:
        sumi=sumi+1
        sumaimpares=sumaimpares+i
print("hay",suma,"números pares y",sumi,"números impares")
print("Suma de pares: ",sumapares)
print("suma de impares: ",sumaimpares)
