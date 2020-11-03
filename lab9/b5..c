#include <stdio.h>
main()
{
	char name[30][30];
	int i, row, col, diem[5][30], sum[30] ,avg;
	for (i=0; i<30; i++)
	{
		printf ("Nhap ten hoc sinh thu %d: ",i+1);
		fflush(stdin);
		gets(name[i]);
			for (col = 0; col<4;col++)
			{
				printf ("Diem mon thu %d : ", col+1);
				scanf("%d", &diem[row][col]);
				sum[0]==0;
				sum[i]+=diem[row][col];
			}
		
	}
		
	for (i=0; i<30; i++)
	{	
		avg=sum[i]/4;	
		printf(" diem trung binh cua hoc sinh %s la : %d\n",i+1, name[i],avg);
					
	}	
	
}
