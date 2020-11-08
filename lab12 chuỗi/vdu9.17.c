#include<stdio.h>
main()
{
	char lines[5][20];
	int ctr, longctr = 0;
	int longget(char linesarr[][20]);
	
	for(ctr=0; ctr<5; ctr++)
	{
		printf("\n ENter string %d", ctr+1);
		scanf("%s", lines[ctr]);
	}
	
	longctr = longget(lines);
	printf("\n The longget string is %s",lines[longctr]);
	getch();
}
int longget(char linesarr[][20])
{
	int i=0, lctr=0, prevlen, newlen;
	prevlen = strlen(linesarr[i]);
	
	for (i=0; i<5; i++)
	{
		if(newlen > prevlen)
		lctr = i;
		prevlen = newlen;
	}
	return lctr;
}
