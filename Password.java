import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {
    private Pattern regex;

    public Password (String regex){
        this.regex = Pattern.compile(regex);
    }

    public void setValue(String pwd){
        Matcher m = regex.matcher(pwd);
        if(!m.matches()) {
            throw new RuntimeException("Not valid password");
        }else{
            System.out.println("Password ingresado correctamente");
        }

    }
}
