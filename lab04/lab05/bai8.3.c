#include <stdio.h>
int main()
{
	int a;
	int b;
	int c;
	printf ("Nhap so a :");
	scanf ("%d", &a);
	printf ("Nhap so b : ");
	scanf ("%d", &b);
	printf ("Nhap so c :");
	scanf ("%d", &c);
	
	if (a>=b && a>=c)
	 printf ("%d gia tri lon nhat", a);
	if (b>=a && b>=c)
	 printf ("%d gia tri lon nhat", b);
	if (c>=a && c>=b)
	 printf ("%d gia tri lon nhat", c);
	 
	 return 0;
}

