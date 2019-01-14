package matrices;

public class Matrices {

    public static void main(String[] args) {
        double[][] matriz = {{0.0, 0.1, 0.2, 0.3}, {1.0, 1.1, 1.2, 1.3}, {2.0, 2.1, 2.2, 2.3}, {3.0, 3.1, 3.2, 3.3}};
        double[][] matrizT = new double[matriz[0].length][matriz.length];
        for (int x = 0; x < matriz.length; x++) {
            for (int y = x+1; y < matriz[x].length; y++) {
                matrizT[x][y] = matriz[y][x];
                System.out.println(matrizT[x][y]);
            }
        }
    }
}
