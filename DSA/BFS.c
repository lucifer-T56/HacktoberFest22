#include<stdio.h>
#define size 6
int graph[size][size];
int front=-1,rear=-1;
int queue[size];
int visited[size]={0};
void enqueue(int item)
{
	if(rear==size-1)
		printf("\nOVERFLOW!!\n\n");
	else if(front==-1 && rear==-1)
	{
		rear++;
		front++;
		queue[rear]=item;
	}
	else
	{
		rear++;
		queue[rear]=item;
	}
}
void dequeue()
{
	if(front==-1 && rear==-1)
		printf("\nUNDERFLOW!!\n\n");
	else if(rear==front)
	{
		rear=-1;
		front=-1;
	}
	else
	{
		front++;
	}
}
void BFS(int vertex)
{
	int u,w;
	enqueue(vertex);
	visited[vertex]=1;
	while(front!=-1 && rear!=-1 || front<rear)
	{
		u=queue[front];
		dequeue();
		printf("%c\t",u+65);
		for(w=0;w<size;w++)
		{
			if(graph[u][w]==1 && visited[w]==0)
			{
				enqueue(w);
				visited[w]=1;
			}
		}
	}
}
int main()
{
	int n,i,j,k;
	FILE *fp;
	fp=fopen("graph.txt","r");
	if(fp==NULL)
	{
		printf("Error to open the file\n\n");
		return;
	}
	fscanf(fp,"%d",&n);
	for(i=0;i<n;i++)
	{
		for(j=0;j<n;j++)
		{
			fscanf(fp,"%d",&graph[i][j]);
		}
	}
	printf("The graph in matrix format:\n\t");
	for(k=0;k<n;k++)
	{
		printf("%c\t",k+65);
	}
	printf("\n");
	for(i=0;i<n;i++)
	{
		printf("%c\t",i+65);
		for(j=0;j<n;j++)
		{
			printf("%d\t",graph[i][j]);
		}
		printf("\n");
	}
	printf("\nBFS traversal result:\n");
	BFS(0);
	fclose(fp);
	return 0;
}
