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
    char some_text[20];
};

int main()
{
    int msgid;
    struct my_msg some_data;
    msgid=msgget((key_t)12345,0666|IPC_CREAT);
    if(msgid==-1){
        printf("error in creating queue\n");
    }
    some_data.msg_type=1;
    strcpy(some_data.some_text,"100");
    printf("-Sent 100 to process 2-\n");
    if(msgsnd(msgid,(void*)&some_data,MAX_TEXT,0)==-1){
        printf("msg not sent\n");
    }
    
    msgid=msgget((key_t)23456,0666|IPC_CREAT);
    if(msgid==-1){
        printf("error in creating queue\n");
    }
    some_data.msg_type=1;
    strcpy(some_data.some_text,"1000");
    printf("-Sent 1000 to process 3-\n");
    if(msgsnd(msgid,(void*)&some_data,MAX_TEXT,0)==-1){
        printf("msg not sent\n");
    }
}