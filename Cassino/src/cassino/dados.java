
package cassino;


public class dados {
    private double num1;
    
    
    Conta conta=new Conta();
    public String jogar(double numrec, double goldr){
        double nummais1;
        double nummenos1;
        nummais1=numrec+1;
        nummenos1=numrec-1;
    if(numrec<= 12 && numrec>=2){
        num1=Math.random()*(12-2);
        if(numrec==num1){
            this.conta.gold=(goldr*12)+this.conta.gold;
            return "você acertou e totalizou "+this.conta.gold+" gold";
        }else 
            
        
            if(numrec==nummais1|| numrec==nummenos1){
            this.conta.gold=(goldr*5)+this.conta.gold;
            return "você errou por um mas ficou com  "+this.conta.gold+" gold";
            }else {
                
            this.conta.gold=this.conta.gold-goldr;
            return "você nao conseguiu e perdeu e agora esta com "+this.conta.gold+" gold";
            }
    }else return "a aposta nao pode ser feita";
    
    
    
}
    
    
    
    
}
