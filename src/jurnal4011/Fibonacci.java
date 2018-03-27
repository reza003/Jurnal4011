/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jurnal4011;
import java.util.Scanner;

/**
 *
 * @author Praktikan
 */
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Praktikan
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner show = new Scanner(System.in);
        System.out.print("Masukan Jumlah Deret Fibonacci : ");
        int n = show.nextInt();
        long fib[] = new long[n];
         
        fib[0] = 1;
        fib[1] = 1;
         
        for(int i = 2; i < n; i++) {
            fib[i] = fib[i-1] + fib[i-2];
        }
         
        for (int i = n-1; i >= 0; i--) {
            System.out.print(fib[i] +  " ");
        }
    }
 
}