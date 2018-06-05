import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeMap;
import java.util.Map.Entry;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line1 = br.readLine().split(",");
        String line2 = br.readLine();
        TreeMap<Integer, String> map = new TreeMap<>();
        for (int i = 0; i < line1.length; i++) {
            String[] str = line1[i].split("\\|");
            map.put(Integer.parseInt(str[1]), str[0]);
        }

        int ans = 0;
        for (Entry<Integer, String> tempMap : map.entrySet()) {
            if (line2.matches(".*" + tempMap.getValue() + ".*")) {
                ans += tempMap.getKey();
            }
        }

        System.out.println(ans);
    }
}