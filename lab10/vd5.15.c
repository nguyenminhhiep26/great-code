#include <stdio.h>
main()
{
	int x, y;
	x = 15; y = 20;
	printf ("x = %d, y = %d\n", x, y);
	swap(x,y);
	 printf ("\n After interchanging x = %d, y =%d\n", x, y);
}
swap(int u, int v)
{
	int temp;
	temp = u;
	u = v;
	v =temp;
	return;
}
