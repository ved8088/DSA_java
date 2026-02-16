package leetcode;

public class problem88 {
    public void merge(int[] num1,int[] num2,int n,int m){
        int[] temp = new int[n+m];

        int i=0,j=0,k = 0;

        while(i<m && j< n){
            if(num1[i] < num2[j]){
                  temp[k] = num1[i];
                  i++;
            }else{
                temp[k] = num2[j];
                j++;
            }
            k++;
        }

        while(i<m){
            temp[k] = num1[i];
            i++;
            k++;
        }

        while(j<n){
            temp[k] = num2[j];
            j++;
            k++;
        }

        for(int x=0; x<m;x++){
            num1[x] = temp[x];
        }

    }
}
