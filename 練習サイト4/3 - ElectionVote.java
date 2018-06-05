import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map.Entry;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] C = br.readLine().split(" ");
        HashMap<String, Integer> votedMap = new HashMap<>();
        int max = 0;
        String name = new String();
        int vote = 0;
        boolean flag = false;

        for (int i = 0; i < C.length; ++i) {
            vote++;
            if (!votedMap.containsKey(C[i])) {
                votedMap.put(C[i], 1);
            } else {
                votedMap.put(C[i], votedMap.get(C[i]) + 1);
            }

            if (votedMap.get(C[i]) > max) {
                max = votedMap.get(C[i]);
                name = C[i];
            }
            if(){ // 当確になったら
                ~flag;
            }

            if (flag) {
                break;
            }
        }

        int counter = 0;
        for (Entry<String, Integer> map : votedMap.entrySet()) {
            if (map.getValue() == max) {
                ++counter;
            }
        }

        if (counter > 1) {
            System.out.println("TIE");
        } else {
            System.out.println(name + " " + vote);
        }
    }
}