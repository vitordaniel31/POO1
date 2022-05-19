import java.text.SimpleDateFormat;
import java.util.Date;
import java.io.File;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;

public class Texto03 extends JFrame
{
    public Texto03()
    {
    
    }
    
    public String e3_1()
    {   
        return ""+new Date();
    }
    
    public String e3_2(String data) throws Exception 
    {           
        return new SimpleDateFormat("EEEE, dd 'de' MMMM 'de' yyyy").format(new SimpleDateFormat("dd/MM/yyyy").parse(data));
    }
    
    public String []e3_3(String caminho)
    {           
        if(new File(caminho).exists()) return new File(caminho).list();
        return new String[]{null};

    }
    
    public String[] e3_4(String caminho)
    {           
        File pasta = new File(caminho);
        if(pasta.exists()){
            String[] files = pasta.list();
            for(int i=0; i<files.length; i++){
                if(new File(pasta.getPath() + "/" + files[i]).isDirectory()) files[i] = "[D] " + files[i];
                else files[i] = "[A] " + files[i];
            }
            
            return files;
        }
        
        return new String[]{null};

    }
    
    public boolean e3_5(String caminho)
    {           
        File arquivo = new File(caminho);
        if(arquivo.exists()){
            arquivo.delete();
            return true;
        }
        
        return false;

    }
    
    public void e3_6()
    {           
        setTitle("Exercício 6");
        setSize(300, 300);
        
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        menuBar.add(new JMenu("Arquivo"));
        menuBar.add(new JMenu("Editar"));
        
        setVisible(true);

    }
    
    public boolean e3_7(String caminho) throws Exception
    {           
        File arquivo = new File(caminho);
        if(arquivo.exists()){
            Runtime.getRuntime().exec(new String[]{caminho});
            return true;
        }
        
        return false;

    }
    
    public boolean e3_8(String caminho) throws Exception
    {           
        File arquivo = new File(caminho);
        if(arquivo.exists()){
            Runtime.getRuntime().exec(new String[]{"notepad", caminho});
            return true;
        }
        
        return false;

    }
    
    public void e3_9()
    {           
        setTitle("Exercício 9");
        setExtendedState(MAXIMIZED_BOTH);
        
        setVisible(true);

    }
    
    public String e3_10(String data1, String data2) throws Exception 
    {           
        Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(data1);
        Date date2 = new SimpleDateFormat("dd/MM/yyyy").parse(data2);
        
        if(date1.compareTo(date2)>0) return data1;
        return data2;
    }
    
    
    public String[] e3_11(String[] datas) throws Exception 
    {           
        Date[] dates = new Date[datas.length];
        for(int i=0; i<datas.length; i++){
            dates[i] = new SimpleDateFormat("dd/MM/yyyy").parse(datas[i]);
            Date k = dates[i];
            String ks = datas[i];
            int j = i-1;
            while(j>=0 && dates[j].compareTo(k)>0){
                dates[j+1] = dates[j];
                datas[j+1] = datas[j];
                j = j-1;
            }
            dates[j+1] = k;
            datas[j+1] = ks;
        }
        
        return datas;
    }
    
    public String e3_12(String data) throws Exception 
    {           
        return new SimpleDateFormat("EEEE").format(new SimpleDateFormat("dd/MM/yyyy").parse(data));
    }

}
