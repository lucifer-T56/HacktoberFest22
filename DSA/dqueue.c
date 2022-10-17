# include<stdio.h>
# define size 10
void insert_front();
void insert_rear();
void delete_front();
void delete_rear();
void display_queue();

int deque_a[size];
int front = (size/2)-1;
int rear = (size/2);

int main()
{   int c;
    do
    {   printf("Press 1-Insert at front 2-Insert at rear 3-Delete from front 4-Delete from rear 5-Display 6.Quit \n");
        
        printf("Enter your choice : ");
        scanf("%d",&c);
        switch(c)
        {   case 1:
            insert_front();
            break;
            case 2:
            insert_rear();
            break;
         case 3:
            delete_front();
            break;
         case 4:
            delete_rear();
            break;
         case 5:
            display_queue();
            break;
         case 6:
            break;
         default:
            printf("Wrong choice\n");
        }
    }while(c!=6);
}

void insert_front()
{ int item;
 printf("Enter element to be inserted :");
 scanf("%d",&item);
 if(front==-1)
 {printf("Overflow \n");
 }
 else
 {deque_a[front]=item;
 front--;
 }
}

void insert_rear()
{ int item;
 printf("Enter element to be inserted :");
 scanf("%d",&item);
 if(rear==size-2)
 {printf("Overflow \n");
 }
 else
 {deque_a[rear]=item;
 rear++;
 }
}

void delete_front()
{ int item;
if(front==rear)
 printf("ELEMENT NOT ACCESSIBLE");
else
{ item=deque_a[front];
  front++;
  printf ("deleted item = %d\n",item);
 }  
}

void delete_rear()
{ int item;
if(front==rear)
 printf("ELEMENT NOT ACCESSIBLE");
else
{ item=deque_a[rear];
  rear--;
  printf ("deleted item = %d\n",item);
 }
}

void display_queue()
{if(front<rear)
  {for(int i=front+1;i<rear;i++)
   printf("%d , ",deque_a[i]);
  }
  else
  printf("DQ empty");
}
