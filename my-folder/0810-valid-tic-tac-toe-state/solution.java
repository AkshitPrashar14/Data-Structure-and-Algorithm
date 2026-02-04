class Solution {
    public boolean validTicTacToe(String[] board) {
        int countO=0;
        int countX=0;
        for(int i=0;i<board.length;i++){
            for(char c:board[i].toCharArray()){
                if(c=='O')countO++;
                if(c=='X')countX++;
            }
        }
        boolean winX=winTicTacToe(board,'X');
        boolean winO=winTicTacToe(board,'O');
        if(winX && winO)return false;
        if(winX && countX!=countO+1)return false;
        if(winO && countX!=countO)return false;
        if(countX>countO+1 || countO>countX)return false;
        return true;
    }
    boolean winTicTacToe(String[] board, char c){

    for(int i=0;i<3;i++){
        if(board[i].charAt(0)==c &&
           board[i].charAt(1)==c &&
           board[i].charAt(2)==c)
            return true;
    }
    for(int j=0;j<3;j++){
        if(board[0].charAt(j)==c &&
           board[1].charAt(j)==c &&
           board[2].charAt(j)==c)
            return true;
    }

    if(board[0].charAt(0)==c &&
       board[1].charAt(1)==c &&
       board[2].charAt(2)==c)
        return true;

    if(board[0].charAt(2)==c &&
       board[1].charAt(1)==c &&
       board[2].charAt(0)==c)
        return true;

    return false;
}

}
