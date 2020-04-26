print("Hola, el día de hoy adivinaremos si pusiste los datos de forma ascendente o no.")
a=float(input("ingrese un numero:"))
b=float(input("ingrese otro numero diferente:"))
c=float(input("ingrese otro numero difetente:"))
while a==b or a==c or b==c or a==b==c:
    print("ingresa 3 numeros diferentes por favor")
    a=float(input("ingrese un numero:"))
    b=float(input("ingrese otro numero diferente:"))
    c=float(input("ingrese otro numero difetente:"))
if a<b<c:
    print("los numeros se ingresaron de forma ascendete",a,",",b,",",c)
else:
    print("los numero se ingresaron de forma descendente o desordenada",a,",",b,",",c)
