package Accenture_cheatsheet_codingRound;

// The function accepts a string ‘strʼ as its argument.
// The function needs to return the transformed string by replacing all occurrences of the character ‘aʼ
// with the character ‘bʼ and vice versa. Input:str:abaabbcc , Output:bbbbaaac

import java.util.Arrays;

public class Replacing_occurrences {

    public static String replace_function(String str){
        char temp[]=str.toCharArray();
        for(int i=0;i<temp.length;i++){
            if(temp[i]=='a'){
               temp[i]='b';
           }
            else if(temp[i]=='b'){
               temp[i]='a';
           }
            else{
                continue;
            }
       }
        String str2= Arrays.toString(temp);

        return str2;
    }

    public static void main(String[] args) {
        String str="aababbcc";
        String output= Replacing_occurrences.replace_function(str);
       System.out.println(output);

    }

}
