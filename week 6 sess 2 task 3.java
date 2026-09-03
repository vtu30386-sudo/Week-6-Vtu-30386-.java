import java.io.*;
import java.util.*;

class Result {

    /*
     * Complete the 'twoStrings' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s1
     *  2. STRING s2
     */

    public static String twoStrings(String s1, String s2) {

        boolean[] present = new boolean[26];

        // Store characters of s1
        for (int i = 0; i < s1.length(); i++) {
            present[s1.charAt(i) - 'a'] = true;
        }

        // Check characters of s2
        for (int i = 0; i < s2.length(); i++) {
            if (present[s2.charAt(i) - 'a']) {
                return "YES";
            }
        }

        return "NO";
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

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        for (int qItr = 0; qItr < q; qItr++) {

            String s1 = bufferedReader.readLine();
            String s2 = bufferedReader.readLine();

            String result = Result.twoStrings(s1, s2);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}

output:
Input (stdin)
2
hello
world
hi
world
Your Output (stdout)
YES
NO
Expected Output
YES
NO