import java.io.*;

class Result {

    /*
     * Complete the 'palindromeIndex' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int palindromeIndex(String s) {

        int left = 0;
        int right = s.length() - 1;

        // Find the first mismatch
        while (left < right) {

            if (s.charAt(left) != s.charAt(right)) {

                // Check if removing left character works
                if (isPalindrome(s, left + 1, right)) {
                    return left;
                }

                // Check if removing right character works
                if (isPalindrome(s, left, right - 1)) {
                    return right;
                }

                // No possible removal
                return -1;
            }

            left++;
            right--;
        }

        // Already a palindrome
        return -1;
    }

    // Checks whether the substring from left to right is a palindrome
    private static boolean isPalindrome(String s, int left, int right) {

        while (left < right) {

            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
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

            String s = bufferedReader.readLine();

            int result = Result.palindromeIndex(s);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}
output:
input (stdin)
3
aaab
baa
aaa
Your Output (stdout)
3
0
-1
Expected Output
3
0
-1
