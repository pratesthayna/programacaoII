package televisao;

public class Novela {
    
    private String titulo;
    private String periodo;
    private String horario;
    private String autor;
    private String emissora;
    private Double ibope;
    private Boolean violencia;
    private Boolean sexo;
    private Boolean drogas;
    
    public Novela()
    {
        this.titulo = null;
        this.periodo = null;
        this.horario = null;
        this.autor = null;
        this.emissora = null;
        this.ibope = null;
        this.violencia = null;
        this.sexo = null;
        this.drogas = null;
    }
   

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEmissora() {
        return emissora;
    }

    public void setEmissora(String emissora) {
        this.emissora = emissora;
    }

    public Double getIbope() {
        return ibope;
    }

    public void setIbope(Double ibope) {
        this.ibope = ibope;
    }

    public Boolean isViolencia() {
        return violencia;
    }

    public void setViolencia(Boolean violencia) {
        this.violencia = violencia;
    }

    public Boolean isSexo() {
        return sexo;
    }

    public void setSexo(Boolean sexo) {
        this.sexo = sexo;
    }

    public Boolean isDrogas() {
        return drogas;
    }

    public void setDrogas(Boolean drogas) {
        this.drogas = drogas;
    }
    
    public String obterClassificacao()
    {
        String classificacao;
        
        if(violencia == false && sexo == false && drogas == false)
        {
            classificacao = "Livre";
        }
        else if(violencia == true && sexo == false && drogas == false)
        {
            classificacao = "14 Anos";
        }
        else if(violencia == true && sexo == false && drogas == true)
        {
            classificacao = "16 Anos";
        }
        else 
        {
            classificacao = "18 Anos";
        }
        
        return classificacao;
        
    }
    
    public Double numeroMedio()
    {
        Double numero;
        
        numero = ibope * 10000;
        
        return numero;
    }
}
    
                
            
            
        
        
    
    
    
    

