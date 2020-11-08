#include<stdio.h>
main()
{
	int sum= 0, num[5], ctr;
	int sumarr(int numarr[]);
	
	for(ctr = 0; ctr < 5; ctr++)
	{
		printf("\nEnter number %d :", ctr+1);
		scanf("%d",&num[ctr]);
	}
	
	sum = sumarr(num);
	printf("\nThe sum of the array is %d", sum);
	
	getch();
}

int sumarr(int numarr[])
{
	int i, total;
	for(i=0, total =0; i < 5; i++)
	total += numarr[i];
	return total;
}
