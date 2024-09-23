package com.mycompany.calculadora2.controle;

import com.mycompany.calculadora2.enums.EnumOperacao;

public class CalculadoraController {
    
    private Double total;
    private Double ultimoValor;
    private EnumOperacao ultimaOperacao;
    
    public CalculadoraController() {
        total = 0.0;
        ultimoValor = 0.0;
        ultimaOperacao = null;
    }
    
    public Double realizaOperacao(EnumOperacao operacao, Double valor) {
        if (ultimaOperacao != null) {
            // Se já houver uma operação pendente, realiza a operação anterior
            switch (ultimaOperacao) {
                case SOMA:
                    total += ultimoValor;
                    break;
                case SUBTRACAO:
                    total -= ultimoValor;
                    break;
                case DIVISAO:
                    if (ultimoValor != 0) {
                        total /= ultimoValor;
                    } else {
                        throw new ArithmeticException("Divisão por zero");
                    }
                    break;
                case MULTIPLICACAO:
                    total *= ultimoValor;
                    break;
            }
        }

        // Atualiza o último valor e a última operação
        ultimoValor = valor;
        ultimaOperacao = operacao;
        
        // Realiza a operação com o valor atual
        switch (operacao) {
            case SOMA:
                total += valor;
                break;
            case SUBTRACAO:
                total -= valor;
                break;
            case DIVISAO:
                if (valor != 0) {
                    total /= valor;
                } else {
                    throw new ArithmeticException("Divisão por zero");
                }
                break;
            case MULTIPLICACAO:
                total *= valor;
                break;
        }
        return total;
    }
   
    public Double getTotal() {
        return this.total;
    }
    
    public void zerar() {
        total = 0.0;
        ultimoValor = 0.0;
        ultimaOperacao = null;
    }

    public void reset() {
        zerar(); // Chama o método zerar para reiniciar a calculadora
    }
}
