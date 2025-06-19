public class merge2Strings {
    public static void main(String[] args) {
        String str1 = "ABCABC";
        String str2 = "ABC";

        System.out.println("ans--->>> " + gcdOfStrings(str1,str2));
    }
//    public String mergeAlternately(String word1, String word2) {
//        String add = word1 + word2;
//        int word1len = word1.length();
//        String result;
//        for(int i=0;i<add.length();i++){
//            result = word1.charAt(i) + word2.charAt(i);
//        }
//        return result;
//
//    }

    static String gcdOfStrings(String str1, String str2) {
        StringBuilder answer = new StringBuilder();
        String min = str1.length() > str2.length() ? str2:str1;
        int count = 0;
        int i=0;

        while(i<min.length()-1){
            if(str1.charAt(i) == str2.charAt(i)){
                count++;
                i++;
            }else{
                return "";
            }
        }

        while(i<count){
         answer = answer.append(str1.charAt(i));
            i++;
        }
        return answer.toString();
    }
}
