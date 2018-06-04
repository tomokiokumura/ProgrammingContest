import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int wordCount = str[0].length();
        int width = Integer.parseInt(str[1]);
        int requiredNum = width - wordCount;
        int leftRequiredNum = (int) (requiredNum / 2);
        int rightRiquiredNum = requiredNum - leftRequiredNum;
        String leftUnderscore = new String();
        String rightUnderscore = new String();

        if (wordCount >= width) {
            System.out.println(str[0]);
        }
        else {
            for (int i = 0; i < leftRequiredNum; i++) {
                leftUnderscore += "_";
            }
            for (int i = 0; i < rightRiquiredNum; i++) {
                rightUnderscore += "_";
            }
            System.out.println(leftUnderscore + str[0] + rightUnderscore);
        }
    }
}