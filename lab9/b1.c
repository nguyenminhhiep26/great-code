#include <stdio.h>
main()
{
	int arr[10];
	int i;

	for (i = 1; i < 10; i++)
	{	
		scanf("%d",&arr[i]);
		if (i%2==0)
	printf("%d\t", arr[i]);
	}
}
