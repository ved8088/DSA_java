public class evenNosofdigiLinear {
    public static void main(String[] args) {

        int nums[] = {0};
        int ans = findNumbers(nums);
        System.out.println(ans);

    }


    static int findNumbers(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(even(nums[i])){
                count++;
            }
        }
        return count;
    }

   static boolean even(int num){
        int numOfdigi = digits(num);
//        if(numOfdigi % 2 == 0){
//            return true;
//        }else{
//            return false;
//        }
       return numOfdigi % 2 == 0;

    }

    //count number of digits in a number
   static int digits(int num){

        if(num < 0){
            num = num * -1;
        }

        if(num == 0){
            return 1;
        }

        int count =0;

        while(num>0){
            count++;
            num = num/10;

        }

        return count;


    }

}




