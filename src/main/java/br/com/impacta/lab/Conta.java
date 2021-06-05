package br.com.impacta.lab;

public class Conta {

    private Integer numero;
    private Integer agencia;
    private String tipo;

    public Conta(Integer numero, Integer agencia, String tipo) {
        this.setNumero(numero);
        this.setAgencia(agencia);
        this.setTipo(tipo);
    }

    public Integer getNumero() {
        return this.numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Integer getAgencia() {
        return this.agencia;
    }

    public void setAgencia(Integer agencia) {
        this.agencia = agencia;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String montarResumoDaConta() {
        return  "Numero: "      + this.getNumero()  + 
                " - Agencia: "  + this.getAgencia() +
                " - Tipo: "     + this.getTipo();
    }
}
