#include <iostream>
using namespace std;
int indexseqsearch(int A[] , int n , int key)
{
    int B[20];
    int i =0;
    int step = 0;
    for( i = 0 ;i < n ;i++)
    {
        if (step<n){
            A[i] = step;
            step=+4;
        }
        else 
        break;  
    
    }
  if ( A[i-1]!=n-1)
  {
    A[i] = n-1;
  }
  while(i<s&&key>A[i])
  {
  i++;
  if(i<s)
  {
    if(B[A[i]]==key){
        return A[i];
    }
    else
    int end = A[i] - 1;
    int start = A[i-1]+1;
    for(int j = start ; j<end; j++)
    {
        if(A[j]==key)
        return j ;
    }
   }
  }
}



int main()
{
 int A[20]={2,3,4,5,6,7,8,9,10,12,14,15,16,17,18,19};
int n = 16;
int key = 9;
indexseqsearch(A,n,key);
return 0 ;
}
    
