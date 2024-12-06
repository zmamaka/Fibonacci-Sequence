import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n, total = 0, x1 = 0, x2 = 1;

        System.out.print("Kaçıncı elemana kadar hesaplanacak => ");
        n = scan.nextInt();

        for (int i = 0; i <= n; i++){

            if (i == 0)
                System.out.print(i + ", ");
            else if (i == 1)
                System.out.print(i + ", ");
            else {

                total = x1 + x2;

                x1 = x2;

                x2 = total;

                System.out.print(total + " ");

            }
        }

    }
}
