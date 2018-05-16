contador = 1
limite=4
nota1=0
nota2=0
nota3=0
nombre=""
promedio=0.0
cadena="{0}\t\t{1}\t{2}\t{3}\t{4}\n".format("Nombres","Nota 1","Nota 2","Nota 3","Promedio")
while (contador<=limite):
    nombre=input("Ingrese el nombre del estudiante\n")
	nota1=float(input("ingrese la primera nota\n"))
	nota2=float(input("ingrese la segunda nota\n"))
	nota3=float(input("ingrese la tercera nota\n"))
    promedio=(nota1+nota2+nota3)/3
    cadena="{0}{1}\t\t{2}\t{3}\t{4}\t{5:.2}\n".format(cadena,nombre,nota1,nota2,nota3,promedio)
    
    contador+=1

print("Reporte de notas")
print(cadena)