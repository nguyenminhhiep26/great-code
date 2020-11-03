#include <stdio.h>
main()
{
	int intarr[5];
	int i;
	float floatarr[10];
	for (i=0; i<5 ; i++)
	{
		scanf("%d", &intarr[i]);
		floatarr[i] = intarr[i];
	}
	printf("%d",intarr[i]);
	for (i = 5; i<10; i++)
	{
		floatarr[i] =0;
	}
	printf("%f", floatarr[i]);
	for (i=0 ; i<10; i++)
	printf ("%f\n", floatarr[i]);
	
	
}
