import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = Integer.parseInt(str[i]);
        }

        int[][] counter = new int[N][3];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if ((a[i] - 1 == a[j] - 1) | (a[i] - 1 == a[j]) | (a[i] - 1 == a[j] + 1)) {
                    counter[i][0]++;
                } else if ((a[i] == a[j] - 1) | (a[i] == a[j]) | (a[i] == a[j] + 1)) {
                    counter[i][1]++;
                } else if ((a[i] + 1 == a[j] - 1) | (a[i] + 1 == a[j]) | (a[i] + 1 == a[j] + 1)) {
                    counter[i][2]++;
                }
            }
        }

        int max = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 3; j++) {
                if (max < counter[i][j]) {
                    max = counter[i][j];
                }
            }
        }

        System.out.println(max);
    }
}