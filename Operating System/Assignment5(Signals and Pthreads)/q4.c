#include <stdio.h>
#include<stdlib.h>
#include <unistd.h>
#include <pthread.h>


void* routine(){
    while(1){
        printf("Good Day from %ld\n",pthread_self());
    }
    
    return NULL;    
}

int main()
{
    pthread_t t1,t2;
    pthread_create(&t1, NULL, &routine, NULL);
    pthread_join(t1, NULL);
    pthread_create(&t2, NULL, &routine, NULL);
    pthread_join(t2, NULL);
    return 0;
}