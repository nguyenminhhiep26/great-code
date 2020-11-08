#include<stdio.h>
#include <string.h>
main()
{
	int i,j;
	char strarr[5][20],str[20];
	
	for (i=0; i<5; i++)
	{
		printf("\n Enter string %d : ",i+1);
		scanf("%s",strarr[i]);
	}
	
	for (i = 0; i < 4; i++)
	
	for(j = i + 1; j < 5; j++)
	{
		if(strlen(strarr[i]) < strlen(strarr[j]))
		{
			strcpy(str, strarr[i]);
			strcpy(strarr[i], strarr[j]);
			strcpy(strarr[j], str);
		}
		
	}
	
	printf("\nThe strings in descending order of length are : ");
	for (i=0; i<5; i++)
	printf("\n%s", strarr[i]);
	
	getch();
}
