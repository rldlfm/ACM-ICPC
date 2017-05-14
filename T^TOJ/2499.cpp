#include<stdio.h>
#include<stdlib.h>

int main()
{
    int min,max,num,n;
    scanf("%d %d",&min,&max);
    while(1)
    {
        num = (min + max) / 2;
        printf("%d\n",num);
        fflush(stdout);
        scanf("%d",&n);
        if(n==0)
            break;
        else if(n == 1) {
			max = num;
		}
        else if(n == -1)
            min = num;
    }
    return 0;
}
