
package Controlador;

import Modelo.Numero;

/**
 *
 * @author USRVI-LC2
 */
public class Calculo {
    
    
    public int sumar(Numero num)
    {
        int suma = num.getNum1() + num.getNum2();
        return suma;
    }
    
    public int restar(Numero num)
    {
        int restar = num.getNum1() - num.getNum2();
        return restar;
    }
    
    public int multiplicar(Numero num)
    {
        int multi = num.getNum1() * num.getNum2();
        return multi;
    }
    
    public double dividir(Numero num)
    {
        double dividir = num.getNum1() / num.getNum2();
        return dividir;
    }
    
}
