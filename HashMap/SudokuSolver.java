class Solution {
    public static void solveSudoku(char[][] board){
        solve(board,0,0);
    }
    static boolean solve(char[][] mat,int i,int j){
        if(i==9) return true;
        int ni,nj;
        if(j==8){
            ni=i+1;
            nj=0;
        }else{
            ni=i;
            nj=j+1;
        }
        if(mat[i][j]!='.'){
            return solve(mat,ni,nj);
    }
        for(char ch='1' ; ch<='9'; ch++){
            if(isValid(mat,i,j,ch)){
                mat[i][j]=ch;
                if(solve(mat,ni,nj)) return true;
                mat[i][j]='.';
            }
        }
        return false;
    }
    static boolean isValid(char[][] mat, int i,int j,char ch){
            for(int p=0; p<9; p++){
                if(mat[i][p]==ch) return false;
                if(mat[p][j]==ch) return false;
            }
            int smi=(i/3)*3;
            int smj=(j/3)*3;
            for(int t=0; t<3; t++){
                for(int q=0; q<3; q++){
                    if(mat[smi + t] [smj + q] == ch) return false;
            }
        }
        return true;
    }
}
