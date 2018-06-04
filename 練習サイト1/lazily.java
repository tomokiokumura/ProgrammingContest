import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine().replaceAll("\\s", "");
        String[] strNum = line.split("\\+|\\-");
        int[] num = new int[strNum.length];
        String[] strOpe = line.replaceAll("[0-9]", "").split("");
        for (int i = 0; i < strNum.length; i++) {
            num[i] = Integer.parseInt(strNum[i]);
        }

        int ans = num[0];
        for (int i = 0; i < strOpe.length; i++) {
            if (strOpe[i].equals("+")) {
                ans += num[i + 1];
            }
            else if(strOpe[i].equals("-")){
                ans -= num[i + 1];
            }
        }
        System.out.println(ans);
    }
}