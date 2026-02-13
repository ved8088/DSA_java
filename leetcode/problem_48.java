package leetcode;

public class problem_48 {

    public int[][] rotate(int[][] matrix){

        int n = matrix.length;
        int[][] rotated = new int[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                rotated[j][n-i-1] = matrix[i][j];
            }
        }

        return rotated;
    }

    public static void main(String[] args) {
        int[][] mat = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        problem_48 sol = new problem_48();

        int[][] solu = sol.rotate(mat);

        System.out.println("before");


        for(int[] row: mat){
            for(int val: row){
                System.out.print(val + " ");

            }
            System.out.println();
        }

        System.out.println("after");

        for(int[] row: solu){
            for(int val: row){
                System.out.print(val + " ");

            }
            System.out.println();
        }


    }

}
