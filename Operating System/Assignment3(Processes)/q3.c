#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
int main()
{
    int id = fork();
    int parentId;
    if(id ==0){

        sleep(10); 
        if(getppid()==1029){
            printf("This is a orphan process!\n");  
        }
        printf("current ID: %d, parent ID: %d\n", getpid(), getppid());
        
    }
    else{
        printf("current ID: %d, parent ID: %d\n", getpid(), getppid());
    }
    return 0;
}