import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        char head = line.charAt(0);
        char tail = line.charAt(line.length() - 1);
        String ans = new String();
        int length =  line.length();

        if (length % 2 == 0) {
            String left = line.substring(1, length / 2);
            String right = line.substring(length / 2, length - 1);
            ans = left + head + tail + right;
        }
        else { // length % 2 != 0
            String left = line.substring(1, (int) (length / 2));
            String right = line.substring((int) (length / 2) + 1, length - 1);
            char center = line.charAt((int) (length / 2));
            ans = left + head + center + tail + right;
        }
        System.out.println(ans);
    }
}