class Solution {
    public boolean rotateString(String s, String goal) {

        // Lengths must be equal
        if (s.length() != goal.length()) {
            return false;
        }

        // If goal is a rotation of s,
        // it must appear inside s + s
        String doubled = s + s;

        return doubled.contains(goal);
    }
}
output:
Input
s =
"m"
goal =
"f"
Output
false
Expected
false