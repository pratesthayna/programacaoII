package caixaeletronico;

import javax.swing.JOptionPane;

public class CaixaEletronico {

    public static void main(String[] args) {

        Conta c = new Conta();

        Banco b = new Banco();
  
        Integer opcao = -1;
        
        while(opcao!=0)
        {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("CAIXA ELETRONICO"
                    + "\n1 - Abrir"
                    + "\n2 - Depositar"
                    + "\n3 - Sacar"
                    + "\n4 - Saldo"
                    + "\n5 - Fechar"
                    + "\n6 - Buscar Banco"
                    + "0 - Sair"));
            
        switch(opcao){
         
        case 1: 
                String cliente, agencia, numero;
                 cliente = JOptionPane.showInputDialog("Correntista:");
                 agencia = JOptionPane.showInputDialog("Agencia:");
                 numero = JOptionPane.showInputDialog("Número:");

                 c.abrir(cliente,agencia,numero);
                 JOptionPane.showMessageDialog(null, "Conta criada com sucesso!");
                 break;
        case 2: 
                Double valor = Double.parseDouble(JOptionPane.showInputDialog("Depósito:"));
                 Boolean ret = c.depositar(valor);
                    if(ret==true)
                        {
                            JOptionPane.showMessageDialog(null,"Depósito ok!");
                        }
                       else
                        {
                            JOptionPane.showMessageDialog(null,"Não foi possivel depositar!");
                        }
                        break;
        case 3: 
                Double valor2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do saque:"));
                 Boolean ret2 = c.sacar(valor2);
                    if(ret2==true)
                        {
                            JOptionPane.showMessageDialog(null,"Saque ok!"); 
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null,"Não foi possível sacar!");
                        }
                        break;
        case 4: 
                JOptionPane.showMessageDialog(null,"Saldo:" + c.retornarSaldo());
                        break;
        case 5: 
                JOptionPane.showMessageDialog(null,"Sua conta foi desativada!" + c.fecharConta());
                        break;
        case 6:
                String num = JOptionPane.showInputDialog("Digite o número do banco:");
                b.buscarBanco(num);
                JOptionPane.showMessageDialog(null,b.buscarBanco(num));
                        break;
                     
                         default: 
                             
                JOptionPane.showMessageDialog(null,"Opção inválida!");
                       
                             
        }
JOptionPane.showMessageDialog(null,"Resumo da Conta" + "\nAgência:" + c.getAgencia() + "\nNúmero da Conta:" + c.getCliente() + "\nCorrentista:" + c.getCliente() + "\nSaldo:" + c.getSaldo());
                             
                       
  }
    }
    
}
                
                       
       

                
      
