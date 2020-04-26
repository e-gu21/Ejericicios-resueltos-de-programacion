print("!Bienvenido a la calculadora básica¡".title())
print("Usted puede:")
print('Sumar=opción "1"')
print('Restar=opción "2"')
print('Multiplicar=opción "3"')
print('Dividir=opción "4"')
n=int(input("ingrese la opción que desea: "))
while n!=1 and n!=2 and n!=3 and n!=4:
    print("Escoga una de las opciones")
    n=int(input("ingrese la opción que desea:"))
if n==1:
    print('Usted escogió opción "Sumar"')
    a=float(input("ingrese el primer numero:"))
    b=float(input("ingrese el segundo numero:"))
    print(a+b)
elif n==2:
    print('Usted escogió opción "Restar"')
    a=float(input("ingrese el primer numero:"))
    b=float(input("ingrese el segundo numero: "))
    print(a-b)
elif n==3:
    print('Usted escogió opción "Multiplicar"')
    a=float(input("ingrese el primer numero: "))
    b=float(input("ingrese el segundo numero: "))
    print(a*b)
elif n==4:
    print('Usted escogió opción "Dividir"')
    a=float(input("ingrese el primer numero: "))
    b=float(input("ingrese el segundo numero: "))
    print(a/b)
x=input("Desea continuar?(si/no):")
while x=="si":
    n=int(input("ingrese la opción que desea: "))
    while n!=1 and n!=2 and n!=3 and n!=4:
        print("Escoga una de las opciones")
        n=int(input("ingrese la opción que desea: "))
    if n==1:
        print('Usted escogió opción "Sumar"')
        a=float(input("ingrese el primer numero:"))
        b=float(input("ingrese el segundo numero:"))
        print(a+b)
    elif n==2:
        print('Usted escogió opción "Restar"')
        a=float(input("ingrese el primer numero:"))
        b=float(input("ingrese el segundo numero:"))
        print(a-b)
    elif n==3:
        print('Usted escogió opción "Multiplicar"')
        a=float(input("ingrese el primer numero:"))
        b=float(input("ingrese el segundo numero:"))
        print(a*b)
    elif n==4:
        print('Usted escogió opción "Dividir"')
        a=float(input("ingrese el primer numero:"))
        b=float(input("ingrese el segundo numero:"))
        print(a/b)
    x=input("Desea continuar?(si/no):")
if x == "no":
    print("Fin")

    
