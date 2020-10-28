#include <stdio.h>
main()
{
	int num1, num2;
	num2 = 0;
	do {
		printf("\n Enter a number : ");
		scanf("%d",&num1);
		printf ("No. is %d", num1);
		num2++;
		
	}while (num1 != 0);
	printf("\n The tota1 number entered were %d",--num2);
	
}
