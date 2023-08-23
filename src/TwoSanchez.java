import  java.util.Scanner;
public class TwoSanchez {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("chose a number");
        int n = Integer.parseInt(scan.nextLine());

        long[] numbers = new long[n];
        if (n > 0) {
            numbers[0]= 0;
           numbers[1]=1;

            for (int i = 2; i < n; i++) {
                numbers[i] = numbers[i - 1] + numbers[i - 2];

            }


        }
        for (int i = 0; i < n; i++) {
            System.out.print("          "+numbers[i]);

        }
    }
}





