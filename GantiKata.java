/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan5;

/**
 *
 * @author Dell
 */
import java.util.Scanner;

public class GantiKata {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Kalimat: ");
        String kalimat = scanner.nextLine();

        System.out.print("Kata Yang Ingin di Ganti: ");
        String gantiKata = scanner.nextLine();

        System.out.print("Menjadi Kata: ");
        String menjadiKata = scanner.nextLine();

        String kalimatBaru = kalimat.replaceAll(gantiKata, menjadiKata);

        System.out.println("\n====Hasil Formatting====");
        System.out.println("Kalimat awal: " + kalimat);
        System.out.println("Kalimat baru: " + kalimatBaru);
    }
}