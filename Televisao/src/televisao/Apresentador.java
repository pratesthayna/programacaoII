package televisao;

public class Apresentador {
    
    private String nome;
    private String data;
    private String programa;
    private String email;
    private String artistico;
    private Double salario;
    private Double cache;
    private Double merchandising;
    private String cidade;
    private String endereco;
    private String bairro;
    private String estado;
    
    public Apresentador()
    {
        this.nome = null;
        this.data = null;
        this.programa = null;
        this.email = null;
        this.artistico = null;
        this.salario = 0.0;
        this.cache = 0.0;
        this.merchandising = 0.0;
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

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
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

    public Double getMerchandising() {
        return merchandising;
    }

    public void setMerchandising(Double merchandising) {
        this.merchandising = merchandising;
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
    
    public Double calcularGanhos(Integer numeroEventos)
    {
        Double total;
        
        total = salario + (cache * numeroEventos) + merchandising;
        
        return total;
    }
    
    
    
}
