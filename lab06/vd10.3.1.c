#include <stdio.h>
main()
{
	int a = 0, b;

	do 
	{
		printf("nhap tiep di nao\n");
		scanf("%d", &b);
		printf ("\n ok co %d roi ", b);
		a++;
		
	}while ( b != 0);
	printf ("\het co %d ket qua", --a);

}
