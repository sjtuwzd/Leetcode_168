import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class LC_168 {
    public String convertToTitle(int n) {
        // String builder is usually faster than String because it tends to be varible
        StringBuilder result = new StringBuilder();

        //map from 1-26 to 0-25
        while(n > 0) {
            n--;
            result.insert(0, (char) ('A' + n % 26));
            n/=26;
        }

        //return a string type
        return result.toString();
    }
}

 class MainClass {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int n = Integer.parseInt(line);

            String ret = new LC_168().convertToTitle(n);

            String out = (ret);

            System.out.print(out);
        }
    }
}