package caixaeletronico;


public class Cliente {
    
    private String cpf;
    private String nome;
    private String data;
    private String endereco;
    private Boolean negativadoSPC;
    private Boolean negativadoSERASA;
    private String pai;
    private String mae;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Boolean isNegativadoSPC() {
        return negativadoSPC;
    }

    public void setNegativadoSPC(Boolean negativadoSPC) {
        this.negativadoSPC = negativadoSPC;
    }

    public Boolean isNegativadoSERASA() {
        return negativadoSERASA;
    }

    public void setNegativadoSERASA(Boolean negativadoSERASA) {
        this.negativadoSERASA = negativadoSERASA;
    }

    public String getPai() {
        return pai;
    }

    public void setPai(String pai) {
        this.pai = pai;
    }

    public String getMae() {
        return mae;
    }

    public void setMae(String mae) {
        this.mae = mae;
    }
    
    public Boolean verificaCredito()
    {
    
        
        if(this.negativadoSPC == false && this.negativadoSERASA == false)
        {
            return true ;
        }
        else
        {
            return false;
        }

        
    }
} 
