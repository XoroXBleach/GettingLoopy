public class DecreasingFigure {
    public static void main(String[] args) {
        int rows = 5; // number of rows in the pattern

        // outer loop to iterate through rows
        for (int i = rows; i >= 1; i--) {
            // inner loop to print '*' in decreasing order
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // move to the next line after each row is printed
            System.out.println();
        }
    }
}