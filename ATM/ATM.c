#include<stdio.h>
main()
{
	int sotien=1000000;
	int num1, num2, ans, tl, ok, id;
	int username,password ;
	int menu;
	
	printf("\t\t CHAO BAN DA DEN NGAN HANG\n ");
	printf("nhap username : ",username);
	scanf("%d",&username);
	printf("nhap password : ", password);
	scanf("%d",&password);	

		ok = Longin(username,password);
		if (ok == 1)	
	{
	do
		{
			printf("chon menu :\n 1.Rut tien\n 2.Chuyen tien\n 3.Kiem tra tai khoan\n 4.Ket thuc\n ");
			scanf("%d",&menu);
				
			switch(menu)
			{
				case 1:
					printf("So tien ban muon rut : ");
					scanf("%d",&num1);
					Withdraw(num1,sotien);
					break;
					
				case 2:
					printf("so tai khoan ban muon chuyen  : ");
					scanf("%d",&id);
					printf("ban muon chuyen so tien : ");
					scanf("%d",&num2);
					
					Transfer(id,num2,sotien);
					break;
					
				case 3:
					Check(sotien,num1,num2);
					break;
					
				case 4:
					printf("cam on ban da den voi ngan hang chung toi\n");
					break;
			}
			fflush(stdin);
			printf("//////////////////////////////////////////////////////\n");
			printf("ban co muon riep tuc khong ?(y de tiep tuc/X de thoat): ");
			scanf("%c",&tl);
		}
	while (tl='y');
		{
			printf("moi ban chon menu");
			scanf("%d",menu);
		}
	}
	
}

Longin(int username, int password)
{
	if (username == 1111 && password == 1234)
	{
		printf("ma chinh xac\n");
		return 1;
	}
	else 
	{
		printf("ma sai ");
		return 0;
	}
}
		
Withdraw(int num1, int sotien)
{
	if (num1 <50000 && num1 %50==0 && num1 < sotien)
	{
		sotien= sotien-num1;
		printf("ban da rut %d\n", num1);
		printf("so tien con lai la %d\n",sotien);
	}
	else
		{
			printf("so tien ban rut khong thoa man\n");
		}
	
}

Transfer(int id, int num2, int sotien)
{
	if (num2 < 500000 && num2 < sotien)
	{
		printf("ban da chuyen %d VND thanh cong vao tai khoan %d\n", num2, id);
		printf("so tien con lai cua ban la %d\n ", sotien - num2);
		printf("tai khoan %d da duoc cong so tien la  %d\n", id, num2);
	}
	else 
	{
		printf ("so tien khong thoa man de chuyen khoan");
	}	
}

Check(int sotien, int num1, int num2)
{			
		sotien = sotien - num1 - num2;
		printf("so du tai khoan ban con lai la %d\n", sotien);
}


