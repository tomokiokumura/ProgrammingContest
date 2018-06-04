import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] P = br.readLine().split(" ");
        String[] Q = br.readLine().split(" ");
        int[] p = new int[N];
        int[] q = new int[N];
        double sum = 0.0;

        for (int i = 0; i < N; i++) {
            p[i] = Integer.parseInt(P[i]);
            q[i] = Integer.parseInt(Q[i]);
            sum += Math.pow(p[i] - q[i], 2);
        }

        BigDecimal ans = new BigDecimal(Math.sqrt(sum));
        System.out.println(ans.setScale(2, BigDecimal.ROUND_HALF_UP));
    }
}