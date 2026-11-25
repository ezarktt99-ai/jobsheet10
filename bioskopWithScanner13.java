import java.util.Scanner;

public class bioskopWithScanner13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int baris, kolom, menu;
        String nama, next;

        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("\nMenu bioskop: ");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            menu = sc.nextInt();
            sc.nextLine();

            if (menu == 1) {
                while (true) {
                    System.out.print("Masukkan nama: ");
                    nama = sc.nextLine();

                    while (true) {
                        System.out.print("Masukkan baris (1-" + penonton.length + "): ");
                        baris = sc.nextInt();
                        System.out.print("Masukkan kolom (1-" + penonton[0].length + "): ");
                        kolom = sc.nextInt();
                        sc.nextLine();

                        if (baris < 1 || baris > penonton.length || kolom < 1 || kolom > penonton[0].length) {
                            System.out.println("Peringatan: Nomor baris atau kolom kursi tidak tersedia! Silakan masukkan kembali.");
                            continue;
                        }

                        if (penonton[baris - 1][kolom - 1] != null) {
                            System.out.println("Peringatan: Kursi pada baris " + baris + " kolom " + kolom +
                                    " sudah terisi oleh " + penonton[baris - 1][kolom - 1] + "! Silakan masukkan baris dan kolom kembali.");
                        } else {
                            penonton[baris - 1][kolom - 1] = nama;
                            break;
                        }
                    }

                    System.out.print("Input penonton lainnya? (y/n): ");
                    next = sc.nextLine();
                    if (next.equalsIgnoreCase("n")) {
                        break;
                    }
                }
            } else if (menu == 2) {
                System.out.println("\nDaftar pennton: ");
                for (int i = 0; i < penonton.length; i++) {
                    for (int j = 0; j < penonton[i].length; j++) {
                        String isiKursi = (penonton[i][j] == null) ? "***" : penonton[i][j];
                        System.out.print(isiKursi + "\t");
                    }
                    System.out.println();
                }
            } else if (menu == 3) {
                System.out.println("Terima kasih. Program selesai.");
                break;
            } else {
                System.out.println("Pilihan menu tidak valid.");
            }
        }

    }
}
