#include <stdio.h>
int main()
{
	printf ("Chao mung da den voi ngan hang vip\n");
	int mapin;
	int mathe;
	printf ("ma the la :");
	scanf ("%d", &mathe);
	if (mathe == 1234)
	{
		printf("ma pin la :");
		scanf ("%d", &mapin);
		if (mapin == 1234)
	
			{
			
		 	int x;
		 	printf ("Enter (1-4): \n1,Rut tien \n2,gui tien \n3,so tien con lai \n4,ket thuc ");
		 	scanf ("%d", &x);
		 	if (x == 1)
		 	{	int canrut;
		 		int sodu=500;
		 		printf ("so tien can rut :%d",&canrut);
		 		scanf("%d", &canrut);
		 		if (canrut%50==0 && canrut<500)
		 		{
		 			char ans = 'y';
		 			printf ("giao dich mat phi (y/n) :");
		 			fflush(stdin);
		 			scanf("%c", &ans);
		 			if (ans=='y')
		 			{
		 				printf ("So du con lai la: %d", sodu - canrut);
		 				
					 }
					 else 
					 	printf ("cam on");
				 }
		 		else 
		 		printf ("ban can nhap mot chu so");
			 }
		 	else if (x == 4 )
		 	 printf ("Ket thuc");
		 	else if (x == 2)
		 	{
		 		int stk;
		 		printf ("stkoan nguoi nhan");
		 		scanf ("%d", &stk);
		 		if (stk == 350)
		 		{
		 			int sodu = 500;
		 			int tienchuyen;
		 				printf("nhap so tien can chuyen :");
		 				scanf ("%d", &tienchuyen);
		 				if (tienchuyen <= 500)
		 				{
		 					printf ("so du con lai la: %d ", sodu - tienchuyen);
						 }
						 else 
						 printf ("so tien chuyen nho hon 500");
				 }
		 		
			 }
		 	 
		 	else if (x ==3 )
		 	 printf ("so tien con lai");
		 }
		 else 
		 printf ("Ma pin khong hop le");
	}
	else 
	 printf("Ma the khong hop le");
	 
	 return 0;
	

}
