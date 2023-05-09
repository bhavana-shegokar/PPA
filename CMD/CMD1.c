#include<stdio.h>
#include<stdlib.h>

int main(int argc, char *argv[])
{

printf("Demonstration of CMD\n");

int No1 = atoi(argv[1]);
int No2 = atoi(argv[2]);

int Ans = No1 + No2;
printf("Number of CMD : %d \n",argc);
printf("Addition is : %d \n",Ans);


    return 0;
}