import java.lang.Math;

public class Texto02
{
    public Texto02()
    {

    }

    public int[] e2_2(int x, int y)
    {
        if(x>y) return new int[]{y, x};
        return new int[]{x, y};
    }
    
    public int[] e2_3(int x, int y, int z)
    {
        if(x>y & x>z){
            if(y>z) return new int[]{x, y, z};
            return new int[]{x, z, y};
        }else if(y>x & y>z){
            if(x>z) return new int[]{y, x, z};
            return new int[]{y, z, x};
        }else if(z>x & z>y){
            if(x>y) return new int[]{z, x, y};
            return new int[]{z, y, x};
        }
        
        return new int[]{x, y, z};
    }
    
    public double e2_4(double x)
    {   
        return Math.sqrt(x);
    }
    
    public boolean e2_5(String a, String b)
    {   
        if(b.indexOf(a)>-1) return true;
        return false;
    }
    
    public String[] e2_6(String a, String b)
    {   
        if(a.compareTo(b)<0) return new String[]{a, b};
        return new String[]{b, a};
    }
    
    public String[] e2_7(String a, String b, String c)
    {   
        if(a.compareTo(b)<0 & a.compareTo(c)<0){
            if(b.compareTo(c)<0) return new String[]{a, b, c};
            return new String[]{a, c, b};
        }else if(b.compareTo(a)<0 & b.compareTo(c)<0){
            if(a.compareTo(c)<0) return new String[]{b, a, c};
            return new String[]{b, c, a};
        }else if(c.compareTo(a)<0 & c.compareTo(b)<0){
            if(a.compareTo(b)<0) return new String[]{c, a, b};
            return new String[]{c, b, a};
        }
        
        return new String[]{a, b, c};
    }
    
    public String inverter(String s){
        return s.substring(s.indexOf(' ')+1, s.length()) + ", " + s.substring(0, s.indexOf(' '));
    }
    
    public String[] e2_8(String[] nomes)
    {   
        String[] nomes_invertidos = new String[nomes.length];
        
        for(int i=0; i<nomes.length; i++){
            nomes_invertidos[i] = inverter(nomes[i]);
        }
        
        return nomes_invertidos;
    }
    
    public String[] e2_9(String[] s)
    {   
        
        for(int i=0; i<s.length; i++){
            s[i] = s[i].toUpperCase();
        }
        
        return s;
    }
    
    public String[] e2_10(String[] s)
    {   
        String[] x = new String[s.length];
        
        for(int i=0; i<s.length; i++){
            x[i] = s[i].toUpperCase();
        }
        
        return x;
    }
    
    public int[] e2_11(int[] numeros)
    {   
        int troca;
        
        for(int i=0; i<numeros.length-1; i++){
            if(numeros[i]<numeros[i+1]){
                troca = numeros[i+1];
                numeros[i+1] = numeros[i];
                numeros[i] = troca;
            }
        }
        
        return numeros;
    }
    
    public int e2_12(int[] numeros)
    {   
        int troca;
        int qtd = 0;
        
        for(int i=0; i<numeros.length-1; i++){
            if(numeros[i]<numeros[i+1]){
                troca = numeros[i+1];
                numeros[i+1] = numeros[i];
                numeros[i] = troca;
                qtd++;
            }
        }
        
        return qtd;
    }
    
    public int e2_13(String[] palavras)
    {   
        String troca;
        int qtd = 0;
        
        for(int i=0; i<palavras.length-1; i++){
            if(palavras[i].compareTo(palavras[i+1])>0){
                troca = palavras[i+1];
                palavras[i+1] = palavras[i];
                palavras[i] = troca;
                qtd++;
            }
        }
        
        return qtd;
    }
    
    public String[] e2_13b(String[] palavras)
    {   
        String troca;
        int qtd = 0;
        
        for(int i=0; i<palavras.length-1; i++){
            if(palavras[i].compareTo(palavras[i+1])>0){
                troca = palavras[i+1];
                palavras[i+1] = palavras[i];
                palavras[i] = troca;
                qtd++;
            }
        }
        
        return palavras;
    }
    
    public int[] e2_14(int[] numeros)
    {   
        while(e2_12(numeros)>0){
            numeros = e2_11(numeros);
        }
        
        return numeros;
    }
    
    public String[] e2_15(String[] palavras)
    {   
        while(e2_13(palavras)>0){
            palavras = e2_13b(palavras);
        }
        
        return palavras;
    }
    
    public String[] ordenarPalavras(String[] palavras){
        for(int i=1; i<palavras.length; i++){
            String k = palavras[i];
            int j = i-1;
            while(j>=0 && palavras[j].compareTo(k)>0){
                palavras[j+1] = palavras[j];
                j = j-1;
            }
            palavras[j+1] = k;
        }
        
        return palavras;
    }
    
    public int[] ordenarNumeros(int[] numeros){
        int j;
        for(int i=1; i<numeros.length; i++){
            int k = numeros[i];
            j = i-1;
            while(j>=0 && numeros[j]>k){
                numeros[j+1] = numeros[j];
                j = j-1;
            }
            numeros[j+1] = k;
        }
        
        return numeros;
    }
    
    public String[] e2_16(String[] nomes)
    {   
        String[] invertidos = e2_8(nomes);
        
        nomes = ordenarPalavras(invertidos);
        for(int i=0; i<nomes.length; i++){
            nomes[i] = nomes[i].substring(nomes[i].indexOf(',')+2, nomes[i].length()) + " " + nomes[i].substring(0, nomes[i].indexOf(','));
        }
        return nomes;
    }
    
    public String[] e2_17(String[] nomes)
    {   
        String[] invertidos = e2_8(nomes);
        
        return ordenarPalavras(invertidos);
    }
 

}
    