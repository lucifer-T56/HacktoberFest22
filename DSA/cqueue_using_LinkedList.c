#include<stdio.h>
#include<stdlib.h>
struct node
{
	int data;
	struct node* next;
};
struct node *f = NULL;
struct node *r = NULL;
void enqueue(int d) 
{
	struct node* n;
	n = (struct node*)malloc(sizeof(struct node));
	n->data = d;
	n->next = NULL;
	if((r==NULL)&&(f==NULL))
	{
		f = r = n;
		r->next = f;
	}
	else
	{
		r->next = n;
		r = n;
		n->next = f;
	}
} 
void dequeue() 
{
	struct node* t;
	t = f;
	if((f==NULL)&&(r==NULL))
		printf("\nQueue is Empty\n");
	else if(f == r){
		f = r = NULL;
		free(t);
	}
	else{
		f = f->next;
		r->next = f;
		free(t);
	}
	
	
}
void print(){ 
	struct node* t;
	t = f;
	if((f==NULL)&&(r==NULL))
		printf("\nQueue is Empty\n");
	else{
		do{
			printf("\n%d",t->data);
			t = t->next;
		}while(t != f);
	}
}
int main()
{
	int opt,n,i,data;
	printf("Enter Your Choice:-");
	do{
		printf("\n\n1 for Insert the Data in Queue\n2 for Delete the data from the Queue  \n3 for show the Data in Queue\n4 for Exit\n: ");
		scanf("%d",&opt);
		switch(opt){
			case 1:
				printf("\nEnter the number of data : ");
				scanf("%d",&n);
				printf("\nEnter your data : ");
				i=0;
				while(i<n){
					scanf("%d",&data);
					enqueue(data);
					i++;
				}
				break;
			case 2:
				dequeue();
				break;
			case 3:
				 print();
				break;
			case 4:
				exit(0);
				break;
			default:
				printf("\nIncorrect Choice");
			
		}
	}while(opt!=0);
return 0;
}
