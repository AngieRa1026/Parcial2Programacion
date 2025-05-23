import java.util.Random;
import java.util.Scanner;

public class Laberinto {
    public static void main(String[] args) throws Exception {
        int[][] laberinto = new int[5][5];
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        // Generar el laberinto con valores aleatorios del 1 al 9
        for (int fila = 0; fila < laberinto.length; fila++) {
            for (int col = 0; col < laberinto[fila].length; col++) {
                laberinto[fila][col] = random.nextInt(9) + 1;
            }
        }
        // Mostrar el laberinto generado
        System.out.println("=== LABERINTO UNIVERSITARIO ===");
        mostrarMatriz(laberinto);

        System.out.println("Numeros pares mayores a 4 : " + numerosPares(laberinto));
        System.out.println("Promedio de numeros impares: " + promedioDeNumerosPares(laberinto));
    }
    
    public static void mostrarMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int valor : fila) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }
    }

    public static int numerosPares(int [][] matriz) {
        int contador = 0;
        for (int [] fila: matriz) {
            for (int valor : fila) {
                if (valor %2== 0 && valor>4) {
                    contador++;
                    
                }
            }
            
        }
        return contador;
    }
    
    public static int promedioDeNumerosPares(int [][] matriz) {
        int contador = 0;
        int suma = 0;
        for (int[] fila : matriz) {
            for (int valor : fila) {
                if (valor%2!=0) {
                    suma+= valor;
                    contador++;
                }
                
            }
            
        }
        return contador;  
        }
    }

    


