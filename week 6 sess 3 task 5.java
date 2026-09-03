import java.io.*;

class Result {

    /*
     * Complete the 'marsExploration' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int marsExploration(String s) {

        int count = 0;

        for (int i = 0; i < s.length(); i++) {

            char expected;

            if (i % 3 == 0 || i % 3 == 2) {
                expected = 'S';
            } else {
                expected = 'O';
            }

            if (s.charAt(i) != expected) {
                count++;
            }
        }

        return count;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader =
            new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bufferedWriter =
            new BufferedWriter(
                new FileWriter(System.getenv("OUTPUT_PATH"))
            );

        String s = bufferedReader.readLine();

        int result = Result.marsExploration(s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
output:
Input (stdin)
SOSSPSSQSSOR
Your Output (stdout)
3
Expected Output
3

