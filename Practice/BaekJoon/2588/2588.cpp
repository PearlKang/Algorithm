#include <stdio.h>

int main(void)
{
	int a,b;

	scanf("%d %d",&a,&b);

	if(a >= 100 && a <= 999 && b >= 100 && b <= 999)
	{
		printf("%d\n",a*(b%10));
		printf("%d\n",a*((b/10)%10));
		printf("%d\n",a*((b/100)%10));
		printf("%d",a*b);
	}

	return 0;
}
