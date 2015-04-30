
package cassino;

import javax.swing.JOptionPane;


public class Cassino {

   
    public static void main(String[] args) {
        Integer opcao=-1;
        Conta conta =new Conta();
        dados dados=new dados();
        roleta Roleta=new roleta();
        while(opcao!=0){
        opcao=Integer.parseInt(JOptionPane.showInputDialog("digite a opcao desejada: \n 1-criar conta \n 2-logar na conta \n 3-adicionar cash a conta \n 4-comprar roupa \n 5- jogo de dados \n 6- jogo da roleta \n 0-sair"));
        if(opcao==1){
        Boolean deucerto=conta.Abrir(JOptionPane.showInputDialog("digite o seu nome: "), JOptionPane.showInputDialog("digite o login que deseja usar: "), JOptionPane.showInputDialog("digite a senha que deseja usar: "), JOptionPane.showInputDialog("confirme a sua senha: "));
        
        if(deucerto==true)
        JOptionPane.showMessageDialog(null, "a sua conta foi criada com sucesso!!!!");
        else
        JOptionPane.showMessageDialog(null, "a sua conta não pode ser criada");}
        else
        if(opcao==2){
        Boolean senha;
        senha = conta.entrar(JOptionPane.showInputDialog("digite o seu login:"), JOptionPane.showInputDialog("digite a sua senha:"));
        
        if(senha==true)
            JOptionPane.showMessageDialog(null, "logado com sucesso");
        else JOptionPane.showMessageDialog(null,"nao foi possivel logar");
        }else if(opcao==3){
            Boolean cash;
            cash=conta.inserircash(JOptionPane.showInputDialog("digite o numero do cartao de credito"),JOptionPane.showInputDialog("digite o valor que deseja gastar"));
            if(cash==true)
                JOptionPane.showMessageDialog(null, "valor depositado com sucesso");
            else JOptionPane.showMessageDialog(null, "valor nao pode ser depositado");
        }else
        if(opcao==4){
            Boolean item;
            
            item=conta.Comprarcash(JOptionPane.showInputDialog("Roupa \n 1-terno 40\n 2-smoking 45\n 3-vestido rosa 35\n 4-tubinho dourado 55\n Acessorios \n5- relogio dourado 50\n 6-sem relogio 100\n 7- pulseira preta 30\n 8- pulseira rosa 60 \n Calcados\n 9- sem sapato 100\n 10-sapato de luxo preto 20\n 11- nike rasgado 80\n 12- sapato furado na ponta 150"));
            if(item==true)
                JOptionPane.showMessageDialog(null, "a compra foi feita com sucesso");
            else JOptionPane.showMessageDialog(null, "a compra nao foi feita com sucesso");
        }else
        if(opcao==5){
            String result;
            result=dados.jogar(Double.parseDouble (JOptionPane.showInputDialog("digite o numero em que deseja apostar")), Double.parseDouble(JOptionPane.showInputDialog("digite o valor que deseja apostar")));
            JOptionPane.showMessageDialog(null, result);
        }else
            if(opcao==6){
                
                double opcaorol;
                opcaorol=Double.parseDouble(JOptionPane.showInputDialog("aposte na categoria que você quer\n 1-numero unico\n 2-apostar em 1-12/13-24/25-36 com pagamento de 2 para 1\n 3- para apostar em 1-18/ 19-36 com pagamento de 1 para 1 \n 4- para apostar em um numero par ou impar"));
              if(opcaorol==1){
                  String resultrol;
                  resultrol=Roleta.rol1(Double.parseDouble (JOptionPane.showInputDialog("digite um numero entre 0 e 36 que queira apostar")), Double.parseDouble(JOptionPane.showInputDialog("digite o valor que você queira apostar")));
                  JOptionPane.showMessageDialog(null, resultrol);
              }  else if(opcaorol==2){
                  double opcao2;
                  opcao2=Double.parseDouble(JOptionPane.showInputDialog("digite a categoria que vai apostar \n 1- 1/12\n2 -13/24\n 3- 25/36"));
                  if(opcao2==1){
                      String resultrol;
                      resultrol=Roleta.rol21((Double.parseDouble(JOptionPane.showInputDialog("digite o numero em que deseja apostar"))),Double.parseDouble(JOptionPane.showInputDialog("digite o valor que deseja apostar")));
                      JOptionPane.showMessageDialog(null,resultrol);
                  }else
                      if(opcao2==2){
                          String resultrol;
                      resultrol=Roleta.rol213((Double.parseDouble(JOptionPane.showInputDialog("digite o numero em que deseja apostar"))),Double.parseDouble(JOptionPane.showInputDialog("digite o valor que deseja apostar")));
                      JOptionPane.showMessageDialog(null,resultrol);
                      }else
                          if(opcao2==3){
                               String resultrol;
                      resultrol=Roleta.rol236((Double.parseDouble(JOptionPane.showInputDialog("digite o numero em que deseja apostar"))),Double.parseDouble(JOptionPane.showInputDialog("digite o valor que deseja apostar")));
                      JOptionPane.showMessageDialog(null,resultrol);
                          }
                  if(opcaorol==3){
                      double opcao3;
                  opcao3=Double.parseDouble(JOptionPane.showInputDialog("digite a categoria que vai apostar \n 1- 1/12\n2 -13/24\n 3- 25/36"));
                  if(opcao3==1){
                      String resultrol;
                      resultrol=Roleta.rol318((Double.parseDouble(JOptionPane.showInputDialog("digite o numero em que deseja apostar"))),Double.parseDouble(JOptionPane.showInputDialog("digite o valor que deseja apostar")));
                      JOptionPane.showMessageDialog(null,resultrol);
                  }else
                      if(opcao3==2){
                          String resultrol;
                      resultrol=Roleta.rol336((Double.parseDouble(JOptionPane.showInputDialog("digite o numero em que deseja apostar"))),Double.parseDouble(JOptionPane.showInputDialog("digite o valor que deseja apostar")));
                      JOptionPane.showMessageDialog(null,resultrol);
                      }
                  }else
                      if(opcaorol==4){
                        
                      double opcao4;
                  opcao4=Double.parseDouble(JOptionPane.showInputDialog("digite a categoria que vai apostar \n 1- 1/12\n2 -13/24\n 3- 25/36"));
                  if(opcao4==1){
                      String resultrol;
                      resultrol=Roleta.rolpar((Double.parseDouble(JOptionPane.showInputDialog("digite o numero em que deseja apostar"))),Double.parseDouble(JOptionPane.showInputDialog("digite o valor que deseja apostar")));
                      JOptionPane.showMessageDialog(null,resultrol);
                  }else
                      if(opcao4==2){
                          String resultrol;
                      resultrol=Roleta.rolimpar((Double.parseDouble(JOptionPane.showInputDialog("digite o numero em que deseja apostar"))),Double.parseDouble(JOptionPane.showInputDialog("digite o valor que deseja apostar")));
                      JOptionPane.showMessageDialog(null,resultrol);
                      }
                  
              }}
            }
        }
        }
    }
    

