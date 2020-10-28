#include <stdio.h>
main()
{
	int a,i;
	char h;
	i = '1';
	do{
		a=0;
		h = 'y';
		printf ("\n nhap 1 chu so: ");
		do{
			i = getchar();
			a++;
			
		}while (i != '\n');
		 i = '1';
		 printf("\n vui len nao ban oi: %d", --a);
		 printf ("\n chon (Y/N)?");
		 h = getch();
	}while (h == 'Y' || h == 'y');
}
