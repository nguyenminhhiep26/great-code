#include <stdio.h>
main()
{
	char ten[150], ans;
	int i, solan, len, j, n;
	
	printf ("Co CUA EM : ", ten);
	gets(ten);
	printf ("Em quy co : ",solan);
	scanf("%d", &solan);
	for (i = 0; i <= solan; i++)
	{
		printf (" %d di hoc\n",i);
	}
		do 
		{
			printf ("Co co yeu chong co khong ? Y/N \n");
			scanf ("%s", &ans);
		} while ( ans != 'Y');
		printf ("Nha co Hanh Phuc ge 3 3\n");
	printf ("name : ");
	scanf ("%s", &ten);
	fflush(stdin);
	
	printf ("Co Muon nhan trai tim to hay nho : ");
	scanf("%d", &n);
	
	len = strlen(ten);
	for(i=n/2; i<=n; i+=2)
	
	{
		for(j=1; j<n-i; j+=2)
		
		{
			printf(" ");
		}
		
		for(j =1; j<=i; j++)
		
		{
			printf("*");
		}
		for (j=1; j<=n-i; j++)
		{
			printf(" ");
		}
		
		for (j=1; j<=i; j++)
		{
			printf("*");
		}
		
		printf("\n");
	}
	
	for(i=n; i>=1; i--)
	{
		for(j=i; j<n; j++)
		{
			printf(" ");
		}
		
		if (i == n)
		{
			for(j=1; j<=(n * 2-len)/2; j++)
			
			{
				printf("*");
			}
			printf("%s", ten);
			
			for(j=1; j<(n*2-len)/2; j++)
			{
				printf("*");
			}
		}
		else
		{
			for(j=1; j<=(i*2)-1; j++)
			
			{
				printf("*");
			}
		}
		printf("\t\t Chuc co LUON VUI VE va HANH PHUC cung gia dinh a \n");
	}
	return 0;
	
}
