package cz.acamar.tasks;

public class Task1 {

    /**
     * Task 1. Length of the last word.
     * <p>
     * Given a string s consisting of some words separated by some number of spaces,
     * return the length of the last word in the string.
     * <p>
     * A word is a maximal substring consisting of non-space characters only.
     * <p>
     * Example input: "Hello World"
     * Expected output: 5
     *
     * @param str - a string s consisting of some words separated by some number of spaces.
     * @return - the length of the last word in the string.
     */
    public int lengthOfLastWord(String str) {
        if (str == null || str.length() == 0) {
            return 0;
        }
        // find the end of the last word
        int idxEnd = str.length() - 1;
        while (idxEnd >= 0 && Character.isSpaceChar(str.charAt(idxEnd))) {
            idxEnd--;
        }
        if (idxEnd == -1) {
            return 0;
        }
        // find the start of the last word
        int idxStart = idxEnd - 1;
        while (idxStart >= 0 && !Character.isSpaceChar(str.charAt(idxStart))) {
            idxStart--;
        }
        return idxEnd - idxStart;
    }
}
