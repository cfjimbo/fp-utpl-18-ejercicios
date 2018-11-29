package matrices;

import java.util.Random;
import java.util.Scanner;

/*
public class TareaMatrices {
    public static void main(String[] args) {
        int x[][] = {{1,0,2,3},{1,2,4,7},{5,4,8,9},{4,2,3,8}};
        int [] f = new int [4];
        int [] c = new int [4];
        
        leer(x, f, c);    
    }
    public static void leer(int [][] x, int [] f, int [] c){
        
        for (int i=0; i<x.length; i++ ){
            for (int j=0; j<x[0].length; j++){
                f[i] += x[i][j];
                c[i] += x[i][j];
            }
        }
        System.out.println("FILAS");
        for (int i=0; i<x.length; i++ ){
            System.out.printf("%d\n", f[i]);
        }
        System.out.println("COLUMNAS");
        for (int i=0; i<x[0].length; i++ ){
            System.out.printf("%d\n", c[i]);
        }
        System.out.print("\n");
    }
}*/
 /*
public class TareaMatrices {
    public static void main(String[] args) {
        int x[] = {-1,0,2,-3,0};
        
        leer (x);    
    }
    public static void leer(int [] x){
        
        int cero=0, menor=0, mayor = 0;
        
        for (int i=0; i<x.length; i++ ){
            if (x[i]==0){
                cero += 1;
            }else{
                if (x[i]<0){
                    menor += 1;
                }else{
                    mayor += 1;
                }
            }
        }
        System.out.println("Son "+cero+" los elementos con numero cero");
        System.out.println("Son "+menor+" los elementos menores a cero");
        System.out.println("Son "+mayor+" los elementos menores a cero");
    }
}*/
 /*
public class TareaMatrices {
    public static void main(String[] args) {
        int [] a = new int [10];
        int [] b = new int [10];
        leer (a,b);    
    }
    public static void leer(int [] a, int [] b){
        for (int i=0; i<a.length; i++ ){
            int factorial = 1;
            for (int j=0; j<a[0]; j++ ){
                factorial = factorial * j;
            }
            b[i] = factorial;
        }
        System.out.println("Arreglo A");
        for (int i=0; i<a.length; i++ ){
            System.out.printf("%d, ", a[i]);
        }
        System.out.println("\nArreglo B");
        for (int i=0; i<a.length; i++ ){
            System.out.printf("%d, ", b[i]);
        }
    }
}*/
 /*
public class TareaMatrices {
    public static void main(String[] args) {
        int x[][] = {{1,0,2,3},{1,2,4,7},{5,4,8,9},{4,2,3,8}};
        Diagonal (x);    
    }
    public static void Diagonal(int [][] x){
        int suma=0;
        for (int i=0; i<x.length; i++ ){
            for (int j=0; j<x[0].length; j++){
                if(i==j){
                    suma += x[i][j];
                }
            }
        }
        System.out.println("La suma de la Diagonal Principal es: "+suma);
    }
}*/
//Quinto
/*
public class TareaMatrices {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random random = new Random();
        int n;
        System.out.println("Ingrese el número de elementos del arreglo");
        n = teclado.nextInt();
        int [] T = new int [n];
        for (int i=0; i<T.length; i++ ){
            T[i]=random.nextInt(100+1);
        }
        System.out.println("*****ARREGLO ALEATORIO*****");
        for (int i=0; i<T.length; i++ ){
            System.out.println(" "+T[i]);
        }
        int [] T1 = new int [n];
        System.out.printf("Ingrese la posición del elemento divisor: \n");
        int posicion=teclado.nextInt();
        int divisor=T[posicion];
        for (int i=0; i<T1.length; i++ ){
            T1[i]=T[i]/divisor;
        }
        System.out.println("Arreglo Dividido por "+divisor);
        for (int i=0; i<T1.length; i++ ){
            System.out.println(" "+T1[i]);
        }
    }
}*/
// Sexto
/*
public class TareaMatrices {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n;
        System.out.println("Ingrese el número de elementos del arreglo");
        n = teclado.nextInt();
        int [] arregloA = new int [n];
        
        for (int i=0; i<arregloA.length; i++ ){
            System.out.println("Ingrese el elemento en la posición ["+i+"]");
            arregloA[i]=teclado.nextInt();
        }
        System.out.printf("ARREGLO A\n");
        for (int i=0; i<arregloA.length; i++ ){
            System.out.println(arregloA[i]);
        }
        System.out.println("Ingrese el elemento a insertar ");
        int a=teclado.nextInt();
        System.out.println("Ingrese la posición del elemento a insertar ");
        int b=teclado.nextInt();
        if(b<=arregloA.length){
            for(int i=arregloA.length-2; i>=b; i++){
                arregloA [i+1] = arregloA[i];
            }
            arregloA[b] = a;
        }
        else{
            System.out.println("Ingrese una posición válida");
        }
        System.out.println("El arreglo nuevo es:\n");
        for (int i=0; i<arregloA.length; i++ ){
            System.out.println(arregloA[i]);
        }
    }
}*/
// Septimo Ejercicio
/*
public class TareaMatrices {
    public static void main(String[] args) {
        int L[][] = {{1, 2}, {4, 7}, {6, 9}};
        Matriz(L);
    }
    public static void Matriz(int[][] L) {
        int sumaImpar = 0;
        int sumaPar = 0;
        for (int i = 0; i < L.length; i++) {
            for (int j = 0; j < L[0].length; j++) {
                if (L[i][j] % 2 == 0) {
                    sumaPar += L[i][j];
                } else {
                    sumaImpar += L[i][j];
                }
            }
        }
        System.out.println("Suma de numeros pares: " + sumaPar);
        System.out.println("Suma de numeros impares: " + sumaImpar);
    }
}*/
// Octavo Ejercicio
/*public class TareaMatrices {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n;
        System.out.println("Ingrese el número de elementos del arreglo");
        n = teclado.nextInt();
        int [][] A = new int [3][8];
        double suma=0,media=0,suma_media=0,media_total=0,suma1=0,media1=0,ceros=0;
        
        System.out.println("*****ARREGLO ALEATORIO*****");
        for (int i=0; i<T.length; i++ ){
            System.out.println(" "+T[i]);
        }
        int [] T1 = new int [n];
        System.out.printf("Ingrese la posición del elemento divisor: \n");
        int posicion=teclado.nextInt();
        int divisor=T[posicion];
        for (int i=0; i<T1.length; i++ ){
            T1[i]=T[i]/divisor;
        }
        System.out.println("Arreglo Dividido por "+divisor);
        for (int i=0; i<T1.length; i++ ){
            System.out.println(" "+T1[i]);
        }
    }
}*/
// Noveno
/*
public class TareaMatrices {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Ejercicio9 p1=new Ejercicio9();
        p1.Llenar();
        int opcion;
        do{
            System.out.println("*********RESERVACIONES DE PLAZAS**********");
            System.out.println("OPCION 1 = Plaza Fumadores");
            System.out.println("OPCION 2 = Plaza No Fumadores");
            System.out.println("opcion 3 = Eliminar Reserva");
            System.out.println("OPCION 0 = Terminar");
            opcion = teclado.nextInt();
            switch(opcion){
            case 1:
                p1.reservacionFumadores();
                break;
            case 2:
                p1.reservacionNoFumadores();
                break;
            case 3:
                p1.eliminarReserva();
                break;
            }
        }while(opcion != 0);
        p1.presentarPlazas();
    }
}*/
// Decimo
/*
public class TareaMatrices {
    public static void main(String[] args) {
       Ejercicio10 p2= new Ejercicio10();
       p2.Notas();
       p2.mediaAlumno();
       p2.mediaMateria();
       p2.mediaGeneral();
       p2.porcentageFaltas();
    }
}*/
// 11 Ejercicio

