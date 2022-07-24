import java.util.Scanner;

public class practice {
    public static void update(int matrix[][],int row,int col)
    {
        for(int i=0;i<8;i++)
            matrix[row][i]=-1;
        for(int j=0;j<8;j++)
            matrix[j][col]=-1;
    }
    public static void main(String[] args) {
        
    }
    public int GetBuildingCount(int input1,int[][] input2) {
        int row=0;
        int col=0;
        int matrix[][]=new int[8][8];
        Array
        for (int i = 0; i < input; i++) {
            row=input2[i][0];
            col=input2[i][1];
            update(matrix, row, col);
        }
        int count=0;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if(matrix[i][j]==-1)
                    count++;
            }
        }
        System.out.println(count);
    }
}
