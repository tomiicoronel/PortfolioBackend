package com.backend.ejercicios.poo;

public class CuentaBancaria {
    double saldo;

    public void depositar(double monto) {
        saldo += monto;
    }

    public void retirar(double monto) {
        saldo -= monto;
    }

    public double consultarSaldo() {
        return saldo;
    }
}
