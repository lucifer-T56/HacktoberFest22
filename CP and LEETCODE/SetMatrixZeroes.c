void setZeroes(int** matrix, int matrixSize, int* matrixColSize)
{
    int i,j,x;
    x=*matrixColSize;
    bool row[matrixSize],col[x];
    for(i=0;i<=matrixSize-1;i++)
        row[i]=false;
    for(j=0;j<=x-1;j++)
        col[j]=false;
        
    for(i=0;i<=matrixSize-1;i++)
        for(j=0;j<=x-1;j++)
            if(matrix[i][j]==0) 
            {
                row[i]=true;
                col[j]=true;
            }
    
    for(i=0;i<=matrixSize-1;i++)
        for(j=0;j<=x-1;j++)
            if(row[i]==true || col[j]==true)
                matrix[i][j]=0;
}
