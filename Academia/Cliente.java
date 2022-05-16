
/**
 * Escreva uma descrição da classe Cliente aqui.
 * 
 * @author Ketlly 
 * @version (um número da versão ou uma data)
 */
public class Cliente extends Metrica
{
    // variáveis de instância
    String nome;
    int cpf;
    int dia;
    int mes;
    int ano;
    int telefone;
    String genero;
    Metrica metricas[]=new
            Metrica[1000];
    Metrica meta;

    /**
     * Construtor para objetos da classe Cliente
     */
    public Cliente()
    {
        
    }
    
    
    public double imcAtual()
    {
        Metrica ultima= null;
        for(int i=0;i<metricas.length; i++){
            if(metricas[i]==null){
                break;
            }
            ultima=metricas[i];
        }
        return ultima==null? -1 : ultima.imc();
    }
}

