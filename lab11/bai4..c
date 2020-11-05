#include <stdio.h>
int indexMin(int so[])
{
	int min = so[0],i;
	for (i=0; i<10; i++)

		if (so[i]<min)
		min = so[i];
		return min;
}
int main()
{
	int so[10],i;
	for (i = 0; i<10 ; i++)
	{
		printf ("nhap so %d : ", i+1);
		scanf("%d",&so[i]);
	}
	for (i=1; i<10; i++)
	{
		if(so[i] == indexMin(so))
		{
			printf("so nho nhat la %d va o vi tri thu %d",indexMin(so),i);
			break;
		}
	}
}
