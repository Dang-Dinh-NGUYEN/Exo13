public class ChaineFactory{

    public static Expreg creeChaine(String string){
        if(string.isEmpty()) return (new Epsilon());
        if(string.length() == 1) return (new Symbole(string.charAt(0)));
        Concat c = (new Concat(new Symbole(string.charAt(string.length()-2)), new Symbole(string.charAt(string.length()-1))));
        if(string.length() > 2)
            for(int i = string.length() - 3; i >= 0; i--){
                 c = new Concat(new Symbole(string.charAt(i)),c);
            }
        return c;
    }
}
