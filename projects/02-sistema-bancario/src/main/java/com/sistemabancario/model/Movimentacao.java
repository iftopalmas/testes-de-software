package com.sistemabancario.model;

/**
 * Representa uma movimentação em uma {@link Conta} bancária, que pode indicar entrada ou saída.
 *
 * <p>
 * <b>NOTA</b>: Mesmo sendo possível obter o saldo somando-se todas as movimentações,
 * à medida que os dados no sistema aumentarem ao longo do tempo, 
 * calcular o saldo pode se tornar uma operação extremamente lenta.
 * Isto normalmente ocorrer quando o histórico de movimentações se torna longo
 * (principalmente depois de alguns anos).
 * </p>
 */
public class Movimentacao implements Cadastro {
    private long id;
    private String descricao;

    /**
     * Conta bancária a qual a movimentação está vinculada.
     */
    private Conta conta;

    /**
     * Tipo da movimentação deve ser 'C' para crédito (entrada de dinheiro)
     * ou 'D' para débito (saída de dinheiro).
     *
     * (1)
     */
    private char tipo;

    /**
     * Valor monetário da movimentação.
     * O valor não deve ser negativo, uma vez que existe o atributo {@link #tipo}. (2)
     * Se o tipo for débito, o valor da movimentação não pode ser superior ao saldo total da {@link Conta}. (3)
     */
    private double valor;

    /**
     * Indica se a movimentação foi confirmada e deve ser registrada no saldo da conta,
     * quando for adicionada à lista de movimentações usando {@link Conta#addMovimentacao(Movimentacao)}.
     *
     * <p>Movimentacoes devem ser instanciadas como "confirmadas" por padrão. (4)
     * Somente operações como depósito em envelope ou em cheque devem ser registradas inicialmente como não confirmadas.
     * Após uma operação ser confirmada, deve-se atualizar o saldo da conta.</p>
     *
     * @see Conta#depositoEnvelope(double)
     * @see Conta#depositoCheque(double)
     */
    private boolean confirmada;

    /**
     * Instancia uma movimentação para uma determinada {@link Conta} bancária. (5)
     * @param conta a {@link Conta} para vincular a movimentação.
     */
    public Movimentacao(Conta conta){
        // TODO: Você precisa implementar este método
    }

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