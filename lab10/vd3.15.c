#include <stdio.h>
main()
{
	register int i;
	int no, digit, sum;
	 printf("\nThe number whose Sum of Cubes of Digits is Equal to the number itself are : \n\n");
	 for(i=1; i< 999; i++)
	 {
	 	sum = 0;
	 	no =i;
	 	while (no)
		{
		 digit =no%10;
	 	no =no/10;
	 	sum = sum + digit * digit * digit;
		}
		if (sum == i)
		printf ("\t%d\n", i);
	 }
	 	 
}
