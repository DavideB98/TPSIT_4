/*Autor: Blaffard Davide
  Class: 4^INB
  Data: 30.03.17
*/

package verificaretta;

public class Retta {
    private double a=0;
    private double b=0;
    private double c=0;
    
    public Retta(){
    }
    
    public Retta(double a, double b, double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    
    public String getTipo(){
        if(a==0){
            return "La retta è: Orizzontale";
        }
        if(b==0){
            return "La retta è: Verticale";
        }
        return "La retta è: Obliqua";
    }
    
    public boolean appartiene(double x, double y){
        if(((this.a*x)+(this.b*y)+this.c)==0){
            return true;
        }else{
            return false;
        }
    }
    
    public String stampa(){
        String e="";
        
        e=e+a;
        if(b<0){
            e=e+" x "+b;
        }else{
            e=e+" x + "+b;
        }
        if(c<0){
            e=e+" y "+c;
        }else{
            e=e+" y + "+c;
        }
        e=e+" = 0";
        return e;
    }
    
}
