#include <stdio.h>
#include<stdlib.h>
#include <unistd.h>

float globalNum=9.0;

int main(){
	int pid=fork();
	int n;

	if(pid!=0){
		wait();
	}
	if(pid==0){
		globalNum=globalNum+21.0;
		printf("from child %f\n",globalNum);
	}
	else{
		printf("from parent %f\n",globalNum);
	}
	return 0;
}