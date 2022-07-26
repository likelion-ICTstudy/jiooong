import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        String value = sc.next();
        long sum = 0;
        long r = 1;

        for(int i=0;i<L;i++){
             //sum+=((value.charAt(i)-96) * Math.pow(31, i) % 1234567891); 
            //sum+=((value.charAt(i)-96) % 1234567891) * (Math.pow(31, i) % 1234567891) % 1234567891;
            sum+=(value.charAt(i)-96) * r % 1234567891;
            r=r*31 % 1234567891;


        } 

        System.out.println(sum % 1234567891);

    }
}
//모듈러 연산을 사용해야한다. 단순히 Math.pow를 사용해 제곱을 구하던지 , 31을 매번 곱하는 경우에는 50점밖에 받지 못한다.
