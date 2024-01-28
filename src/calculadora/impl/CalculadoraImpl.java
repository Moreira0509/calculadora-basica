package calculadora.impl;

import calculadora.Calculadora;

public class CalculadoraImpl implements Calculadora {
    public Integer getSoma(Integer a, Integer b){
        return a+b;
    }
    public  Integer getSubtracao(Integer a, Integer b) {
        Integer result;
        result = a -b;
        return result;
    }
}
