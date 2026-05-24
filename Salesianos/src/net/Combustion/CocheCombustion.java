package net.Combustion;

import net.vehiculo.Vehiculo;

public class CocheCombustion extends Vehiculo {
    private boolean motorCombustionEncendido;
    private double litrosCombustible;

    public CocheCombustion(String color, int numeroPuertas, int numeroRuedas, String modelo,
            String matricula, boolean motorCombustionEncendido, double litrosCombustible) {
        super(color, numeroPuertas, numeroRuedas, modelo, matricula);
        this.motorCombustionEncendido = motorCombustionEncendido;
        setLitrosCombustible(litrosCombustible);
    }

    @Override
    public void arrancar() {
        if (motorCombustionEncendido) {
            System.out.println("El coche ya estaba arrancado.");
            return;
        }

        if (litrosCombustible <= 0) {
            motorCombustionEncendido = false;
            System.out.println("No se puede arrancar: el coche no tiene combustible.");
            return;
        }

        litrosCombustible--;
        motorCombustionEncendido = true;
        System.out.printf("El motor ha arrancado. Quedan %.2f litros de combustible.%n", litrosCombustible);
    }

    @Override
    public void pararMotor() {
        motorCombustionEncendido = false;
        System.out.println("El motor se ha parado.");
    }

    @Override
    public void mover() {
        if (!motorCombustionEncendido) {
            System.out.println("El coche no puede moverse porque el motor no esta arrancado.");
            return;
        }

        if (litrosCombustible <= 0) {
            System.out.println("El coche no puede moverse porque no tiene combustible.");
            pararMotor();
            return;
        }

        litrosCombustible--;
        System.out.printf("El coche se ha movido y ha consumido 1 litro. Quedan %.2f litros.%n",
                litrosCombustible);

        if (litrosCombustible <= 0) {
            System.out.println("El coche se ha quedado sin combustible.");
            pararMotor();
        }
    }

    public boolean isMotorCombustionEncendido() {
        return motorCombustionEncendido;
    }

    public void setMotorCombustionEncendido(boolean motorCombustionEncendido) {
        this.motorCombustionEncendido = motorCombustionEncendido;
    }

    public double getLitrosCombustible() {
        return litrosCombustible;
    }

    public void setLitrosCombustible(double litrosCombustible) {
        if (litrosCombustible < 0) {
            this.litrosCombustible = 0;
        } else {
            this.litrosCombustible = litrosCombustible;
        }
    }

    @Override
    public String toString() {
        return "CocheCombustion{"
                + "color='" + color + '\'' + ", numeroPuertas=" + numeroPuertas
                + ", numeroRuedas=" + numeroRuedas + ", modelo='" + modelo + '\''
                + ", matricula='" + matricula + '\'' + ", motorCombustionEncendido=" + motorCombustionEncendido
                + ", litrosCombustible=" + litrosCombustible + '}';
    }
}
