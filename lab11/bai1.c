#include<stdio.h>
int main()

{
	int a, b, c;
	printf("cac canh cua tam giac\n ");
	printf("nhap a :");
	scanf ("%d",&a);
	printf("nhap b : ");
	scanf("%d",&b);
	printf ("nhap c :");
	scanf("%d",&c);
	
	GetArea(a,b,c);
}
void GetArea(int a,int b,int c)
{
	float p,s;
	p=a+b+c/2;
	if (a+b >c && a+c >b && b+c >a)
	{
		s=sqrt(p*(p-a)*(p-b)*(p-c));
		printf ("S tam giac la :%f",s);		
	}
	else 
	{
		printf("3 canh khong tao thanh tam giac");
	}
	return (0);		
}


