#include <stdio.h>
main()
{
	int t,h,k;
	t = 7;
	printf ("nhap so sao :");
	scanf ("%d", &t);
	printf ("\n");
	for (h = t ; h >= 0 ; h--)
	{
		printf ("\n");
		for (k = 1; k <= h ; k++)
		printf ("*");
	}
	
}
