import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.*;

public class Conta
{
    private int codigo;
    private String tipo;  
    private double saldo;  
    private double limite;
    private double taxa_manutencao;
    private double porc_rendimento; //porcentagem de rendimento
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
        transacoes.add("Data: " + LocalDateTime.now() + " - Depósito: R$" + valor + " Saldo: R$" + saldo);
        return true;
    }
    
    public boolean manutencao(){
        saldo = saldo-taxa_manutencao;
        if(transacoes.stream().filter(t->t.startsWith("Data: "+ DateTimeFormatter.ofPattern("yyyy-MM-dd").format(LocalDateTime.now()))
         && t.contains("Taxa de Manutenção")).collect(Collectors.toList()).size()<1){
            transacoes.add("Data: " + LocalDateTime.now() + " - Taxa de Manutenção: -R$" + taxa_manutencao + " Saldo: R$" + saldo);
            return true;
        }
        return false;
    }
    
    public boolean render(){
        saldo += saldo*porc_rendimento;
        transacoes.add("Data: " + LocalDateTime.now() + " - Rendimento: +R$" + taxa_manutencao + " Saldo: R$" + saldo);
        return true;
    }
    
    public boolean transferir(double valor, Conta c){
        if(valor<=saldo+limite){
            saldo-=valor;
            c.saldo+=valor;
            transacoes.add("Data: " + LocalDateTime.now() + " - Transferência Enviada: -R$" + valor + " Saldo: R$" + saldo);
            c.transacoes.add("Data: " + LocalDateTime.now() + " - Transferência Recebida: +R$" + valor + " Saldo: " + saldo);
            return true;
        }
        
        return false;
    }

    
    public boolean sacar(double valor){
        if(valor<=saldo+limite){
            saldo-=valor;
            transacoes.add("Data: " + LocalDateTime.now() + " - Saque: -R$" + valor + " Saldo: R$" + saldo);
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
    
    public double getTaxa_manutencao(){
        return this.taxa_manutencao;
    }
    
    public void setTaxa_manutencao(double taxa_manutencao){
        this.taxa_manutencao = taxa_manutencao;
    }
    
    public double getPorc_rendimento(){
        return this.porc_rendimento;
    }
    
    public void setPorc_rendimento(double porc_rendimento){
        this.porc_rendimento = porc_rendimento;
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
        
    
}
