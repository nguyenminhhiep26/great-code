#include <stdio.h>
main()
{
	int t, h, u ;
	t = 5;
	printf ("\t TUYET VOI KHONG ", t);
	scanf ("%d",&t);
	printf ("\n");
	{
		for (h = 1; h <= t; h++)
		{
			printf("\n");
			for (u = 1; u <= h ; u++)
			printf ("%d",u);
		}
		
	}
}
