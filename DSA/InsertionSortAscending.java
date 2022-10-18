public class InsertionSortAscending
{
    public static void main(String args[])
    {
 
        int num[]= {12,9,37,86,2,17,5};
        int i,j,x;

        System.out.println("Array before Insertion Sort");
        for(i=0; i<num.length; i++)
        {
            System.out.print(num[i]+" ");
        }

        
        for(i=1; i<num.length; i++)
        {
            
            x=num[i];

           
            j=i-1;
            while(j>=0)
            {
               
                if(x<num[j])
                {
                    num[j+1]=num[j];
                }
                else
                {
                    break;
                }
                j=j-1;
            }

            
            num[j+1]=x;
        }

       
        System.out.print("\n\nArray after Insertion Sort\n");
        for(i=0; i<num.length; i++)
        {
            System.out.print(num[i]+" ");
        }
    }
}
