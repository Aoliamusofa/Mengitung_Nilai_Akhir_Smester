package quis;

import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("PROGRAM HITUNG NILAI AKHIR");
        System.out.print("Nama Mahasiswa : ");
        String nama = input.nextLine();
        System.out.print("Nilai Tugas1 : ");
        int tugas1 = input.nextInt();
        System.out.print("Nilai Tugas2 : ");
        int tugas2 = input.nextInt();
        System.out.print("Nilai Tugas3 : ");
        int tugas3 = input.nextInt();
        System.out.print("Nilai UTS: ");
        int uts = input.nextInt();
        System.out.print("Nilai UAS : ");
        int uas = input.nextInt();
        double tugas = tugas1 + tugas2 + tugas3;
        double alltugas = 0.2 * tugas;
        double nilaiuts = 0.3 * (double)uts;
        double nilaiuas = 0.5 * (double)uas;
        double nilai_akhir = tugas + (double)uts + (double)uas;
        double rata_rata = nilai_akhir / 5.0;
        String grade;
        if (rata_rata >= 80.0) {
            grade = "A";
        } else if (rata_rata >= 70.0) {
            grade = "B";
        } else if (rata_rata >= 50.0) {
            grade = "C";
        } else if (rata_rata >= 30.0) {
            grade = "D";
        } else {
            grade = "E";
        }

        System.out.print("Siswa yang bernama =" + nama + " ");
        System.out.println("Dengan Nilai Persentasi Yang dihasilkan");
        System.out.println("Nilai tugas * 20% =" + (int)alltugas);
        System.out.println("Nilai UTS * 30% =" + (int)nilaiuts);
        System.out.println("Nilai UAS * 50% = " + (int)nilaiuas);
        System.out.print("Jadi Siswa yang bernama" + nama + " ");
        System.out.println("memperoleh nilai akhir sebesar " + nilai_akhir);
        System.out.println("memperoleh nilai rata sebesar " + rata_rata);
        System.out.println("Grade nilai yang didapat adalah " + grade);
    }
}
