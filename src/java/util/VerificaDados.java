package util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VerificaDados {
    private String email,senha;
    public static final Pattern VALID_EMAIL_ADDRESS_REGEX = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);


    public VerificaDados(String email, String senha) {
        this.email = email;
        this.senha = senha;
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

   

   
   public boolean verificaEmail() {
       Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(email);
       return matcher.find();
   } 
   
   public boolean verificaSenha() {
       
       String[] words = email.split("@");
       
       
       String rev = new StringBuilder(words[0]).reverse().toString();
       if(rev.equals(senha))
       {
        return true;
       }
       return false;
       
   }
   
    
}
