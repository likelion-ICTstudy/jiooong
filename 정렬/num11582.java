package org.example;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static int[] A, tmp;


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

         int N = Integer.parseInt(br.readLine()); //치킨집의 개수

        A = new int[N+1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            A[i]=Integer.parseInt(st.nextToken());
        }
        tmp = new int[N+1];

         int K = Integer.parseInt(br.readLine()); // 회원들의 수

        merge_sort(N,K, 1,N);
        for(int i =0; i<N; i++){
            System.out.print(A[i]+" ");

        }

    }
    private static void merge_sort(int N, int K, int s, int e){
        if (e-s < 1) return; //병합정렬
        //if (e-s > N/K) return;

        int m = s+(e-s)/2;
        merge_sort(N,K,s,m);
        merge_sort(N,K,m+1,e);
        for(int i =s; i<=e; i++) {
            tmp[i] = A[i];
        }
        int k = s;
        int index1 =s;
        int index2=m+1;
        while(index1<=m && index2 <=e){
            if(tmp[index1]>tmp[index2]) {
                A[k] = tmp[index2];
                k++;
                index2++;
            }else {
                A[k] = tmp[index1];
                k++;
                index1++;
            }
        }
        while(index1<=m){
            A[k] = tmp[index1];
            k++;
            index1++;
        }
        while(index2 <= e) {
            A[k] =tmp[index2];
            k++;
            index2++;
        }
    }
}
