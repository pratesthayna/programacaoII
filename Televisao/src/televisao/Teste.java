package televisao;

import javax.swing.JOptionPane;

public class Teste {

    public static void main(String[] args) {
      
        Ator a = new Ator();
        
        a.setNome(JOptionPane.showInputDialog("Informe o nome de um(a) ator/atriz:"));
        a.setData(JOptionPane.showInputDialog("Data de nascimento:"));
        a.setNovelas(Integer.parseInt(JOptionPane.showInputDialog("Quantidade de novelas:")));
        a.setEmail(JOptionPane.showInputDialog("Email:"));
        a.setArtistico(JOptionPane.showInputDialog("Nome artistico:"));
        a.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Salário:")));
        a.setCache(Double.parseDouble(JOptionPane.showInputDialog("Cachê:")));
        a.setCidade(JOptionPane.showInputDialog("Cidade:"));
        a.setEndereco(JOptionPane.showInputDialog("Endereço:"));
        a.setBairro(JOptionPane.showInputDialog("Bairro:"));
        a.setEstado(JOptionPane.showInputDialog("Estado:"));
        
        JOptionPane.showMessageDialog(null, "Ator\nNome Artístico:" + a.getArtistico() + "\nData de Nascimento:"
        + a.getData() + "\nEmail:" + a.getEmail() + "\nQuantidade de Novelas:" + a.getNovelas() + "\nStatus:" +a.obterStatus() + "\nGanhos Mensais:" +a.calcularGanhos(3));
        
        Novela n = new Novela();
        
        n.setTitulo(JOptionPane.showInputDialog("Título:"));
        n.setPeriodo(JOptionPane.showInputDialog("Período:"));
        n.setHorario(JOptionPane.showInputDialog("Horário:"));
        n.setAutor(JOptionPane.showInputDialog("Autor:"));
        n.setEmissora(JOptionPane.showInputDialog("Emissora:"));
        n.setIbope(Double.parseDouble(JOptionPane.showInputDialog("Ibope:")));
        int vio = Integer.parseInt(JOptionPane.showInputDialog("Contém cenas de violência? 1 - sim / 2 - não"));
        if(vio == 1)
        {
            n.setViolencia(true);
        }
        else
        {
            n.setViolencia(false);
        }
        int sex = Integer.parseInt(JOptionPane.showInputDialog("Contém cenas de sexo? 1 - sim / 2 - não"));
        if(sex == 1)
        {
            n.setSexo(true);
        }
        else
        {
            n.setSexo(false);
        }
        int dro = Integer.parseInt(JOptionPane.showInputDialog("Contém cenas de drogas? 1 - sim / 2 - não"));
        if(dro == 1)
        {
            n.setDrogas(true);
        }
        else
        {
            n.setDrogas(false);
        }
        
        JOptionPane.showMessageDialog(null, "Novela\nTítulo:" + n.getTitulo() + "\nPeríodo:" 
           + n.getPeriodo() + "\nHorário:" + n.getHorario() + "\nAutor:" + n.getAutor() + "\nEmissora:" + n.getEmissora() + "\nIbope:" + n.getIbope() + "\nClassificação Indicativa:" + n.obterClassificacao() + "\nAudiência:" + n.numeroMedio());
        
        
                
       
        
        


        
    }
    
}
