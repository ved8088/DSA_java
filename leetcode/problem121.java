package leetcode;

class problem121 {
    public int maxProfit(int[] prices) {
        
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int price: prices){
            if(price < minPrice){
                minPrice = price;
            } else{
                maxProfit = Math.max(maxProfit, price - minPrice);

            }
        }
        return maxProfit;

    }

    public static void main(String[] args) {
        problem121 ans = new problem121();

        int ques[] = new int[]{7,1,5,3,6,4};

       System.out.println(ans.maxProfit(ques));
    }
}