#include<stdio.h>
#include<string.h>
main()
{
	char hotename1[15]= "Sea View";
	char hotename2[15]= "Sea Breeze";
	
	printf("The old name is %s\n",hotename1);
	strcpy(hotename1, hotename2);
	
	printf (" The new name is %s\n ", hotename1);
	getch();
}
