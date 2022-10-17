/*A program to find the maximum sub-array sum using Kadane's Algorithm*/

#include <stdio.h>

int max(int num1, int num2)
{
	if(num1>num2)
		return num1;
	return num2;
}

int maxSubArraySum(int *array, int n)
{
	int i,currSum,maxSum;
	maxSum=currSum=array[0];
	for(i=1;i<=n-1;i++)
	{
		currSum=max((currSum+array[i]),array[i]);
		if(currSum>maxSum)
			maxSum=currSum;
	}
	    
    return maxSum;
}

int main()
{
	int i,n;
    printf("Enter the size of the array: ");
    scanf("%d",&n);
	int arr[n];
    printf("\nEnter array elements: ");
    for(i=0;i<=n-1;i++)
	    scanf("%d",&arr[i]);
    printf("\nMaximum Subarray sum of the given array: %d",maxSubArraySum(arr,n));
    
    return 0;
}
