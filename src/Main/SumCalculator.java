import java.util.Scanner;

/**
 * Kelas SumCalculator menyediakan metode untuk menghitung jumlah angka input pengguna.
 * Ini meminta pengguna untuk memasukkan jumlah angka yang akan dijumlahkan dan kemudian setiap nomor individual.
 * Hasilnya ditampilkan ke konsol.
 */
public class SumCalculator {
    private int sum;

    /**
     * Menghitung jumlah sejumlah bilangan bulat tertentu yang dimasukkan oleh pengguna.
     * Metode ini mengatur proses input, komputasi, dan tampilan.
     */
    public void calculateSum() {
        int count = getNumberCount();
        sum = computeSum(count);
        displayResult();
    }

    /**
     * Prompts the user to enter the number of integers they wish to sum.
     * @return the count of numbers to be summed
     */
    private int getNumberCount() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah angka yang ingin dijumlahkan: ");
        return scanner.nextInt();
    }

    /**
     * Computes the sum of the specified count of integers input by the user.
     * @param count the number of integers to sum
     * @return the total sum of the specified integers
     */
    private int computeSum(int count) {
        int total = 0;
        for (int i = 0; i < count; i++) {
            total += getNumber(i);
        }
        return total;
    }

    /**
     * Prompts the user to enter an integer value.
     * @param index the index of the current number being requested
     * @return the integer input by the user
     */
    private int getNumber(int index) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan angka ke-" + (index + 1) + ": ");
        return scanner.nextInt();
    }

    /**
     * Displays the computed sum result to the console.
     */
    private void displayResult() {
        System.out.println("Jumlah total: " + sum);
    }
}
