public class Symbole extends ChaineFactory implements ExpregBase{
    private Character symbole;

    public Symbole (char symbole){
        this.symbole = symbole;
    }

    public String toString(){
        return "" + symbole;
    }
}
