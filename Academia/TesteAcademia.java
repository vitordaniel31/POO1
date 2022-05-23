import java.util.Random;
import java.util.ArrayList;

public class TesteAcademia
{
    Random rand = new Random();
    
    public Academia montarTudo()
    {
        Academia a = criarAcademia();
        a.setClientes(criarClientes(4));
        for (Cliente c: a.getClientes()){
            c.setMetricas(criarMetricas(5));
            c.setMeta(criarMetricas(1).get(0));
        }
        return a;
    }

    public ArrayList<Metrica> criarMetricas(int num)
    {
        ArrayList<Metrica> ms = new ArrayList<>();
        
        for (int i=0; i<num; i++){
            Metrica metrica = new Metrica();
            metrica.setPeso(50 + rand.nextInt(80)); 
            metrica.setAltura(0.3 + 1.8*rand.nextDouble()); 
            ms.add(metrica);
        }
        return ms;
    }
    
    public ArrayList<Cliente> criarClientes(int num)
    {
        ArrayList<Cliente> cs = new ArrayList<>();
        for (int i=0; i<num; i++){
            Cliente cliente = new Cliente();
            cliente.setNome("Cliente "+(i+1)); 
            cliente.setCpf("00000000"+(i+1)); 
            cs.add(cliente);
        }
        return cs;
    }
    
    public Academia criarAcademia()
    {
        Academia a1 = new Academia();
        a1.setNome("Academia UFRN");
        return a1;
    }
}
