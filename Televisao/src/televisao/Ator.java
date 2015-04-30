package televisao;

public class Ator {
    
    private String nome;
    private String data;
    private Integer novelas;
    private String email;
    private String artistico;
    private Double salario;
    private Double cache;
    private String cidade;
    private String endereco;
    private String bairro;
    private String estado;
    
    public Ator()
    {
        this.nome = null;
        this.data = null;
        this.novelas = null;
        this.email = null;
        this.artistico = null;
        this.salario = 0.0;
        this.cache = 0.0;
        this.cidade = null;
        this.endereco = null;
        this.bairro = null;
        this.estado = null;
       
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

    public Integer getNovelas() {
        return novelas;
    }

    public void setNovelas(Integer novelas) {
        this.novelas = novelas;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getArtistico() {
        return artistico;
    }

    public void setArtistico(String artistico) {
        this.artistico = artistico;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Double getCache() {
        return cache;
    }

    public void setCache(Double cache) {
        this.cache = cache;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public String obterStatus()
    {
        String status;
        if(novelas <= 3 && salario < 5000)
        {
            status = "Calouro";
        }
        else if(novelas < 6)
        {
            status = "Revelação";
        }
        else if(novelas < 6 && salario > 30000)
        {
            status = "Joia";
        }
        else if(novelas > 9 && salario < 30000)
        {
            status = "Elenco de Apoio";
        }
        else if(salario > 30000 && salario < 100000)
        {
            status = "Elenco Principal";
        }
        else if(salario > 100000)
        {
            status = "Estrela";
        }
        else 
        {
            status = "Elenco Regular";
        }
        
        return status;
    }
    
    public Double calcularGanhos(Integer numeroEventos)
    {
        Double ganhos;
        
        ganhos = (cache * numeroEventos) + salario;
        
        return ganhos;
    }
        
   
            
    
    
    
    
            
    
    
}
