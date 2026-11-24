/*
 * Plataforma: HackerRank
 * Desafio: Java Output Formatting
 * https://www.hackerrank.com/challenges/java-output-formatting/problem?isFullScreen=true
 * Autor: Jean Ortiz (OrtizzJean)
 * Data: 24/11/2026
 *
 * Conceitos: Formatacao de saida com printf, alinhamento a esquerda (%-15s) e preenchimento com zeros a esquerda (%03d)
 * Complexidade: Tempo O(1) | Espaco O(1)
 */

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                
                System.out.printf("%-15s%03d%n", s1, x);
            }
            System.out.println("================================");
            sc.close();
    }
}



