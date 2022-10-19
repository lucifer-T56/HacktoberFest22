class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> check = new HashSet<>();
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                int n=board[i][j];
                if(n != '.'){
                    if(!check.add(n + "in row" + i) || 
                       !check.add(n + "in col" + j) || 
                       !check.add(n+" in box"+i/3+"-"+j/3)){
                        return false;
                    }
                }
            }
        } 
        return true;  
    }
}
