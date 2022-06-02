import java.util.Random;
import java.util.ArrayList;
import java.time.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class AgenciaTeste
{
    Random random = new Random();
    
    public Agencia montarTudo()
    {
        Agencia a = criarAgencia();
        a.setContas(criarContas(5));
        return a;
    }
    
    public ArrayList<Conta> criarContas(int num)
    {
        ArrayList<Conta> cs = new ArrayList<>();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        for (int i=0; i<num; i++){
            Conta conta = new Conta(); 
            conta.setCodigo(i+1);
            conta.setTipo("Conta Corrente");
            conta.depositar(random.nextInt(10000));
            conta.setLimite(conta.getSaldo()*0.05);
            conta.setAniversario(DateTimeFormatter.ofPattern("dd/MM/yyyy").format(LocalDateTime.now()));
            cs.add(conta);
        }
        return cs;
    }
    
    public Agencia criarAgencia()
    {
        Agencia a1 = new Agencia();
        a1.setCodigo(1);
        return a1;
    }
}
