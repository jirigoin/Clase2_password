
public class Main {
    public static void main(String[] args) {

        Password pass = new Password("[a-zA-Z]{5,10}");
        pass.setValue("sssss");

        PasswordSimple passwordSimple = new PasswordSimple();
        passwordSimple.setValue("sd");
        //passwordSimple.setValue("aaadsasd");

        PasswordIntermedio passwordIntermedio = new PasswordIntermedio();
        passwordIntermedio.setValue("jasdjd");
       // passwordIntermedio.setValue("j23djd");
        

        PasswordFuerte passwordFuerte = new PasswordFuerte();
        passwordFuerte.setValue("8213jhasdjasdbj12231ea");
       // passwordFuerte.setValue("2");


    }
}
