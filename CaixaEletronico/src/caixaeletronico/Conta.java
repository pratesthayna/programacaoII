package caixaeletronico;

public class Conta {
    private String agencia;
    private String numeroConta;
    private Cliente cliente;
    private Double saldo;
    private Boolean ativo;
    private Gerente gerente;

    public Gerente getGerente() {
        return gerente;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }
    
    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }
    
     public Conta()
    {
        this.agencia = null;
        this.ativo = false;
        this.cliente = new Cliente();
        this.numeroConta = null;
        this.saldo = null;
        this.gerente = new Gerente();
    }
    
    public void abrir(String vagencia, String vnumero, Cliente vnome)
    {
        this.agencia = vagencia;
        this.numeroConta = vnumero;
        this.cliente = vnome;
        this.ativo = true;
        this.saldo = 0.0;
        
    }
    
    public Boolean fecharConta()
    {
       
        Boolean retorno;
        if(saldo==0.0)
        { 
            ativo=false;
            retorno = true;
        }
        else
        {
            retorno = false;
        }
        return retorno;
    }
    
    public Boolean depositar(Double valor)
    {
        if(ativo == true)
        {
            saldo = saldo + valor;
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public Boolean sacar(Double valor)
    {
        if(ativo == true && valor <= saldo)
        {
            saldo = saldo - valor;
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public Double retornarSaldo()
    {
        return saldo;
    }
}
