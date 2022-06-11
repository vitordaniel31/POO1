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
        return contas.stream().filter(c->c.getCodigo()==codigo).findFirst().get();
    }
    
    public double totalDinheiro(){
        return contas.stream().mapToDouble(c->c.getSaldo()).sum();
    }
    
    public void cobrarManutencao(){
        contas.stream().forEach(c->c.manutencao());
    }
    
    public void renderAniversariantes(){
        aniversariantes().stream().filter(c->c.getTipo().equals("Conta Poupança")).forEach(c->c.render());
    }
    
    public double totalCredores(){
        return contas.stream().filter(c->!c.isDevedor()).mapToDouble(c->c.getSaldo()).sum();
    }
    
    public List<Conta> contas(Integer[] codigos){
        return Arrays.asList(codigos).stream().map(c->pesquisar(c)).collect(Collectors.toList());
    }
    
    public double mediaSaldo(){
        return contas.stream().mapToDouble(c->c.getSaldo()).average().orElse(Double.NaN);
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
    
    public HashMap<String, List<Conta>> mapearContas(){
        HashMap<String, List<Conta>> contasDevedoras = new HashMap<String, List<Conta>>();        
        contasDevedoras.put("Devedoras", contas.stream().filter(c->c.isDevedor()).collect(Collectors.toList()));
        contasDevedoras.put("Não Devedoras", contas.stream().filter(c->!c.isDevedor()).collect(Collectors.toList()));
        return contasDevedoras;
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
