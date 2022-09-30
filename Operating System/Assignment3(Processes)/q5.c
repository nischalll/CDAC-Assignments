#include<stdio.h>
#include<unistd.h>
#include<stdlib.h>
// char* argv[] = {"/bin/ls", "-l", 0};

int main(int argc, char* argv[]){
    execl("/bin/ps","/bin/ps", "-ef", (char*)0);
    printf("process execution finished!");
}