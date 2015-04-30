package caixaeletronico;

public class Banco {
    
    private String nome;
    private String numero;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
      
       String buscarBanco(String vnumero)
    {
        switch (vnumero) {
            case "001":
                return "Banco do Brasil";
            case "047":
                return "Banco do Estado do Sergipe";
            case "037":
                return "Banco do Estado do Pará";
            case "041":
                return "Banco do Estado do Rio Grande do Sul";
            case "004":
                return "Banco do Nordeste do Brasil";
            default:
                return"";
        }
                
                
                  
                
            
    }
    
    
}
