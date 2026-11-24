/*
 * Plataforma: HackerRank
 * Desafio: Java Stdin and Stdout II
 * https://www.hackerrank.com/challenges/java-stdin-stdout/problem?isFullScreen=true
 * Autor: Jean Ortiz (OrtizzJean)
 * Data: 24/11/2026
 *
 * Conceitos: Leitura de dados (Scanner), limpeza de buffer (nextLine) e Locale.US
 * Complexidade: Tempo O(L) | Espaco O(L)
 */

import java.util.Locale;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // Garante ponto como separador decimal
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        int i = scan.nextInt();
        double d = scan.nextDouble();
        
        // Limpa o '\n' deixado no buffer pelo nextDouble()
        scan.nextLine();
        
        // Le a linha completa da String
        String s = scan.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);

        scan.close();
    }
}
