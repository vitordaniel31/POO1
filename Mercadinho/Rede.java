import java.util.ArrayList;

public class Rede
{
    private String nome;
    private ArrayList<Mercadinho> mercados;

    public Rede()
    {
        nome = "Vitor";
    }

    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }        

    public ArrayList<Mercadinho> getMercados(){
        return this.mercados;
    }
    
    public void setMercados(ArrayList<Mercadinho> mercados){
        this.mercados = mercados;
    }
    
    public ArrayList<Mercadinho> rentabilidadeMercados(){
        ArrayList<Mercadinho> mos = this.mercados;

        int j;
        for(int i=1; i<mos.size(); i++){
            Mercadinho k = mos.get(i);
            j = i-1;
            while(j>=0 && mos.get(j).total()<k.total()){
                mos.set(j+1, mos.get(j));
                j = j-1;
            }
            mos.set(j+1, k);
        }
        
        return mos;
    }
    
    public double total(){ //valor total de vendas
        double soma = 0;
        for(Mercadinho m:mercados){
            soma+=m.total();
        }
        
        return soma;
    }
    
    public double totalMes(String mesAno){ //valor total de vendas no mês mesAno==mm/yyyy
        double soma = 0;
        for(Mercadinho m:mercados){
            soma+=m.totalMes(mesAno);
        }
        
        return soma;
    }
    
   
    
}
