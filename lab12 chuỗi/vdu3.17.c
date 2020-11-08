#include<stdio.h>
#include<string.h>
main()
{
	char firstname[15];
	char lastname[15];
	
	printf("nhap ten 1 :");
	scanf("%s", firstname);
	printf("nhap ten 2: ");
	scanf("%s", lastname);
	
	strcat(firstname, lastname);
	printf("%s", firstname);
	getch();
	
}
