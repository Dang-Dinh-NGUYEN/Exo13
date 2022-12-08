public class Etoile extends ChaineFactory implements Expreg{
    private Expreg exp;

    public Etoile (Expreg exp){
        this.exp = exp;
    }

    @Override
    public String toString() {
        return "(" + exp + ")*";
    }
}
