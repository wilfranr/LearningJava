package model;

public class Wallet {
    
    public static final int CAPACIDAD_MAXIMA=1000000;
    private int saldo;
    private boolean tieneLimite;

    public Wallet(){
        super();
        saldo = 0;
        tieneLimite = true;
    }

    public int getSaldo(){//metodo para obtener el saldo
        return saldo;
    }

    public boolean getTeineLimite(){//metodo para devolver si tiene o no tiene limite
        return tieneLimite;
    }
    public void setTieneLimite(boolean newTieneLimite){
        this.tieneLimite = newTieneLimite;
    }
    public String saveMoney(int value){//metodo para guardar dinero en el saldo
        if (saldo + value > CAPACIDAD_MAXIMA && tieneLimite) {
            return "No se puede superar el limite " + CAPACIDAD_MAXIMA;
        }
        saldo += value;//saldo = saldo + value
        return "Transacción exitosa, nuevo saldo " + saldo;
    }
    public String takeMoney(int value){
        if (saldo >= value) {//si el saldo es mayor al retiro
            saldo -= value;//se resta el retiro del saldo
            return "Transacción exitosa, nuevo saldo " + saldo;
        }
        return "Saldo insuficiente";//si no, returna saldo insuficiente
    }
    public String breakLimit(){
        if (!tieneLimite) {
            return "Tu cuenta no tiene límites";
        }
        if (saldo >= 10000) {
            saldo -= 10000;
            setTieneLimite(false);
            return "Has roto los límites";
        }
        return "No tienes saldo suficiente ";
    }

}
