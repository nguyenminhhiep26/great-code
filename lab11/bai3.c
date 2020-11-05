#include <stdio.h>
 void reverse(int so[], int size)
{
	int i;
	printf("nhap so :\n");
	for (i=1; i<=size ; i++)
	{
		scanf("\n%d",&so[i]);
	}
	for (i=size; i>=1; i--)
		printf("\n%d",so[i]);
	
}
int main()
{
	int so[5];
	reverse (so, 5);
	return 0;
}
