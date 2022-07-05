package org.example;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] score = new int[2];

        score[0] = Integer.parseInt(br.readLine());
        score[1] = Integer.parseInt(br.readLine());

        int ascore = score[0];
        int bscore = score[1];

        if((ascore - bscore)%3 == 0){

            int ateamwon = ascore/3;
            int drawnum = (ascore%3)/1;
            int bteamwon = (bscore-drawnum)/3;

            bw.write(ateamwon+" ");
            bw.write(drawnum+" ");
            bw.write(bteamwon+" ");

        }else{
            bw.write("-1");
        }
        bw.flush();
        bw.close();
    }
}