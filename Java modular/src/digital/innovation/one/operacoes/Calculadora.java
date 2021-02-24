package digital.innovation.one.operacoes;

import digital.innovation.one.operacoes.internal.DivHelp;
import digital.innovation.one.operacoes.internal.MultiHelp;
import digital.innovation.one.operacoes.internal.SubHelp;
import digital.innovation.one.operacoes.internal.SumHelp;

import java.util.List;

public class Calculadora {

    private DivHelp divHelp;
    private MultiHelp multiHelp;
    private SumHelp sumHelp;
    private SubHelp subHelp;

    public Calculadora(){
        divHelp = new DivHelp();
        multiHelp = new MultiHelp();
        sumHelp = new SumHelp();
        subHelp = new SubHelp();
    }

    public int sum(int a, int b){
        return sumHelp.execute(a, b);
    }

    public int sub(int a, int b){
        return subHelp.execute(a, b);
    }

    public int multi(int a, int b){
        return multiHelp.execute(a,b);
    }

    public int dic(int a, int b){
        return divHelp.execute(a, b);
    }
}
