#include <stdio.h>
void main()
{	printf ("\t\tbat dau di ban oi\n");
	int a,b;
	for (a = 2, b =1; a <= 10; a ++)
	{
		printf ("\t\tnhap %d b : ", a);
		scanf ("%d", &b);
		if (b == 10) break;
	}
	printf (" \tket thuc roi ban iu");
}
