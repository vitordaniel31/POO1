import java.util.Random;
import java.util.ArrayList;
import java.time.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class AgenciaTeste
{
    Random random = new Random();
    
    public Banco montarTudo()
    {
        Banco b = criarBanco();
        b.setAgencias(criarAgencias(2));
        return b;
    }
    
    public ArrayList<Conta> criarContas(int num)
    {
        ArrayList<Conta> cs = new ArrayList<>();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        for (int i=0; i<num; i++){
            Conta conta = new Conta(); 
            conta.setCodigo(i+1);
            if(i%2==0){
                conta.setTipo("Conta Corrente");
                conta.setPorc_rendimento(0);
            }
            else{
                conta.setTipo("Conta Poupança"); 
                conta.setPorc_rendimento(random.nextDouble());
            }
            conta.depositar(random.nextInt(10000));
            conta.setLimite(conta.getSaldo()*0.05);
            conta.setTaxa_manutencao(random.nextInt(100)+10);
            conta.setAniversario(DateTimeFormatter.ofPattern("dd/MM/yyyy").format(LocalDateTime.now()));
            cs.add(conta);
        }
        return cs;
    }
    
    public ArrayList<Agencia> criarAgencias(int num)
    {
        ArrayList<Agencia> as = new ArrayList<>();
        for (int i=0; i<num; i++){
            Agencia agencia = new Agencia(); 
            agencia.setCodigo(i+1);
            agencia.setContas(criarContas(5));
            as.add(agencia);
        }
        return as;
    }
    
    public Banco criarBanco()
    {
        Banco b1 = new Banco();
        b1.setNome("Banco");
        return b1;
    }
}
