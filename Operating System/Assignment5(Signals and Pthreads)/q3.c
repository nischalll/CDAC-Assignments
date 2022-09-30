#include <stdio.h>
#include<stdlib.h>
#include <unistd.h>
#include <pthread.h>

int arr[10] = {5, 6, 7, 4, 2, 7, 12};

void* routine(){
    int* sum=malloc(sizeof(int));
    for(int i=0; i<7; i++){
        *sum=(*sum)+arr[i];
    }
    return (void*) sum;
    
}

int main()
{
    int* sum;
    pthread_t t1;
    pthread_create(&t1, NULL, &routine, NULL);
    pthread_join(t1, (void**) &sum);
    printf("The sum is: %d",*sum);
    free(sum);
    return 0;
}