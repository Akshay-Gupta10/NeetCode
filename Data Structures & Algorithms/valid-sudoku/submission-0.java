class Solution {
    public boolean check(char board[][],int i,int j){
        //checking same row
        for(int col=0;col<9;col++){
            if(col==j) continue;
            if(board[i][j]==board[i][col]) return false;
        }

        //checking same col
        for(int row=0;row<9;row++){
            if(row==i) continue;
            if(board[i][j]==board[row][j]) return false;
        }

        //checking small grid
        int row=i/3;
        int col=j/3;

        int st=row*3;
        int sc=col*3;

        for(int x=st;x<st+3;x++){
            for(int y=sc;y<sc+3;y++){
                if(x==i && y==j) continue;
                if(board[i][j]==board[x][y]) return false;
            }
        }

        return true;
    }
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]!='.'){
                    if(check(board,i,j)==false) return false;
                }
            }
        }
        return true;
    }
}
