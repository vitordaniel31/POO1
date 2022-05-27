import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Mercadinho
{
    private String nome;
    private ArrayList<Venda> vendas;


    public Mercadinho()
    {
        
    }
    
    public HashMap relatorioVendasPorAno(){
        HashMap<String, Double> vendasAno = new HashMap<String, Double>();
                
        for(Venda v:vendas){
            if(vendasAno.get(v.getAno())==null){
                vendasAno.put(v.getAno(), totalAno(v.getAno())); 
            }
        }

        return vendasAno;
    }
    
    public String melhorAno(){
        HashMap<String, Double> relatorios = relatorioVendasPorAno();
        double maior = 0;
        String ano = "";
        for(String chave : relatorios.keySet()){
            if(relatorios.get(chave)>maior) maior = relatorios.get(chave);
        }

        return ano;
    }
    
    public double totalAno(String ano){ //valor total de vendas no mês mesAno==mm/yyyy
        double soma = 0;
        for(Venda v:vendas){
            if(ano.equals(v.getAno()))
                soma+=v.total();
        }
        
        return soma;
    }
    
    public double total(){ //valor total de vendas
        double soma = 0;
        for(Venda v:vendas){
            soma+=v.total();
        }
        
        return soma;
    }
    
    public double totalMes(String mesAno){ //valor total de vendas no mês mesAno==mm/yyyy
        double soma = 0;
        for(Venda v:vendas){
            if(mesAno.equals(v.getMesAno()))
                soma+=v.total();
        }
        
        return soma;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public ArrayList<Venda> getVendas(){
        return this.vendas;
    }
    
    public void setVendas(ArrayList<Venda> vendas){
        this.vendas = vendas;
    }
    
    
}
