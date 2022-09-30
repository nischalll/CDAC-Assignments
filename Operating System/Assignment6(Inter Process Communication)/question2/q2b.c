#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <unistd.h>
#include <sys/types.h>
#include <sys/stat.h>
#include <errno.h>
#include <fcntl.h>

int main(int argc, char *argv[])
{
    if (mkfifo("myfifo2", 0777) == -1)
    {
        if (errno != EEXIST)
        {
            printf("Could not create fifo file\n");
            return 1;
        }
    }

    int fd1 = open("myfifo1", O_RDONLY);
    int len;
    char str[20];
    if (read(fd1, &len, sizeof(int)) == -1)
    {
        return 2;
    }
    if (read(fd1, str, sizeof(char)*len) == -1)
    {
        return 2;
    }
    printf("%s\n",str);
    close(fd1);

    int fd2 = open("myfifo2", O_WRONLY);
    char str2[20] = "Hello to CDAC";
    int len2 = strlen(str2);
    if (write(fd2, &len2, sizeof(int)) == -1)
    {
        return 2;
    }
    if (write(fd2, str2, sizeof(char)*len2) == -1)
    {
        return 3;
    }
    close(fd2);
    return 0;
}