#include <stdio.h>
int main()
{
	char kitu;
	printf ("Nhap mot so tu (a-p) :");
	scanf ("%c", &kitu);
	 if (kitu >= 'a' && kitu <= 'p')
	 printf ("gia tri ");
	 
	 switch (kitu)
	 {
	 	case 'B':
	 		printf ("Hien thi ra hiep\n");
	 		break;
	 	case 'G':
	 		printf ("Hien thi ra em\n");
	 		break;
	 	case 'H':
	 		printf ("Hien thi ra thu\n");
	 		break;
	 	default :
	 	    printf ("Khong hien thi ");
	 	    break;
	 	
	 }
	 
	 return 0;
	
}
