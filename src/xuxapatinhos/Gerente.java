package xuxapatinhos;
public class Gerente {
    public Interface umaI;
    public Patinhos pato;
    
    public void faca(){
        int n = this.umaI.leiaValor();
        this.umaI.mostreIda(n);
        this.umaI.decidirContinuacao();
        this.umaI.mostreVolta(n);
    }    
    
    Gerente(){
        this.umaI =  new Interface();
        this.pato = new Patinhos();
    }
    
}
