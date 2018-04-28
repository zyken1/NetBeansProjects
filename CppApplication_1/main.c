#include <stdio.h>
#include <stdlib.h>


    
//Comparación entre tres cantidades

int main (void)
{
float a,b,c,m;
	
printf("INTRODUCE EL VALOR DE A\n"); 
	scanf("%f",&a);
printf("INTRODUCE EL VALOR DE B\n"); 
	scanf("%f",&b);					
printf("INTRODUCE EL VALOR DE C\n"); 
	scanf("%f",&c);    
			
	if(a>b)
	{	if(a>c)
			{
            printf("imprimiste a\n\n");
            m=a;
			}
		else
			{
            m=c;
            printf("Imprimiste b\n\n");
			}
	}
	
	else
	{
		if(b>c)
			{
                    m=b;
                    printf("imprimiste c\n\n");
			}
		else
			{
                    m=c;
                    printf("imprimiste d \n\n");
			}
	}
printf("Este es el valor mayor:%f \n",m);
	
	return 0;
}

