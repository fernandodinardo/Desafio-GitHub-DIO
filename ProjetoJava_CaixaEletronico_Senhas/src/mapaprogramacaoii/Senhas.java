package mapaprogramacaoii;

/**
 *
 * @author fdinardo
 */
public class Senhas {

    private String tiposenha;
    private int numerosenha;

    public Senhas(String tiposenha, int numerosenha) {
        this.tiposenha = tiposenha;
        this.numerosenha = numerosenha;
    }

    public Senhas() {
        this.tiposenha = "";
        this.numerosenha = 0;
    }

    public String getTiposenha() {
        return tiposenha;
    }

    public void setTiposenha(String tiposenha) {
        this.tiposenha = tiposenha;
    }

    public int getNumerosenha() {
        return numerosenha;
    }

    public void setNumerosenha(int numerosenha) {
        this.numerosenha = numerosenha;
    }

    @Override
    public String toString() {
        return "Senhas{" + "tiposenha=" + tiposenha + ", numerosenha=" + numerosenha + '}';
    }

}
