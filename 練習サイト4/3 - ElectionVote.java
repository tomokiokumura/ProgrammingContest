import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] C = br.readLine().split(" ");

        int[] charCount = new int[26];
        int voteCount = 0;
        int first = 0;
        int second = 0;

        for (String s : C) {
            charCount[s.charAt(0) - 'A']++;
            voteCount++;

            int[] temp = charCount.clone();
            Arrays.sort(temp);
            first = temp[temp.length - 1];
            second = temp[temp.length - 2];
            if (N - voteCount < first - second) {
                break;
            }
        }

        if (first == second) {
            System.out.println("TIE");
        } else {
            for (int i = 0; i < charCount.length; i++) {
                if (charCount[i] == first) {
                    System.out.println((char)('A' + i) + " " + voteCount);
                }
            }
        }
    }
}