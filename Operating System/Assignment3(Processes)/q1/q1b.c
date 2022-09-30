#include <stdio.h>
#include<stdlib.h>
#include <unistd.h>

float globalNum=9.0;

int main(){
	printf("L0\n");
    int pid=fork();
    printf("L1\n");
	if(pid==0){
        fork();
        printf("L2\n");
    }
    else{
        fork();
    }
    printf("Bye\n");
	return 0;
}