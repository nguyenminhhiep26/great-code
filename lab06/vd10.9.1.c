#include <stdio.h>
void main()
{
	char h;
	labell:
		printf("\n nhap ho 1 chu nao ");
		scanf ("%c", &h);
		if (h == 'K' )
		 goto Test;
		else 
		goto labell;
		 Test:
		 	printf ("Ket thuc roi ban oi");
}
