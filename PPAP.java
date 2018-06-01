import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        for (int i = 0; i < str.length; i++) {
            str[i] = Character.toTitleCase(str[i].charAt(0)) + str[i].substring(1);
        }

        System.out.println(String.join(" ", str));
    }
}