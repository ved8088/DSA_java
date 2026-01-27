package leetcode;

public class problem28leetcode {
    public static void main(String[] args) {

    }

    public int strStr(String haystack, String needle){

        int n = haystack.length();
        int m = needle.length();

        //case 1 for if needle is not given
        if(m == 0){
            return 0;
        }

        //case 2 for haystack and needle both's when their length is 1
        if(n == 1 && m == 1){
            if(haystack.charAt(0) == needle.charAt(0)){
                return 0;
            }else{
                return -1;
            }
        }

        //case 3 this is for whose length is 1 and haystack has usual length
        if(m == 1){
            for(int k=0;k<n;k++){
                if(haystack.charAt(k) == needle.charAt(0)){
                    return k;
                }
            }
            return -1;
        }

        //case 4 this is the main case where usual both have some lengths
        for(int i=0;i<n-m;i++){
            int j=0;
            while( j < m && haystack.charAt(i + j) == needle.charAt(j) ){
                j++;
            }

            if(j == m ){
                return i;
            }
        }

        return -1;
    }
}
