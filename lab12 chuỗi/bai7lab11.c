#include <stdio.h>
main()
{
	int chieucao,cannang,tuoi;
	char name[150];
	printf("\t\t TIEU CHUAN VO TUONG LAI \n");
	printf("ten : ");
	fflush(stdin);
	gets(name);
	printf("chieu cao : ");
	scanf("%d",&chieucao);
	printf("can nang : ");
	scanf("%d",&cannang);
	printf(" tuoi : ");
	scanf("%d",&tuoi);
	Check(chieucao,cannang,tuoi);
	
}
 int Check(chieucao,cannang,tuoi)
 {
 	if(chieucao <=165 && cannang==50 && tuoi==19)
 	{
 		printf("ok luon ");
 		Say();
	 }
 
 	else 
	 {
	 	printf("chung ta khong hop nhau");
	 }
 }
 int Say()
 {
 	char tl;
 	printf ("lam nguoi yeu em nhe (y/n)\n");
 	fflush (stdin);
 	scanf("%c",&tl);
 	if (tl='y')
	 {
	 	 Love();
	 }
	else 
		Break();	
 }
 void Love()
 {
 	printf("yeu qua troi  <3<3<3");
 }
 
 void Break()
 {
 	printf("anh noi vay thoi chu em dau xung :))");
 }
