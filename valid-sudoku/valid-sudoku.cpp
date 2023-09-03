class Solution {
public:
    bool isValidSudoku(vector<vector<char>>& board) {
        
        bool r[9][9]={false}; //hashmap for 9 rows
        bool c[9][9]={false}; //hashmap for 9 cols
        bool sq[9][9]={false}; //hashmap for 9 squares
        
        for(int i =0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                if(board[i][j]=='.')
                    continue;
                else
                {
                    int numIndex=board[i][j]-'0'-1;
                    int sqrIndex= (i/3)*3 + (j/3);
                    
                    if(r[i][numIndex] || c[j][numIndex] || sq[sqrIndex][numIndex])
                        return false;
                    
                    r[i][numIndex]=true;
                    c[j][numIndex]=true;
                    sq[sqrIndex][numIndex]=true;
                }
            }
        }
        
        return true;
    }
};