import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextLong();

        int sumaT = n * (n + 1) / 2; //Algoritmo de suma de Gauss, referencia: https://nkhilv.medium.com/using-gauss-summation-to-add-numbers-quicker-2ab61d01eff1 

        int sumaR = 0;

        for (int i = 0; i <= n - 1; i++) { 
            sumaReal += sc.nextLong();
        }

        int numeroFaltante = sumaTeorica - sumaReal;
        
        System.out.println(numeroFaltante);
    }
}
