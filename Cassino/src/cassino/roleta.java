
package cassino;


public class roleta {
    double numrol;
    Conta conta =new Conta();
    public String rol1(double numrec, double goldr){
         numrol=Math.random()*(36-0);
         if(numrec>=0 && numrec<=36){
             
         
         if(numrec==numrol){
             this.conta.gold=this.conta.gold+(goldr*35);
         return "você agora tem "+this.conta.gold+" gold";
    }else return"você perdeu a aposta e ficou com"+ this.conta.gold+" gold";
    }else return "você digitou um numero maior que 36 ou menor que 0";
    
}
    public String rol21(double numrec, double goldr){
        numrol=Math.random()*(36-0);
        if(numrec>=0&& numrec<=36){
            if(numrec>=0&&numrec<=12){
                this.conta.gold=this.conta.gold+(goldr*2);
                return "voce acertou e ficou com um total de "+this.conta.gold+" gold";
            }else return "você não ganhou nada";
        }else return "você digitou algo incompativel";
    }

public String rol213(double numrec, double goldr){
numrol=Math.random()*(36-0);
if(numrec>=0&& numrec<=36){
            if(numrec>=13&&numrec<=24){
                this.conta.gold=this.conta.gold+(goldr*2);
                return "voce acertou e ficou com um total de "+this.conta.gold+" gold";
            }else return "você não ganhou nada";
        }else return "você digitou algo incompativel";
    }

public String rol236(double numrec, double goldr){
numrol=Math.random()*(36-0);
if(numrec>=0&& numrec<=36){
            if(numrec>=25&&numrec<=36){
                this.conta.gold=this.conta.gold+(goldr*2);
                return "voce acertou e ficou com um total de "+this.conta.gold+" gold";
            }else return "você não ganhou nada";
        }else return "você digitou algo incompativel";
}
public String rol318(double numrec, double goldr){
    numrol=Math.random()*(36-0);
if(numrec>=0&& numrec<=36){
            if(numrec>=1&&numrec<=18){
                this.conta.gold=this.conta.gold+(goldr*1);
                return "voce acertou e ficou com um total de "+this.conta.gold+" gold";
            }else return "você não ganhou nada";
        }else return "você digitou algo incompativel";
}
public String rol336(double numrec, double goldr){
    numrol=Math.random()*(36-0);
if(numrec>=0&& numrec<=36){
            if(numrec>=19&&numrec<=36){
                this.conta.gold=this.conta.gold+(goldr*1);
                return "voce acertou e ficou com um total de "+this.conta.gold+" gold";
            }else return "você não ganhou nada";
        }else return "você digitou algo incompativel";
}
public String rolpar(double numrec, double goldr){
    numrol=Math.random()*(36-0);
if(numrec>=0&& numrec<=36){
            if(numrec%2==0){
                this.conta.gold=this.conta.gold+(goldr*1);
                return "voce acertou e ficou com um total de "+this.conta.gold+" gold";
            }else return "você não ganhou nada";
        }else return "você digitou algo incompativel";
}
public String rolimpar(double numrec, double goldr){
    numrol=Math.random()*(36-0);
if(numrec>=0&& numrec<=36){
            if(numrec%2==1){
                this.conta.gold=this.conta.gold+(goldr*1);
                return "voce acertou e ficou com um total de "+this.conta.gold+" gold";
            }else return "você não ganhou nada";
        }else return "você digitou algo incompativel";
}
}