class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        int n=mat[0].length;
        for(int i=0;i<mat[0].length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(i==j||i+j==n-1){
                    sum+=mat[i][j];
                }
            }
        }

        return sum;


    }
}