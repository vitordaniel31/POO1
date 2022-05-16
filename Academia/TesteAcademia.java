
/**
 * @author Ketlly
 * @version 11/04/2022
 */
import java.util.Random;
public class TesteAcademia
{
    Random rand = new Random();
    

    public Academia montarTudo()
    {
        Academia a = criarAcademia();
        a.clientes = criarClientes(4);
        for (Cliente c: a.clientes){
            c.metricas = criarMetricas(5);
        }
        //System.out.print(a.imcAtual());
        return a;
    }

    public Metrica[] criarMetricas(int num)
    {
        Metrica[] ms = new Metrica[num];
        for (int i=0; i<ms.length; i++){
            ms[i] = new Metrica();
            ms[i].peso =50 + rand.nextInt(80); 
            ms[i].altura =0.7 + 1.8*rand.nextDouble(); // retorna um numero entre 0 e 1
        }
        return ms;
    }
    
    public Cliente[] criarClientes(int num)
    {
        Cliente[] cs = new Cliente[num];
        for (int i=0; i<cs.length; i++){
            cs[i] = new Cliente();
            cs[i].nome = "cli"+i; 
        }
        return cs;
    }
    
    public Academia criarAcademia()
    {
        Academia a1 = new Academia();
        a1.nome= "Academia UFRN";
        return a1;
    }
}
