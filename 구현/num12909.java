
import java.util.*;

class Solution {
    boolean solution(String s) {
        
        boolean answer = false;
        
        int count =0;
       
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='('){
                count++;
            }
            if(s.charAt(i)==')'){
                count--;
            } 
            if(count<0){
                answer = false;
               
            }
        }
        
     
        if(count==0){
            answer = true;
        } else {
            answer = false;
        }
        
        return answer;
    }
}
