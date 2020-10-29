#include <stdio.h>
main()
{
	char ary[5];
	int i;
	printf("\n Enter  string : ");
	scanf ("%s", ary);
	printf(" \nThe string is %s \n\n ", ary );
	for (i = 0; i <5; i++)
	printf ("\t %d", ary[i]);
	
}
