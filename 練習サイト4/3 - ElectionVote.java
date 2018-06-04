import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] C = br.readLine().split(" ");
        HashMap<String, Integer> votedMap = new HashMap();
        int max = 0;
        String name = new String();
        int vote = 0;
        for (int i = 0; i < C.length; i++) {
            if (!votedMap.containsKey(C[i])) {
                votedMap.put(C[i], 1);
            }
            else {
                int temp = votedMap.get(C[i]);
                temp++;
                votedMap.replace(C[i], temp);
            }
            if (votedMap.get(C[i]) > max) {
                max = votedMap.get(C[i]);
                name = C[i];
                vote = i + 1;
            }
            if (votedMap.get(C[i]) > N / 2) {
                name = C[i];
                vote = i + 1;
                break;
            }
        }

        int counter = 0;
        for (int i = 0; i < votedMap.size(); i++) {
            if (votedMap.get(C[i]) == max) {
                counter++;
            }
        }

        if (counter > 1) {
            System.out.println("TIE");
        }
        else {
            System.out.println(name + " " + vote);
        }
    }
}