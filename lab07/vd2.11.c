#include <stdio.h>
main()
{
	int ary[10];
	int i, total, high;
	for (i = 0; i < 10; i++)
	{
		printf("\n Enter value : %d:", i + 1);
		scanf ("%d", &ary[i]);
	}
	high = ary[0];
	 for (i = 1; i < 10; i++)
	  {
	  	if (ary[i] > high)
	  	high = ary[i];
	  }
	  	printf ("\n Highest value entered was %d", high);
	  	for (i = 0, total = 0; i < 10; i++)
	  	total = total + ary[i];
	  	printf ("\n THe average of the element of ary is %d", total/i);
}
