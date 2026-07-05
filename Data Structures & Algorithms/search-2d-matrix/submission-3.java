class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            
            for (int j = 0; j < matrix[i].length; j++) {
                
                int low=j;
                int high=matrix[i].length-1;

                if(target<=matrix[i][high]) {
                    while(low<=high){
                        int mid= low + (high-low)/2;

                        if(matrix[i][mid]==target) return true;

                        if(matrix[i][mid]<target) low = mid+1;
                        else high = mid -1;
                }
                }
            }
        }
        return false;
        
    }
}
