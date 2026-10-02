#include<stdio.h>
#include<conio.h>
void main()
{
	int a[10];
	int size;
	int i,j,temp;
	clrscr();
	printf("\nEnter the Size of Elements");
	scanf("%d",&size);
	printf("\n Enter elements =");
	for(i=0;i<size;i++)
	scanf("%d",&a[i]);
	for(i=0;i<size;i++)
	{
		for(j=i+1;j<size;j++)
		{
			if(a[i]>a[j])
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
	printf("\nSorted Elements Are=");
	for(i=0;i<size;i++)
	printf("\t%d",a[i]);
	getch();
}


							  #