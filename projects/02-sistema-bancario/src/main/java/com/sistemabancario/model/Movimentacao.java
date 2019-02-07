package com.sistemabancario.model;

/**
 * Representa uma movimentação em uma conta bancária, que pode indicar entrada ou saída. 
 * A classe possui os seguintes requisitos:
 * 
 * - Se o tipo for débito, o valor da movimentação não pode ser superior ao saldo total.
 * - A cada movimentação adicionada, alterada ou removida, deve-se atualizar o saldo, 
 * caso a operação tenha sido confirmada.
 *
 * Mesmo sendo possível obter o saldo somando-se todas as movimentações, 
 * à medida que os dados no sistema aumentarem ao longo do tempo, 
 * calcular o saldo pode se tornar uma operação extremamente lenta caso o histórico de movimentações seja grande 
 * (principalmente depois de alguns anos).
 */
public class Movimentacao implements Cadastro {
    private long id;
    private String descricao;

    /**
     * Tipo da movimentação deve ser C para crédito (entrada de dinheiro) ou D para débito (saída de dinheiro).
     */
    private char tipo;

    /**
     * Valor monetário da movimentação.
     * O valor não deve ser negativo, uma vez que existe o atributo {@link #tipo}.
     */
    private double valor;

    /**
     * Indica se a movimentação foi confirmada e deve ser registrada no saldo da conta.
     * Movimentacoes devem ser instanciadas como "confirmadas".
     *
     * <p>Somente operações como depósito em envelope ou em cheque devem ser registradas inicialmente como não confirmadas.
     * Após uma operação ser confirmada, deve-se atualizar o saldo da conta.</p>
     */
    private boolean confirmada;

    @Override
    public long getId() {
        return id;
    }

    @Override
    public void setId(long id) {
        this.id = id;
    }

    public char getTipo(){
        return tipo;
    }

    public void setTipo(char tipo){
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public boolean isConfirmada() {
        return confirmada;
    }

    public void setConfirmada(boolean confirmada) {
        this.confirmada = confirmada;
    }

}