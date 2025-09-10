/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

/**
 *
 * @author MyBook Hype AMD
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> judulFilm = new ArrayList<>();
        ArrayList<Double> ratingFilm = new ArrayList<>();

        int pilihan;
        do {
            System.out.println("\n=== Sistem Manajemen Rating Film ===");
            System.out.println("1. Tambah Film");
            System.out.println("2. Tampilkan Semua Film");
            System.out.println("3. Update Rating Film");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine(); // membersihkan buffer

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan judul film: ");
                    String judul = input.nextLine();
                    System.out.print("Masukkan rating film (0.0 - 10.0): ");
                    double rating = input.nextDouble();
                    judulFilm.add(judul);
                    ratingFilm.add(rating);
                    System.out.println("Film berhasil ditambahkan!");
                    break;

                case 2:
                    if (judulFilm.isEmpty()) {
                        System.out.println("Belum ada data film.");
                    } else {
                        System.out.println("\nDaftar Film:");
                        for (int i = 0; i < judulFilm.size(); i++) {
                            System.out.println((i+1) + ". " + judulFilm.get(i) + " | Rating: " + ratingFilm.get(i));
                        }
                    }
                    break;

                case 3:
                    System.out.print("Masukkan judul film yang ingin diupdate: ");
                    String cari = input.nextLine();
                    boolean ditemukan = false;
                    for (int i = 0; i < judulFilm.size(); i++) {
                        if (judulFilm.get(i).equalsIgnoreCase(cari)) {
                            System.out.print("Masukkan rating baru: ");
                            double ratingBaru = input.nextDouble();
                            ratingFilm.set(i, ratingBaru);
                            System.out.println("Rating berhasil diperbarui!");
                            ditemukan = true;
                            break;
                        }
                    }
                    if (!ditemukan) {
                        System.out.println("Film tidak ditemukan.");
                    }
                    break;

                case 4:
                    System.out.println("Terima kasih, program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 4);

        input.close();
    }
}