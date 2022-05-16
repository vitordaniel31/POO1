
/**
 * Escreva uma descrição da classe Metrica aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Metrica
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    double peso;
    double altura;
    double quadril;
    double biceps;
    double peito;
    int dia;
    int mes;
    int ano;

    /**
     * Construtor para objetos da classe Metrica
     */
    public Metrica()
    {
        peso= 75.4;
        altura= 182.5;
        // inicializa variáveis de instância
        
    }

    /**
     * método
     */
    public double imc()
    {
        // escreva seu código aqui
        return peso/(altura*altura);
    }
}
