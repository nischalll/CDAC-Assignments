#include <stdlib.h>
#include <stdio.h>
#include <unistd.h>

int main(int argc, char *argv[])
{
    int p1[2]; // c>p
    int p2[2]; // p>c
    
    if (pipe(p1) == -1){return 1;};

    if (pipe(p2) == -1){return 1;};
    
    int pid = fork();
    if (pid == -1){return 2;};
    if (pid == 0)
    {
        close(p1[0]);
        close(p2[1]);
        // child process
        int x;

        if (read(p2[0], &x, sizeof(x)) == -1)
        {
            return 3;
        }
        printf("Recived %d\n", x);

        x *= 4;
    if (write(p1[1], &x, sizeof(x))== -1)
    {
        return 4;
    };

    printf("wrote %d\n", x);
    close(p1[1]);
    close(p2[0]);
    }
    else
    {
        // parent process
        
        close(p1[1]);
        close(p2[0]);

        int y = rand() % 10;

        if (write(p2[1], &y, sizeof(y)) == -1)
        {
            return 5;
        }
        printf("wrote %d\n", y);

        if (read(p1[0], &y, sizeof(y))== - 1)
        {
            return 6;
        }
        printf("result is %d\n", y);

        wait(NULL);
        close(p1[0]);

        close(p2[1]);
    }
    return 0;
}