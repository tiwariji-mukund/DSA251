/* You are given a square matrix of non-negative integers of size 'N'x'N'. Your task is to rotate it by 90 degrees in an 
anti-clockwise direction without using any extra space.

For Examples: 

Input:
Matrix:  1  2  3
         4  5  6
         7  8  9

Output:  3  6  9 
         2  5  8 
         1  4  7 

Input:
Matrix:  1  2  3  4 
         5  6  7  8 
         9 10 11 12 
         13 14 15 16 

Output:  4  8 12 16 
         3  7 11 15 
         2  6 10 14 
         1  5  9 13
*/

public static Solution{
  
  public static void inplaceRotate(int arr[][], int n){
    for(int i=0; i<n; i++){
      for(int j=i; j<n; j++){
        int temp = arr[i][j];
        arr[i][j] = arr[j][i];
        arr[j][i] = temp;
      }
    }

    for(int i=0; i<n/2; i++){
      for(int j=0; j<n; j++){
        int temp = arr[i][j];
        arr[i][j] = arr[n-i-1][j];
        arr[n-i-1][j] = temp;
      }
    }
  }
}
