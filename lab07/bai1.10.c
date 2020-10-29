#include <stdio.h>
main()
{
	char ten[100];
	int tuoi, i;
	printf("ho va ten : ");
	gets(ten);
	printf("bao nhieu tuoi : ");
	scanf ("%d", &tuoi);
	for (i = 0; i < tuoi; i++)
	{
		printf ("%s lan %d\n",ten , i+1);
	}
}
