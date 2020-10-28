#include <stdio.h>
main()
{
	int h = 0;
	while (h < 100)
	{
		printf("THis goes on forever. HELP !!!\n");
		h +=10;
		printf ("\t%d",h);
		h -=10;
		printf ("\t%d",h);
		printf ("\Ctrl - C will help");
	}
}
