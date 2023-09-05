import java.util.ArrayList;
import java.util.List;
class EspecialidadMedica {
    private String nombre;
    private String ubicacionGeografica;
    private List<Medico> medicos = new ArrayList<>();

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacionGeografica() {
        return ubicacionGeografica;
    }

    public void setUbicacionGeografica(String ubicacionGeografica) {
        this.ubicacionGeografica = ubicacionGeografica;
    }

    public void setMedicos(List<Medico> medicos) {
        this.medicos = medicos;
    }

    public EspecialidadMedica(String nombre, String ubicacionGeografica) {
        this.nombre = nombre;
        this.ubicacionGeografica = ubicacionGeografica;
    }

    public void agregarMedico(Medico medico) {
        medicos.add(medico);
    }

    public List<Medico> getMedicos() {
        return medicos;
    }

    public String getNombre() {
        return nombre;
    }
}