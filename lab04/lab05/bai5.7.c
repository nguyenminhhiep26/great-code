#include <stdio.h>
int main()
{
	int A;
	printf ("NHAP SO A : ");
	scanf("%d", &A);
	if (A >= 75)
	printf ("Loai A ", A);
	else if (A >=60 && A<75)
	printf ("Loai B", A);
	else if (A >= 45 && A<60)
	printf ("Loai C", A);
	else if (A >= 35 && A<45)
	printf ("Loai D", A);
	else if (A<35)
	printf("Loai E",A );

	 
	return 0;
}
