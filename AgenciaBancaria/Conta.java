import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.time.LocalDateTime;

public class Conta
{
    private int codigo;
    private String tipo;  
    private double saldo;  
    private double limite;
    private String aniversario;
    private ArrayList<String> transacoes = new ArrayList<>();
    
    public Conta()
    {

    }
    
    public boolean isDevedor(){
        return (saldo<0) ? true : false;
    }
    
    public boolean depositar(double valor){
        saldo = saldo+valor;
        transacoes.add("Data: " + LocalDateTime.now() + " - Depósito: R$" + valor + "Saldo: R$" + saldo);
        return true;
    }
    
    public boolean transferir(double valor, Conta c){
        if(valor<=saldo+limite){
            saldo-=valor;
            c.saldo+=valor;
            transacoes.add("Data: " + LocalDateTime.now() + " - Transferência Enviada: -R$" + valor + "Saldo: R$" + saldo);
            c.transacoes.add("Data: " + LocalDateTime.now() + " - Transferência Recebida: +R$" + valor + "Saldo: " + saldo);
            return true;
        }
        
        return false;
    }

    
    public boolean sacar(double valor){
        if(valor<=saldo+limite){
            saldo-=valor;
            transacoes.add("Data: " + LocalDateTime.now() + " - Saque: -R$" + valor + "Saldo: R$" + saldo);
            return true;
        }
        return false;
    }
    
    public String getTipo(){
        return this.tipo;
    }
    
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    
    public String getAniversario(){
        return this.aniversario;
    }
    
    public void setAniversario(String aniversario){
        this.aniversario = aniversario;
    }
    
    public double getSaldo(){
        return this.saldo;
    }

    public double getLimite(){
        return this.limite;
    }
    
    public void setLimite(double limite){
        this.limite = limite;
    }
    
    public int getCodigo(){
        return this.codigo;
    }
    
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    
    public ArrayList<String> getTransacoes(){
        return this.transacoes;
    }
    
    //public void setContas(ArrayList<String> transacoes){
      //  this.transacoes = transacoes;
    //}
        
    
}
