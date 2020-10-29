#include <stdio.h>
main()
{
	int h,i,p;
	h = 5;
	printf ("\nchay chuong trinh ", h);
	scanf ("%d", &h);
	printf("\n");
	{
		for (i = h; i >= 1 ;i --)
		{
			printf("\n");
			for (p = 1; p <= i ; p++)
			printf ("%d",p);
		}
	}

	{
		for (i = 1; i <= h; i++)
		{
			printf("\n");
			for (p = 1; p <= i ; p++)
			printf ("%d",p);
		}
		
	}
}
