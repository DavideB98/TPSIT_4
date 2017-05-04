
package fattoriale;

public class Calcolo extends Thread{
    private int numero;
    
public Calcolo(int numero){
        this.numero= numero;
    }

    @Override
    public void run(){
        int somma=1;
        for(int i=1;i<numero;i++){
            somma*=i;            
    }
        System.out.println("x: "+numero+"   "+somma+"");
    
}
}
