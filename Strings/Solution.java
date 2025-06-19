package Strings;

import java.util.Arrays;

class Solution {
    public static void main(String[] args) {

        String word[] = {"a","e","i"};

        int queries[][] = {
                {0, 2},
                {0,1},
                {2,2}
        };

        int vowelsCount[] = new int[queries.length];
        int wordCount;


        for(int i=0;i<queries.length;i++){
            wordCount = ans(queries[i],word);
            vowelsCount[i] = wordCount;
        }


        System.out.println(Arrays.toString(vowelsCount));


    }

    static int ans(int range[],String word[]){
        int count = 0;
        int start = range[0];
        int end = range[1];

        for (int i=start;i<=end;i++){
                if(example(word[i]) == true ){
                    count++;
                }
        }
        return count;


    }



    static boolean example(String word){
        char wordS,wordE;
        if(word.length() == 1){
            if(word.charAt(0) == 'a'||word.charAt(0) == 'e'||word.charAt(0)=='i'||word.charAt(0)=='o'||word.charAt(0)=='u'){
                return true;
            }
        }

        if(word.length() > 1){
             wordS = word.charAt(0);
             wordE = word.charAt(word.length()-1);

               if((wordS == 'a'||wordS== 'e'||wordS=='i'||wordS=='o'||wordS=='u')&&
                 (wordE == 'a'||wordE== 'e'||wordE=='i'||wordE=='o'||wordE=='u')){
                   return true;
               }

        }else{
            return false;
        }


        return false;

    }

}