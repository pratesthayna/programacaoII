package cassino;

public class Conta {

    
    private String senha;
    private String nome;
    private String login;
    private double cash;
     double gold;
    private boolean jogando;
    private String roupa;
    private String acessorio;
    private String sapato;

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public double getCash() {
        return cash;
    }

    public void setCash(double cash) {
        this.cash = cash;
    }

    public double getGold() {
        return gold;
    }

    public void setGold(double gold) {
        this.gold = gold;
    }

    public boolean isJogando() {
        return jogando;
    }

    public void setJogando(boolean jogando) {
        this.jogando = jogando;
    }

    public String getRoupa() {
        return roupa;
    }

    public void setRoupa(String roupa) {
        this.roupa = roupa;
    }

    public String getAcessorio() {
        return acessorio;
    }

    public void setAcessorio(String acessorio) {
        this.acessorio = acessorio;
    }

    public String getSapato() {
        return sapato;
    }

    public void setSapato(String sapato) {
        this.sapato = sapato;
    }

    
    
    
    Conta() {
        
       this. senha = null;
        this.nome = null;
        this.login = null;
        this.cash = 0;
        this.gold = 0;
        this.jogando = false;
        this.roupa = null;
        this.acessorio = null;
        this.sapato = null;

    }

    public Boolean Abrir(String vnome, String vlogin, String vsenha, String vconfirma) {

        Boolean deucerto;
        
        if(vsenha.equals(vconfirma)){
            
        nome = vnome;
        login = vlogin;
        senha = vsenha;
        jogando = false;
        gold = 50;
        cash = 0;
        roupa = "calca e camisa";
        acessorio = "relogio do camelo";
        sapato = "chinelo rider";
        deucerto=true;
        
        }else deucerto=false;
        return deucerto;
        

    }

    public Boolean entrar(String flogin, String fsenha) {
        
       Boolean deucerto;
        
        if(flogin .equals(login)&&fsenha .equals(senha)){
            jogando=true;
            
            deucerto=true;
        }else {
            jogando=false;
            
            deucerto=false;
        }
        return deucerto;
        

    }

    public Boolean inserircash(String cartao, String fvalor) {
        double num;
        double valor;
        valor = Double.parseDouble(fvalor);
        num = cartao.length();
       
                
        if (jogando == true &&  num==16) {
             
                
            

            if (valor <= 10) {
                cash = cash + (valor * 1);
            }
            if (valor >= 11 && valor <= 50) {
                cash = cash + (valor * 2);
            }
            if (valor > 50) {
                cash = cash + (valor * 3);
            }
            
            return true;}
         else 
            return false;
        

    
    }
    public Boolean Comprarcash(String vroupa) {
        Boolean certo=false;
        switch (vroupa) {
            case ("1"): {
                
                if (cash >= 40) {
                    roupa = "terno";
                    cash = cash - 40;
                    certo = true;
                } else {
                    certo = false;
                }

                break;
            }
            case ("2"): {
                
                if (cash >= 45) {
                    roupa = "smoking";
                    cash = cash - 45;
                    certo = true;
                } else {
                    certo = false;
                }
                break;
            }
            case ("3"): {
                
                if (cash >= 35) {
                    roupa = "vestido rosa";
                    cash = cash - 35;
                    certo = true;
                } else {
                    certo = false;
                }
                break;
            }
            case ("4"): {
                
                if (cash >= 55) {
                    roupa = "tubinho dourado";
                    cash = cash - 55;
                    certo = true;
                } else {
                    certo = false;
                }
                break;
            }
            case ("5"): {
                
                if (cash >= 50) {
                    acessorio = "relogio dourado";
                    cash = cash - 50;
                    certo = true;
                } else {
                    certo = false;
                }
                break;
            }
            case ("6"): {
                
                if (cash >= 100) {
                    acessorio = "sem relogio";
                    cash = cash - 100;
                    certo = true;
                } else {
                    certo = false;
                }
                break;
            }
            case ("7"): {
                
                if (cash >= 30) {
                    acessorio = "pulseira preta";
                    cash = cash - 30;
                    certo = true;
                } else {
                    certo = false;
                }
                break;
            }
            case ("8"): {
                
                if (cash >= 60) {
                    acessorio = "pulseira rosa";
                    cash = cash - 60;
                    certo = true;
                } else {
                    certo = false;
                }
                break;
            }
            case ("9"): {
                
                if (cash >= 100) {
                    sapato = "sem sapato";
                    cash = cash - 100;
                    certo = true;
                } else {
                    certo = false;
                }
                break;
            }
            case ("10"): {
                
                if (cash >= 20) {
                    sapato = "sapato de luxo preto";
                cash = cash - 20;
                    certo = true;
                } else {
                    certo = false;
                }
                break;
            }
            case ("11"): {
                
                if (cash >= 80) {
                    sapato = "nike rasgado";
                    cash = cash - 80;
                    certo = true;
                } else {
                    certo = false;
                }
                break;
            }
            case ("12"): {
                
                if (cash >= 150) {
                    sapato = "sapato furado na ponta";
                    cash = cash - 150;
                    certo = true;
                } else {
                    certo = false;
                }
                break;
            }
            

        }
        return certo;
    }
}
