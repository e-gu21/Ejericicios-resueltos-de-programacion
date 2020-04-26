print("-----BIENVENIDO A TU CHANCHITO DEL AHORRO-----")
montotal=0
print("OPCIONES")
print("1-Agregar dinero")
print("2-Sacar dinero")
print("presiona 0 para saber tu nuevo monto")
x=int(input("Ingresa una opción:"))
while x==1:
    y=float(input("ingresa tu monto actual:"))
    montotal=montotal+y
    z=float(input("ingresa cantidad de dinero:"))
    if z==0:
        print("Gracias hasta la próxima")
        break
    print("tu nuevo monto es de:",montotal)
    print("ingrese '0' para terminar")
