package com.sistemabancario.model;

/**
 * Representa uma conta bancária de um determinado cliente, tendo os seguintes requisitos:
 * 
 * - Somente contas especiais podem ter limite (ou seja limite maior que 0).
 * - Uma conta não pode ser excluída se existirem movimentações.
 */
public class Conta implements Cadastro {
    private long id;

    private String numero;

    /**
     * Contas devem ser instanciadas como "Conta Corrente" e não como "Poupança".
     * Mesmo que o valor padrão para o atributo "poupanca" seja false,
     * o código pode ser alterado e tal requisito pode deixar de  ser atendido futuramente.
     */
    private boolean poupanca;

    /**
     * Contas especiais podem ter limite.
     */
    private boolean especial;

    private double saldo;

    private double limite;

    public Conta() {
    }

    /**
     * @param banco 
     * @param especial 
     * @param limite
     */
    public void Conta(Banco banco, boolean especial, double limite) {
        // TODO: Você precisa implementar este método
    }

    /**
     * Valor total disponível na conta, incluindo o limite.
     * @return
     */
    public double getSaldoTotal() {
        // TODO: Você precisa implementar este método
        return 0.0d;
    }

    /**
     * Registra uma nova movimentação para retirar um determinado valor da conta.
     * 
     * <ul>
     * <li>Se o valor for menor ou igual ao saldo total.</li>
     * <li>Se for tentando realizar dois saques ao mesmo tempo com valor igual ao saldo total, 
     * somente o primeiro saque deve ser permitido. 
     * Isto evita que um cliente que possua dois cartões da mesma conta
     * tente retirar mais dinheiro do que há disponível na conta. 
     * Ele poderia tentar fazer isso solicitando a ajuda de outra pessoa. 
     * Assim, as duas pessoas poderiam tentar ir em caixas diferentes ao mesmo tempo 
     * para tentar realizar um saque em duplicidade.</li>
     * </ul>
     * @param valor valor a ser sacado (deve ser um valor positivo)
     */
    public void saque(double valor) {
        // TODO: Você precisa implementar este método
    }

    /**
     * Adiciona uma nova movimentação de depósito em envelope
     * (que deve ser confirmada posteriormente por um funcionário do banco).
     * @param valor valor a ser depositado (deve ser um valor positivo)
     */
    public void depositoEnvelope(double valor) {
        // TODO: Você precisa implementar este método
    }

    /**
     * Adiciona uma nova movimentação genérica, como 
     * saque, transferência, depósito no balcão 
     * (no lugar de depósito por envelope), etc.
     * Movimentações adicionadas com este método devem ser automaticamente confirmadas e o saldo atualizado.
     * @param movimentacao
     */
    public void addMovimentacao(Movimentacao movimentacao) {
        // TODO: Você precisa implementar este método
    }

    @Override
    public long getId() {
        // TODO: Você precisa implementar este método
        return 0;
    }

    /**
     * @param id
     */
    @Override
    public void setId(long id) {
        // TODO: Você precisa implementar este método
    }
}