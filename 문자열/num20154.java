import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main (String[] args) throws IOException {
       int[] arr = {3,2,1,2,3,3,3,3,1,1,3,1,3,3,1,2,2,2,1,2,1,1,2,2,2,1};

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String alpha = br.readLine();
        int[] arr2 = new int[alpha.length()];
        int sum=0;

        for(int i=0; i<alpha.length(); i++){
          arr2[i] = arr[alpha.charAt(i)-'A']; // 인덱스 0은 A , 1은 B ... 이런식으로 계산을 통해 값을 넣어주기
        }

        for(int i=0; i<alpha.length(); i++){
            sum+=arr2[i];
            if(sum>=10) {
                sum %= 10;
            }
        }

        if(sum%2==1){
            System.out.println("I'm a winner!");
        }else{
            System.out.println("You're the winner?");
        }

    }
}
