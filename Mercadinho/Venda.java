import java.util.ArrayList;

public class Venda
{
    private String data; //dd/mm/yyyy
    private ArrayList<Item> itens;

    public Venda()
    {
        //
    }
    
    public double total(){
        double soma = 0;
        for(Item i:itens){
            soma+=i.total();
        }
        
        return soma;
    }
    
    public String getAno(){
        return this.data.substring(6,this.data.length());
    }
    
    public String getMesAno(){
        return this.data.substring(3,this.data.length());
    }
    
    public String getData(){
        return this.data;
    }
    
    public void setData(String data){
        this.data = data;
    }        

    public ArrayList<Item> getItens(){
        return this.itens;
    }
    
    public void setItens(ArrayList<Item> itens){
        this.itens = itens;
    }
    
    
}
