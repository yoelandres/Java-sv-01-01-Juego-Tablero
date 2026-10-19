import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        // 1º) Yago
        char[][] matriz = new char[10][10];

        // 2º) Sergio
        int vidas = 10;

        // 3º) Dani
        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz.length; c++) {
                matriz[f][c] = '*';
            }
        }

        // 5º) Alejandro
        char Yoda = 'Y';
        matriz[0][0] = Yoda;

        char Casilla_Final = 'F';
        matriz[9][9] = Casilla_Final;

        // 4º) Carlos
        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz.length; c++) {
                System.out.print(matriz[f][c] + " ");
            }
            System.out.println(" ");
        }

        //6º)
        Random random = new Random();

        int fAleatoria = random.nextInt(10);
        int cAleatoria = random.nextInt(10);

        matriz[fAleatoria][cAleatoria] = 'M';

        //7º) Alex
        int fAleatoria2 = random.nextInt(10);
        int cAleatoria2 = random.nextInt(10);

        matriz[fAleatoria2][cAleatoria2] = 'P';

        //8º) Gabriel
        int fAleatoria2 = random.nextInt(10);
        int cAleatoria2 = random.nextInt(10);

        do {
            fAleatoria2 = random.nextInt(10);
            cAleatoria2 = random.nextInt(10);
        } while (matriz[fAleatoria2][cAleatoria2] != '*');
        matriz[fAleatoria2][cAleatoria2] = 'P';

        //9º) Boris
        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz.length; c++) {
                do {
                    fAleatoria2 = random.nextInt(10);
                    cAleatoria2 = random.nextInt(10);
                } while (matriz[fAleatoria2][cAleatoria2] != '*');
                matriz[fAleatoria2][cAleatoria2] = 'M';
            }
        }

        // 10º) Pablo
        //Mostrar tu jugador en la casilla 0,0 y te puedes desplazar con las letras wasd

        System.out.println("Tu jugador se encuentra en la casilla 0,0");
        System.out.println("y te puedes desplazar con las letras W A S D");

        Scanner sc = new Scanner(System.in);

        System.out.print("Dime una letra: ");
        char desplazamiento = sc.next().charAt(0);
        System.out.println("La letra elegida es: " + desplazamiento);

        //11º) Yoel

        int filaYoda = 0;
        int columnaYoda = 0;

        matriz[filaYoda][columnaYoda] = Yoda;
        if (matriz[filaYoda][columnaYoda] = 'D');
    }
}
