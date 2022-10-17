#include <bits/stdc++.h>
using namespace std;
struct Node
{
    int data;
    Node *next;
    
}*start,*newptr,*save,*ptr;

Node* getNode(int n)
{
    ptr =new Node;
    ptr->data=n;
    ptr->next=NULL;
}

void reverse(Node** head)
{
    Node  *prev,*next,*curr;

    curr=*head;
    prev=NULL;

    while(curr!=NULL)
    {
        next=curr->next;

        curr->next=prev;

        prev=curr;
        curr=next;
    }
    *head=prev;

}


void Display(Node* np)
{
    while(np!=NULL)
    {
        cout<<np->data<<"->";
        np=np->next;
    }
    cout<<"!!\n";
}

int main()
{
    

    int data,pos;

    Node* start = NULL;
    start = getNode(3);
    start->next = getNode(5);
    start->next->next = getNode(8);
    start->next->next->next = getNode(10);
    start->next->next->next->next = getNode(11);
   
         cout<<"List is: \n";
         Display(start);

      
        //Insert_Pos(&start, pos, data);
       cout<<"Reverse List is : \n";
       reverse(&start);

       Display(start);
   
    return 0;
} 