// 12 Ejercicio
/*
public class TareaMatrices {
    public static void main(String[] args) {
       Ejercicio12 nombreA =new Ejercicio12();
       nombreA.crearArreglo();
       nombreA.Buscar();
    }
}*/
// 13 ejercicio

public class TareaMatrices {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Ejercicio13 arreglo = new Ejercicio13();
        
        System.out.println("Ingrese el numero de filas:");
        int f = teclado.nextInt();
        System.out.println("Ingrese el numero de columnas:");
        int c = teclado.nextInt();
        
        int[][] A = new int[f][c];
        int[][] B = new int[f][c];
    
        arreglo.agregar_arreglo(A, f, c);
        arreglo.presentar_arreglo(A, f, c);
        arreglo.agregar_arreglo(B, f, c);
        arreglo.presentar_arreglo(B, f, c);
        
        System.out.println("**********MENÚ*********\n"
                + "1. Multiplicacion de matrices\n"
                + "2. Suma de matrices\n"
                + "3. Resta de matrices\n"
                + "4. Multiplicacion por un escalar\n"
                + "5. Traspuesta de una matriz\n");
        int opcion = teclado.nextInt(); 
        
        switch (opcion) {
            case 1:
                
                int[][] m_mult = arreglo.multiplicacion(A, B);
                System.out.println("La matriz resultante es");
                arreglo.presentar_arreglo(m_mult, f, c);
                break;
               
            case 2:
                int[][] m_sum = arreglo.suma_(A, B);
                System.out.println("La matriz resultante es");
                arreglo.presentar_arreglo(m_sum, f, c);

                break;
            case 3:
                
                int[][] m_rest = arreglo.resta_(A, B);
                System.out.println("La matriz resultante es");
                arreglo.presentar_arreglo(m_rest, f, c);
                break;
            case 4:
                
                System.out.println("Ingrese un numero (entero) por el que desea multiplicar su matriz previamente alamacenada: ");
                int x = teclado.nextInt();
                int[][] resultado = new int[A.length][A[0].length];
                resultado = arreglo.Escalar(A, x);
                System.out.println("Su matriz resulto de la multiplicacion de escalar por una matriz n x A es: ");
                arreglo.presentar_arreglo(resultado, f, c);
                break;
            case 5:
                
                System.out.println("Ingrese la matriz de la que desea la transpuesta A=1 | B=0");
                int op = teclado.nextInt();
                if (op == 1) {
                    int[][] transA = arreglo.transpuesta(A);
                    System.out.println("La transpuesta de la matriz A es");
                    arreglo.presentar_arreglo(transA, f, c);

                } else { 
                    int[][] transB = arreglo.transpuesta(B);
                    System.out.println("La transpuesta de la matriz B es");
                    arreglo.presentar_arreglo(transB, f, c);
                    break;
      
                }
                 
                default:
                System.out.println("Ingrese una opción correcta");
                break;
        }
    }
}


