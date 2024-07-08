public class IncreasingFigure {
    public static void main(String[] args) {
        int rows = 5; // number of rows in the pattern

        // outer loop to iterate through rows
        for (int i = 1; i <= rows; i++) {
            // inner loop to print '*' in increasing order
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // move to the next line after each row is printed
            System.out.println();
        }
    }
}
