/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 1-DAM-T
 */
public class Calculadora {
/**
 * Variable privada: primer numero de la operacion
 */
 private int operador1;

 /**
 * Variable privada: segundo numero de la operacion
 */
 private int operador2;
 /**
 * Variable privada: aqui se mostrara el resultado de la operacion
 */
 private int operacion;

    public int getOperador1() {
        return operador1;
    }

    public void setOperador1(int operador1) {
        this.operador1 = operador1;
    }

    public int getOperador2() {
        return operador2;
    }

    public void setOperador2(int operador2) {
        this.operador2 = operador2;
    }

    public int getOperacion() {
        return operacion;
    }

    public void setOperacion(int operacion) {
        this.operacion = operacion;
    }

}
