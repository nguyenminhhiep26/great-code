#include <stdio.h>
int main()
{
	int LTB;
	int A;
	int B;
	int LK;
	A = 300;
	B = 250;
	LK = 100;
	printf ("Muc luong trung binh thang cua nhan vien cong ty la : ");
	scanf ("%d", &LTB);
	printf ("Muc luong  cuoi thang cua nhan vien A la : %d\n", LTB*30+300);
	printf ("Muc luong cuoi thang cua nhan vien B la : %d\n", LTB*30+250);
	printf ("Muc luong cuoi thang cua cac nhan vien khac la : %d", LTB*30+100);
	
	
	return 0;
}
