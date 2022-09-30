#include <stdio.h>
#include <unistd.h>
#include <stdlib.h>
int main()
{
    int id = fork();
    if (id == 0)
    {
        printf("Child Process current: %d parent: %d \n", getpid(), getppid());
        exit(0);
    }
    else
    {
        printf("Parent process current: %d parent: %d \n", getpid(), getppid());
        sleep(10);
    }
}