#include <stdio.h>
int main()
{
    int i, temp,n,c;
    printf("Enter number of elements of an array:\n");
    scanf("%d",&n);
    int a[n];
    printf("Enter elements: \n");
    for (i=0; i<n; i++)
        scanf("%d", &a[i]);
     printf("\n------MENU-------");
    printf("\nPress 1 for Bubble Sorrt \nPress 2 for Selection Sort \nPress 3 for Insertion sort  \n");
    scanf("%d",&c);
     switch(c)
     { 
       case 1:
       	 printf("\nStarting Bubble Sort :-\n");
       	  temp=0;
       	 for (int step = 0; step < n - 1; ++step) {
          for (int i = 0; i < n - step - 1; ++i) {
         if (a[i] > a[i + 1]) {
              temp = a[i];
             a[i] = a[i + 1];
             a[i + 1] = temp;
               }
            }
           }
           
           break;
       
	   case 2:
	   	printf("\nStarting Selection Sort :-\n");
	       int i, j, small;  
          for (i = 0; i < n-1; i++)    
         {  
           small = i;     
          for (j = i+1; j < n; j++)  
          if (a[j] < a[small])  
            small = j;   
            temp = a[small];  
            a[small] = a[i];  
          a[i] = temp;  
             } 
			 
		  break;
		  
	  case 3:
	  	printf("\nStarting Insertion Sort :-\n");
	  	 int   temp;  j=0;
          for (i = 1; i < n; i++) {  
         temp = a[i];  
         j = i - 1;  
         while(j>=0 && temp <= a[j])  
         {    
            a[j+1] = a[j];     
            j = j-1;    
         }    
         a[j+1] = temp;    
          }  
          
         break;
	}
	
	
	for(int i=0;i<n;i++)
	{printf("%d ,",a[i]);
	}
}
