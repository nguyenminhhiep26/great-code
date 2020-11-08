#include<stdio.h>

main()
{
	int S,C;
	int menu;
	int cd,cr;
	int dientich(int cd, int cr);
	int chuvi (int cd, int cr);
	printf ("chieu dai : ");
	scanf ("%d",&cd);
	printf("chieu rong : ");
	scanf("%d",&cr);
	printf ("chon menu \n 1. tinh chu vi\n 2. tinh dien tich\n");
	scanf("%d",&menu);
	switch (menu)
	{
		case 2:
			S=dientich(cd,cr);
			printf("dientich = %d",S);
			break ;
			
		case 1:
			C=chuvi(cd,cr);
			printf ("chuvi = %d",C);
			break;
	}
	printf("\ntieptuc \n");
	scanf("%d",&menu);
		switch (menu)
	{
		case 2:
			S=dientich(cd,cr);
			printf("dientich = %d",S);
			break ;
			
		case 1:
			C=chuvi(cd,cr);
			printf ("chuvi = %d",C);
			break;
	}
}
int dientich(int cd, int cr)
{
	float dientich;
	dientich= cd * cr;
	return (dientich);
}
int chuvi(int cd, int cr)
{
	float chuvi;
	chuvi = (cd+cr)*2;
	return (chuvi);
}
