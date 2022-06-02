import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.*;
import java.util.stream.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Agencia
{
    private int codigo;
    private ArrayList<Conta> contas;

    public Agencia()
    {
        contas = new ArrayList<>();
    }
    
    public Conta pesquisar(int codigo){
        for(Conta c:contas){
            if(c.getCodigo()==codigo) return c;
        }
        return null;
    }
    
    public double total(){
        return contas.stream().mapToDouble(c->c.getSaldo()).sum();
    }
    
    public double totalCredores(){
        return contas.stream().filter(c->!c.isDevedor()).mapToDouble(c->c.getSaldo()).sum();
    }
    
    public ArrayList<String> getExtrato(int codigo){
        return pesquisar(codigo).getTransacoes();
    }
    
    public double getSaldo(int codigo){
        return pesquisar(codigo).getSaldo();
    }
    
    public boolean depositar(int codigo, double valor){
        if(pesquisar(codigo).depositar(valor)) return true;
        return false;
    }
    
    public boolean transferir(int ori, int dest, double valor){
        if(pesquisar(ori).transferir(valor, pesquisar(dest))) return true;
        return false;
    }
    
    public boolean sacar(int codigo, double valor){
        if(pesquisar(codigo).sacar(valor)) return true;
        return false;
    }
    
    public List<Conta> devedores(){
        return contas.stream().filter(c->c.isDevedor()).collect(Collectors.toList());
    }
    
    public List<Conta> aniversariantes(){
        return contas.stream().filter(c->c.getAniversario().startsWith(DateTimeFormatter.ofPattern("dd").format(LocalDateTime.now()) + "/")).collect(Collectors.toList());
    }
    
    public int getCodigo(){
        return this.codigo;
    }
    
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    
    public ArrayList<Conta> getContas(){
        return this.contas;
    }
    
    public void setContas(ArrayList<Conta> contas){
        this.contas = contas;
    }
    
}
