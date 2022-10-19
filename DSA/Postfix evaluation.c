#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<math.h>

#define max 50
#define blank ' '
#define tab '\t'

char postfix[max];
float eval[max];
int top=-1;

int eval_isfull()
{
if(top==(max-1))
return 1;
return 0;
}

int eval_isempty()
{
if(top==-1)
return 1;
return 0;
}

float eval_pop()
{
if(eval_isempty())
{
printf("\nStack is empty.Pop operation can't be performed");
return -1;
}
return eval[top--];
}

void eval_push(float n)
{
if(eval_isfull())
{
printf("\nStack is full.Push operation can't be performed");
return;
}
eval[++top]=n;
}
float post_eval(char postfix[])
{
float a,b;
int i,j;

float item;
char symbol;
for(i=0;postfix[i]!='\0';i++)
{
symbol=postfix[i];
switch(symbol)
{
case '^':
case '$':
a=eval_pop();
b=eval_pop();
eval_push(pow(b,a));
break;
case '*':
a=eval_pop();
b=eval_pop();
eval_push(b*a);
break;
case '/':
a=eval_pop();
b=eval_pop();
eval_push((b/a));
break;
case '%':
a=eval_pop();
b=eval_pop();
eval_push(((int)b%(int)a));
break;
case '+':
a=eval_pop();
b=eval_pop();
eval_push((b+a));
break;
case '-':
a=eval_pop();
b=eval_pop();
eval_push((b-a));
break;
default:
printf("\nEnter the value of %c :",postfix[i]);
scanf("%f",&item);
eval_push(item);
}
}
return *eval;
}
int main()
{
printf("\nEnter the Postfix expression :\n");
scanf("\n%[^\n]%*c",postfix);
printf("\nResult = %.2f",post_eval(postfix));
return 0;
}
