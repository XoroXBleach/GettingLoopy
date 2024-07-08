public class FiveLines {
    public static void main(String[] args) {

        // outer loop to iterate through rows
        for (int i = 1; i <= 5; i++) {
            // inner loop to print '*' in repeating order
            for (int j = 1; j <= 5; j++) {
                System.out.print("*");
            }
            // move to the next line after each row is printed
            System.out.println();
        }
    }
}
