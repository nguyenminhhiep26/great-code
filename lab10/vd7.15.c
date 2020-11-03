#include <stdio.h>
main ()
{
	char s1[80], s2[80];
	int (*p)(), strcmp;
	p = strcmp;
	gets(s1);
	gets(s2);
	check(s1, s2, p);
}

void check(char *a, char *b, int (*cmp)())
{
	printf ("Testing for equality \n");
	if(!(*cmp)(a, b))
	printf ("Equal");
	else 
	printf ("Not Equal");
}
