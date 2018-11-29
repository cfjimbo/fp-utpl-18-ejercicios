
from random import randint

valor =[]
valores =[]

suma = 0
suma1 = 0

jugador = "Jugador1"
jugador1 = "Jugador2"

for i in range(5):

    valor.append(randint(1,6))

    valores.append(randint(1,6))

    suma = suma + valores1[i]

    suma1 = suma1 + valores2[i]

if(suma > suma1):

    print("Primer lugar " , jugador , " gano con " , suma , "puntos")
    print("Segundo lugar " , jugador1 , " se quedo" , suma1 , "puntos")

elif(suma == suma1):

    print("Empate")

else:
    
    print("Primer lugar " , jugador1 , " gano con " , suma1 , "puntos")
    print("Segundo lugar " , jugador , " se quedo " , suma , "puntos")

input()
