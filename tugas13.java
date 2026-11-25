import java.util.Scanner;

public class tugas13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[][] survei = new double[10][6];

        System.out.println("INPUT HASIL SURVEI (10 Responden x 6 Pertanyaan) ");
        for (int i = 0; i < 10; i++) {
            System.out.println("Responden ke-" + (i + 1));
            for (int j = 0; j < 6; j++) {
                System.out.print("  Pertanyaan ke-" + (j + 1) + ": ");
                survei[i][j] = sc.nextDouble();
            }
        }

       
        System.out.println("\nRATA-RATA SETIAP RESPONDEN: ");
        for (int i = 0; i < 10; i++) {
            double total = 0;
            for (int j = 0; j < 6; j++) {
                total = total + survei[i][j];
            }
            double rata = total / 6.0;
            System.out.printf("Rata-rata responden ke-%d: %.2f%n", (i + 1), rata);
        }

        System.out.println("\nRATA-RATA SETIAP PERTANYAAN: ");
        for (int j = 0; j < 6; j++) {
            double total = 0;
            for (int i = 0; i < 10; i++) {
                total = total + survei[i][j];
            }
            double rata = total / 10.0;
            System.out.printf("Rata-rata pertanyaan ke-%d: %.2f%n", (j + 1), rata);
        }

        sc.close();
    }
}
