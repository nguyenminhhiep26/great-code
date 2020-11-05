#include <stdio.h>
 sum(int a, int b);
 sub(int a, int b);
 multi(int a, int b);
 div(int a, int b);
void menu(){
    int a=0,b=0,kt=1;
    while (kt==1) {
        printf("\nTiNH TOaN\n");
       
        printf("1. Nhap so\n");
        printf("2. Tinh Tong\n");
        printf("3. Tinh Hieu\n");
        printf("4. Tinh Tich\n");
        printf("5. Tinh Thuong\n");
        printf("6. Thoat\n");
        
        printf("Chon:\t");
        int i;
        scanf("%d", &i);
        if (i==1)
		 {
            printf("Nhap gia tri a= ");
            scanf("%d", &a);
            printf("Nhap gia tri b= ");
            scanf("%d", &b);
        }
        
        if (i==2)
		 {
            printf("Tong= %d\n", a+b);
        }
        if (i==3)
		 {
            printf("Hieu= %d\n", a-b);
        }
        if (i==4)
		 {
            printf("Tich= %d\n", a*b);
        }
        if (i==5)
		 {
            if (b==0)
			 {
                printf("Lai");
            }
            else
                printf("Thuong= %lf\n", (double)a/b);
        }
        if (i==6) {
            printf("Ket Thuc\n");
            kt=0;
        }
    }
}
int main()
{
    menu();
}
