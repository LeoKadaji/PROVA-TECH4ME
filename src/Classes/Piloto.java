package Classes;
public class Piloto extends Pessoa{

    protected String Breve;
    protected Aeronave aeronave;

    public Aeronave getAeronave() {
        return aeronave;
    }

    public void setAeronave(Aeronave aeronave) {
        this.aeronave = aeronave;
    }

    @Override
    public String toString() {
        String texto = " ";
        texto += "\nNome : " + Nome;
        texto += "\nCPF : " + Cpf;
        texto += "\nBreve: " + Breve;
        return texto;

    }

    public String getBreve() {
        return Breve;
    }

    public void setBreve(String breve) {
        Breve = breve;
    }

    
}
