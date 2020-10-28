#include <stdio.h>
int main()
{
	int cnt = 0,num;
	do 
	{
		printf ("\n ENTER a Number: ");
		scanf ("%d", &num);
		printf ("No.is %d",num);
		cnt++;
	}while (num != 0);
	printf ("\n The total numbers entered were %d", --cnt);
	
}
