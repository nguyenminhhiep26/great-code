#include <stdio.h>
int main()
{
	int songuyen[5];
	int i;
	printf ("nhap so :\n ");
	for (i=0 ; i<4 ; i++)
	
	{
		scanf("%d",&songuyen[i]);
	}
	for (i=0; i<4; i++)
	{
		printf ("so %d\n", songuyen[i]);
		printf ("%d\n",check (songuyen[i]));
	}
	
}
int check (int num)
{
	if (num %50==0)
	{
		printf (" la boi cua 50\n");
		return (0);
	}	
	else 
	
	printf("khong la boi cua 50\n");
	return (1);
}

