#include <stdlib.h>
#include <unistd.h>
#include <string.h>
#include <sys/types.h>
#include <sys/ipc.h>
#include <sys/msg.h>
#include <stdio.h>
#define MAX_TEXT 50

struct my_msg
{
    long int msg_type;
    char some_text[BUFSIZ];
};

int main()
{
    int msgid;
    struct my_msg some_data;
    long int msg_to_rec=0;
    msgid=msgget((key_t)12345,0666|IPC_CREAT);
    if(msgid==-1){
        printf("error in creating queue\n");
    }
    msgrcv(msgid,(void*)&some_data,BUFSIZ,msg_to_rec,0);
    printf("Data received: %s\n", some_data.some_text);
    msgctl(msgid,IPC_RMID,0);
}