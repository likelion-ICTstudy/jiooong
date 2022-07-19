import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        int sum = 0;
        int max = 0;

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        for(int i=0; i<10; i++){
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

            int off = Integer.parseInt(stringTokenizer.nextToken());
            int on = Integer.parseInt(stringTokenizer.nextToken());

            int left = on-off;

            sum+=left;

            if(max < sum){
                max = sum;
            }
        }
        System.out.println(max);
    }
}
