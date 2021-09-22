/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

import java.util.Calendar;

/**
 *
 * @author CBN
 */
public class Vehicle {
    private String placa;
    private int tipo;
    private String hora;
    private double valor_pagado;
    
    public Vehicle(String placa, int tipo, String hora, double valor){
        this.placa = placa;
        this.tipo = tipo;
        this.hora = hora;
        this.valor_pagado = valor;
    }
    
    public String getPlaca() {
        return placa;
    }

    public int getTipo() {
        return tipo;
    }

    public String getHora() {
        return hora;
    }

    public double getValor_pagado() {
        return valor_pagado;
    }
}
