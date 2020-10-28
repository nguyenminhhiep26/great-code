#include <stdio.h>
void main()
{
	int a;
	for (a = 1; a <= 100; a++)
	{
		if ( a % 9 == 0)  continue;
		printf ("%d \n so khong chia het cho 9 la \t", a);
	}
}
