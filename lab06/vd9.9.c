#include <stdio.h>
void main()
{
	int x;
	char i, ans;
	i = '1';
	do{
		x = 0;
		ans = 'y';
		printf ("\nEnter sequence of characrer: ");
		do{
			i = getchar();
			x++;
		}while (i != 'n');
		i = '1';
		 printf ("\nNumber of characters entered is:%d", --x);
		 printf ("\n More sequences (Y/N)?");
		  ans = getch();
	}while (ans == 'Y' || ans == 'y');
}
