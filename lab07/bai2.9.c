#include <stdio.h>
main ()
{
	int num1, num2, i, sum;
	
	 printf("nhap so :\n");
	 scanf("%d",&num1);
	 printf("nhap so :\n");
	 scanf("%d", &num2);
	 sum = 0;
	{
	 for (i = num1 ; i <= num2 ; i++)
	 
		if ( i%2 != 0)
		 {
	 		sum = sum + i;
	 		printf ("%d\n", i);
	 	}
	 printf ("tong cua so le la : %d", sum);
	}
}
