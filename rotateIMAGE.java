class Solution {
    public void rotate(int[][] matrix) {  
          
int n = matrix.length;
int result;
//int [][] final;
// 2 loop chalega i aur j ka 
  for (int i =0;i<n;i++) // yeh to sahi h 
{
    for(int j =i+1;j<n;j++)          //  90 degree rotation hoga 
{
result=matrix[i][j];
matrix[i][j]=matrix[j][i];
matrix[j][i] =result;   //     transpose hoagya hai 
}
}

// ROW REVERSEEEEEEEEreverse ab hoga 
for(int i=0;i<n;i++)
{

for(int j=0;j<n/2;j++){    
result=matrix[i][j];
matrix[i][j]=matrix[i][n-1-j];    // yahan pe dikkat hai 
matrix[i][n-1-j]=result;   
}
}    // n-1 last index of row    // yahn pe j jo current hai wo bhi add krrn a h  
// +j se bhi ouof bound jaara 
    }
}