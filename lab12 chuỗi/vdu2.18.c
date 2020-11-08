#include<stdio.h>
#include<string.h>
main()
{
	char name[5][20];
	int i;
	void uppername(char namearr[]);
	
	for (i=0; i<5; i++)
	{
		printf("\n Enter string %d ",i+1);
		scanf("%s",name[i]);
	}
		
	for (i=0; i<5; i++)
	{
		uppername(name[i]);
		printf("\n New string %d: %s",i+1, name[i]);
	}
	
	getch();
	
}
void uppername(char namearr[])
{
	int x;
	for (x=0; namearr[x] != '\0'; x++)
	{
		if(namearr[x] >= 97 && namearr[x] <= 122)
		namearr[x] = namearr[x]-32;
	}
}
