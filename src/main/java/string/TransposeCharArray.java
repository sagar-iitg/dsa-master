package string;

public class TransposeCharArray {
    public static void main(String[] args) {
        // Sample array of strings with variable lengths
        String[] stringArray = {"Hello", "World", "123"};

        // Calculate dimensions of the original array
        int rows = stringArray.length;
        int maxCols = 0;

        // Find the maximum length of a string in the array
        for (String str : stringArray) {
            if (str.length() > maxCols) {
                maxCols = str.length();
            }
        }

        // Create a new transposed character array
        char[][] transposedArray = new char[maxCols][rows];

        // Transpose the original array
        for (int i = 0; i < rows; i++) {
            String str = stringArray[i];
            for (int j = 0; j < str.length(); j++) {
                transposedArray[j][i] = str.charAt(j);
            }
        }

        // Print the transposed array
        for (int i = 0; i < maxCols; i++) {
            for (int j = 0; j < rows; j++) {
                if (transposedArray[i][j] != '\0') {
                    System.out.print(transposedArray[i][j] + " ");
                } else {
                    System.out.print("  "); // Print spaces for missing characters
                }
            }
            System.out.println();
        }
    }
}
