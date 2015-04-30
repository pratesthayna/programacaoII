package televisao;

public class Emissora {
    
    private String nome;
    private String endereco;
    private Boolean aberta;
    
    public Emissora()
    {
        this.nome = null;
        this.endereco = null;
        this.aberta = false;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Boolean isAberta() {
        return aberta;
    }

    public void setAberta(Boolean aberta) {
        this.aberta = aberta;
    }
    
    
    
    
    
}
