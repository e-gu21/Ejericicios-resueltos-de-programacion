#9
f=1
m=1
em=0
ef=0
pm=0
pf=0
sm=0
sf=0
cf=1
cm=1
n=int(input("ingrese cantidad de alumnos:"))
i=1
while i<=n:
    s=input("ingrese su sexo M si es masculino y F si es femenino:")
    if s=="M":
        em=int(input("ingrese edad:"))
        m=m+1
        sm=sm+em
        cm=m-1
    proma=sm/cm
    if s=="F":
        ef=int(input("ingrese edad:"))
        f=f+1
        sf=sf+ef
        cf=f-1
    promb=sf/cf
    i=i+1
print("hay",cm,"hombres y",cf,"mujeres",".Edad promedio entre hombres es",proma,"edad promedio entre mujeres es",promb)
        
        
