/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.File; 
import java.io.FileNotFoundException; 

/**
 *
 * @author nkdz
 */
public class VerificaHoroscopo {
    
    public String verificaSigno(String data) {

          String[] aux = data.split("-");
                  
          //String.valueOf(Integer.parseInt(aux[1])) RETORNA 2
          //data retorna 2021-03-25 = que é a informação do input
          //String.valueOf(date) Retorna NADA
          //aux Retorna 2021-03-25
          
          //aux[0] = ANO Integer.parseInt(aux[0])
          //aux[1] = MES Integer.parseInt(aux[1])   
          //aux[2] = DIA Integer.parseInt(aux[2])
          
        if((Integer.parseInt(aux[1]) == 3 && Integer.parseInt(aux[2]) >= 21) || (Integer.parseInt(aux[1]) == 4 && Integer.parseInt(aux[2]) <= 20))
            return "aries";
        else if((Integer.parseInt(aux[1]) == 4 && Integer.parseInt(aux[2]) >= 21) || (Integer.parseInt(aux[1]) == 5 && Integer.parseInt(aux[2]) <= 20))
            return "touro";
        else if((Integer.parseInt(aux[1]) == 5 && Integer.parseInt(aux[2]) >= 21) || (Integer.parseInt(aux[1]) == 6 && Integer.parseInt(aux[2]) <= 20))
            return "gemeos";
        else if((Integer.parseInt(aux[1]) == 6 && Integer.parseInt(aux[2]) >= 21) || (Integer.parseInt(aux[1]) == 7 && Integer.parseInt(aux[2]) <= 22))
            return "cancer";
        else if((Integer.parseInt(aux[1]) == 7 && Integer.parseInt(aux[2]) >= 23) || (Integer.parseInt(aux[1]) == 8 && Integer.parseInt(aux[2]) <= 22))
            return "leao";
        else if((Integer.parseInt(aux[1]) == 8 && Integer.parseInt(aux[2]) >= 23) || (Integer.parseInt(aux[1]) == 9 && Integer.parseInt(aux[2]) <= 22))
            return "virgem";
        else if((Integer.parseInt(aux[1]) == 9 && Integer.parseInt(aux[2]) >= 23) || (Integer.parseInt(aux[1]) == 10 && Integer.parseInt(aux[2]) <= 22))
            return "libra";
        else if((Integer.parseInt(aux[1]) == 10 && Integer.parseInt(aux[2]) >= 23) || (Integer.parseInt(aux[1]) == 11 && Integer.parseInt(aux[2]) <= 21))
            return "escorpiao";
        else if((Integer.parseInt(aux[1]) == 11 && Integer.parseInt(aux[2]) >= 22) || (Integer.parseInt(aux[1]) == 12 && Integer.parseInt(aux[2]) <= 21))
            return "sagitario";
        else if((Integer.parseInt(aux[1]) == 12 && Integer.parseInt(aux[2]) >= 22) || (Integer.parseInt(aux[1]) == 1 && Integer.parseInt(aux[2]) <= 20))
            return "capricornio";
        else if((Integer.parseInt(aux[1]) == 1 && Integer.parseInt(aux[2]) >= 21) || (Integer.parseInt(aux[1]) == 2 && Integer.parseInt(aux[2]) <= 18))
            return "aquario";
        else if((Integer.parseInt(aux[1]) == 2 && Integer.parseInt(aux[2]) >= 19) || (Integer.parseInt(aux[1]) == 3 && Integer.parseInt(aux[2]) <= 20))
            return "peixes";
        else
            return "NÃO ACHOU O SIGNO";
    }
    
    public String verificaMensagem(String signo) {
        
        try{
            File file = new File("C:\\Users\\nkdz\\Desktop\\Horoscopo\\src\\java\\util\\horoscopo.txt");
            BufferedReader br = new BufferedReader(new FileReader(file)); 
            
            
            String st = br.readLine();
            String aux = "";
            
            while (st != null) {
                System.out.println(st);
                String[] pedaço = st.split("#");
                if(pedaço[0].equals(signo))
                    aux = pedaço[2];
                st = br.readLine();
            }
            
            return aux;
        } catch (FileNotFoundException fnfe) {
        } catch (IOException ioe) {
            System.err.println(ioe);
        }
        return " NÃO ACHEI";
    }
    
}
