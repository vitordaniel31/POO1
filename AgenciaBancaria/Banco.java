import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.*;
import java.util.stream.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Banco
{
    private String nome;
    private ArrayList<Agencia> agencias;

    public Banco()
    {
        agencias = new ArrayList<>();
    }
    
    public double totalDinheiro(){
        return agencias.stream().mapToDouble(a->a.totalDinheiro()).sum();
    }
    
    public void renderAniversariantes(){
        agencias.stream().forEach(a->a.renderAniversariantes());
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public ArrayList<Agencia> getAgencias(){
        return this.agencias;
    }
    
    public void setAgencias(ArrayList<Agencia> agencias){
        this.agencias = agencias;
    }
    
}
