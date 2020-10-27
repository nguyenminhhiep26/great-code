#include <stdio.h>
int main()
{
	int a;
	int b;
	int hieu;
	printf ("nhap a : ");
	scanf ("%d", &a );
	printf ("nhap b : ");
	scanf ("%d", &b);
	hieu=a-b;
	if (hieu==a||hieu==b)
	printf ("Hieu bang gia tri cua so nhap vao");
	else 
	printf ("Hieu khong bang bat ki gia tri nao da nhap");
	
	return 0;
}
