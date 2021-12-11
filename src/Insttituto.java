import java.util.HashSet;
import java.util.Set;

public class Insttituto {
    private Set<OfertaAcademica> ofertasAcademicas;

    public Insttituto() {
        this.ofertasAcademicas = new HashSet<>();
    }

    public void agregarOfertaAcademica(OfertaAcademica ofertaAcademica) {
        this.ofertasAcademicas.add(ofertaAcademica);
    }



    public void generarInforme() {
        for (OfertaAcademica oferta: this.ofertasAcademicas) {
            System.out.println(oferta);
        }
    }

}
