import java.util.ArrayList;

public class Mercadinho
{
    private String nome;
    private ArrayList<Venda> vendas;


    public Mercadinho()
    {
        
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
