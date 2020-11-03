#include <stdio.h>
main()
{
	int arr[10];
	int i, min, max, sum, avg;
	int somax = 0, somin = 0;
	
	for (i=0; i<10; i++)
	{
		scanf("%d", &arr[i]);
	}
	max = arr[0];
	min = arr[0];
	for (i=0; i<10; i++)
	{
		sum+= arr[i];
		if (arr[i] > max)
		max = arr[i];
		if (arr[i] < min)
		min = arr[i];
	}
	for (i = 0; i < 10; i++)
	{
		if (arr[i] == max)
		somax++;
		if (arr[i]== min)
		somin++;
	}
	printf("\nMax = %d , so lan xuat hien la : %d", max, somax);
	printf("\nMin =%d , so lan xuat hien la : %d", min, somin);
	printf ("\nSum =%d", sum);
	printf("\nAvg=%d",sum/10);
}
