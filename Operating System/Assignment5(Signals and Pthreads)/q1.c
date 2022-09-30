#include<stdlib.h>
#include<stdio.h>
#include<unistd.h>
#include<signal.h>

void handle_sigusr1(int sig){
    printf("Received SIGUSR1 signal, going to sleep for 2 seconds\n");
    sleep(2);
    printf("2 seconds completed\n");
}

int main(){
    int pid=fork();
    if(pid==-1){
        return 1;
    }
    if(pid==0){
        //child process
        sleep(5);
        kill(getppid(), SIGUSR1);
        
    }
    else{
        struct sigaction sa;
        sa.sa_flags = SA_RESTART;
        sa.sa_handler=&handle_sigusr1;
        sigaction(SIGUSR1, &sa, NULL);

        //parent process
        for(int i=10; i<=10000; i++){
            printf("i=%d\n ",i);
            usleep(50000);
        }
    }
    return 0;
}