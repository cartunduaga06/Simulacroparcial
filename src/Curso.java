public class Curso extends  OfertaAcademica{

    private int cargaHorariaMensua;
    private int mesesDuracion;
    private double valorHora;

    public Curso(String nombre, String descripcion, int cargaHorariaMensua, int mesesDuracion, double valorHora) {
        super(nombre, descripcion);
        this.cargaHorariaMensua = cargaHorariaMensua;
        this.mesesDuracion = mesesDuracion;
        this.valorHora = valorHora;
    }



    @Override
    public double calcularPrecio() {
        return this.cargaHorariaMensua * this.valorHora * this.mesesDuracion;
    }

    @Override
    public String toString() {
        return super.getNombre()  +" "+ super.getDescripcion() + " " + calcularPrecio();
    }
}
