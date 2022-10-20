/A program to sort an array using Merge Sort method/

#include <stdio.h>

void merge(int *array, int left, int mid, int right)
{
    int i,j,k;
    int n1=mid-left+1,n2=right-mid;
    int L[n1],R[n2];
    for(i=0;i<=n1-1;i++)
        L[i]=array[left+i];
    for(j=0;j<=n2-1;j++)
        R[j]=array[mid+1+j];
    i=0;
    j=0;
    k=left;
    while(i<=n1-1 && j<=n2-1)
    {
        if(L[i]<=R[j])
        {
            array[k]=L[i];
            i++;
        }
        else
        {
            array[k]=R[j];
            j++;
        }
        k++;
    }
    while(i<=n1-1)
    {
        array[k]=L[i];
        i++;
        k++;
    }
    while(j<=n2-1)
    {
        array[k]=R[j];
        j++;
        k++;
    }
}

void mergeSort(int *array, int left, int right)
{
    int mid;
    if(left<right)
    {
        mid=left+(right-left)/2;

        mergeSort(array,left,mid);
        mergeSort(array,mid+1,right);

        merge(array,left,mid,right);
    }
}

int main()
{
    int n,i;
	printf("Enter the size of the array: ");
	scanf("%d",&n);
	int arr[n];
	puts("\nEnter array elements...");
	for(i=0;i<=n-1;i++)
	    scanf("%d",&arr[i]);
	puts("\nBefore sorting...");
	for(i=0;i<=n-1;i++)
	    printf("%d\n",arr[i]);

    mergeSort(arr,0,n-1);

    puts("\nAfter sorting (Ascending Order)...");
	for(i=0;i<=n-1;i++)
	    printf("%d\n",arr[i]);
	puts("\nAfter sorting (Descending Order)...");
	for(i=n-1;i>=0;i--)
	    printf("%d\n",arr[i]);
        
    return 0;
}