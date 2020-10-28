#include <stdio.h>
main ()
{
	int cnt;
	for (cnt = 0; cnt <= 10; cnt ++)
	{
		if (cnt == 5)
		continue;
		printf( "%d\t",cnt);
	}
	
}
