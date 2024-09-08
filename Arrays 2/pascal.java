public class pascal {
    public static void main(String args[]) {
        int n = 6; // Number of rows to print
        for (int j = 0; j < n; j++) {
            int ans = 1; // Initialize the first value in a line to 1
            System.out.print(ans + " ");
            for (int i = 1; i <= j; i++) {
                ans = ans * (j - i + 1) / i;
                System.out.print(ans + " ");
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
