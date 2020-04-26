cv=0
nventas=int(input("ingresa el número de ventas:"))
for i in range(nventas):
    pv=float(input("ingrese monto de venta:"))
    if pv>150:
        cv=cv+1
print("se hicieron",cv,"ventas mayores de 150 eoles")

