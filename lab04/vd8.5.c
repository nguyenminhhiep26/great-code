#include <stdio.h>
void main()
{
	int num1, num2, res;
	char op;
	num1 = 90;
	num2 = 33;
	op = '-';
	
	switch (op)
	{
		case '+':
		res = num1 + num2;
		 printf("\nThe Sum is: %d", res);
		 break;
		case '-':
		 res = num1 - num2;
		 printf("\nNumber after Subtraction: %d", res);
		 break;
		case '/':
		 res = num1 / num2;
		 printf("\n nNumber after Division: %d", res);
		 break;
		case '*':
		 res = num1 * num2;
		  printf ("\n nNumber after multiplication: %d", res);
		 break;
		default:
		 printf("\nInvalid");
		 break;
	}
	return 0;
}
