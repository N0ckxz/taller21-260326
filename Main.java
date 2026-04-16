import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        long sumaT = (long) n * (n + 1) / 2; //Algoritmo de suma de Gauss, referencia: https://nkhilv.medium.com/using-gauss-summation-to-add-numbers-quicker-2ab61d01eff1 

        long sumaR = 0;

        for (long i = 0; i < n - 1; i++) { //Ciclo para leer n-1 elementos
            sumaR += sc.nextLong();
        }

        long numeroFaltante = sumaT - sumaR;
        
        System.out.println(numeroFaltante);
    }
}
