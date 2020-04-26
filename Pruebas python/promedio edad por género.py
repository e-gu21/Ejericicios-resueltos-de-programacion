ch=0
ed=0
cm=0
h=0
M=1
F=1
m=0
ef=0
n=int(input("ingrese cantidad de alumnos"))
for i in range(n):
    x=input("ingrese su género 'M' o 'F':")
    while x!="M" and x!="F":
        print("No puede ingresar otra opción")
        x=input("ingrese su género 'M' o 'F':")
    e=int(input("ingrese edad"))
    while e<=0:
        e=int("ingrese edad")
    if x=="M":
        h=h+M
        ed=ed+e
        prom=ed/h
    elif x=="F":
        m=m+F
        ef=ef+e
        promm=ef/m
print("hay",h,"hombres y",m,"mujeres")
print("EL Pomedio de edad de hombres es de:",prom,"y el promedio de edad de mujeres es de:",promm)
    
