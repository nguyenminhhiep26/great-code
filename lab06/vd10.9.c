#include <stdio.h>
void main()
{
	int num;
	labell:
		printf ("\n Enter a number (1): ");
		 scanf ("%d", &num);
		 if (num == 1)
		 goto Test;
		 else 
		 goto labell;
		  Test:
		  	printf ("All done ... ");
}
