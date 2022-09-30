#include <stdio.h>
#include <unistd.h>
#include <signal.h>
void sigint_handler(int sig)
{
    printf("SIGINT overwirtten sucessfully cannot terminate process now");
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
        sigaction(SIGINT, &sa, NULL);
        int a;
        printf("Enter a number: ");
        scanf("%d",&a);
        wait(NULL);
    }

    return 0;
}