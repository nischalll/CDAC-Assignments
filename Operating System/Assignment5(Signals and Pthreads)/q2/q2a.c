#include <stdio.h>
#include <unistd.h>
#include <signal.h>
void sigint_handler(int sig)
{
    printf("child process got terminated");
}
int main()
{
    int pid = fork();
    if (pid == -1)
    {
        printf("Problem with fork \n");
        return 1;
    }
    if (pid == 0)
    {
        printf("Child Process: \n");
    }
    else
    {
        struct sigaction sa;
        sa.sa_handler = &sigint_handler;
        sigaction(SIGCHLD, &sa, NULL);
        wait(NULL);
    }

    return 0;
}