import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] str = s.split("ta");
        s = "";
        for (int i = 0; i < str.length; i++) {
            s += str[i];
        }

        System.out.println(s);
    }
}