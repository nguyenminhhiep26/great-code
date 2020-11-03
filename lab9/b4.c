#include <stdio.h>
main()
{
	char name[5][30];
	int i;
	for (i=1; i<6; i++)
	{
		printf ("ten sinh vien %d\n ",i);
		fflush(stdin);
		scanf("%s", &name[i]);
	}
	for (i=1; i<6; i++)
	{
		printf ("danh sach 5 hoc sinh la : %s\n", name[i]);
	}

}
