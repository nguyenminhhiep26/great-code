#include<stdio.h>
#include<string.h>
main()
{
	char compname[20] = "Microsoft";
	int len, crt;
	
	len= strlen(compname);
	
	for(crt = 0; crt < len; crt++)
	printf("%c *",compname[crt]);
	
	getch();
}
