/*Autore: Blaffard Davide
  Classe: 4^IN B
  Data: 1.12.16
  Testo: Inserie un numero 1<n<4 generare n processi figlio con un ciclo for.
         Per ogni processo stampare PID padre e PID figlio.   */

#include<stdio.h>
#include<stdlib.h>
#include<unistd.h>
#include<sys/types.h>

main(){
        int n,i;
        pid_t p;

        do{
           printf("Inserire il numero 'n'(compreso tra 1 e 4): ");
           scanf("%d", &n);
        }while((n<1)||(n>3));
        printf("Sono il padre (PID %d).\n", getpid());
        for(i=0; i<n; i++){
                printf("\n");
                p=fork();
                if(p==0){
                sleep(1);
                printf("Sono il figlio (PID %d) del padre (PID %d).\n",getpid(),getppid());
                }
        }
}
