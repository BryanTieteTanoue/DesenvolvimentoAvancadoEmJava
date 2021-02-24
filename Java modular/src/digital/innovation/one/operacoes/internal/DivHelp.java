package digital.innovation.one.operacoes.internal;

import digital.innovation.one.operacoes.Operacao;

public class DivHelp implements Operacao {
    @Override
    public int execute(int a, int b) {
        return a / b;
    }
}
