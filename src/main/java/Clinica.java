import java.util.ArrayList;
import java.util.List;
class Clinica {
    private String nombre;
    private List<String> direcciones;
    private String tipo;
    private List<Medico> medicos = new ArrayList<>();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<String> getDirecciones() {
        return direcciones;
    }

    public void setDirecciones(List<String> direcciones) {
        this.direcciones = direcciones;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public List<Medico> getMedicos() {
        return medicos;
    }

    public void setMedicos(List<Medico> medicos) {
        this.medicos = medicos;
    }

    public List<Administrativo> getAdministrativos() {
        return administrativos;
    }

    public void setAdministrativos(List<Administrativo> administrativos) {
        this.administrativos = administrativos;
    }

    public void setEspecialidades(List<EspecialidadMedica> especialidades) {
        this.especialidades = especialidades;
    }

    private List<Administrativo> administrativos = new ArrayList<>();
    private List<EspecialidadMedica> especialidades = new ArrayList<>();

    public Clinica(String nombre, List<String> direcciones, String tipo) {
        this.nombre = nombre;
        this.direcciones = direcciones;
        this.tipo = tipo;
    }

    public void agregarMedico(Medico medico) {
        medicos.add(medico);
    }

    public void agregarAdministrativo(Administrativo administrativo) {
        administrativos.add(administrativo);
    }

    public void agregarEspecialidad(EspecialidadMedica especialidad) {
        especialidades.add(especialidad);
    }

    public List<Medico> obtenerMedicos() {
        return medicos;
    }

    public List<Administrativo> obtenerAdministrativos() {
        return administrativos;
    }

    public List<EspecialidadMedica> getEspecialidades() {
        return especialidades;
    }

    public EspecialidadMedica getEspecialidadPorNombre(String nombreEspecialidad) {
        for (EspecialidadMedica especialidad : especialidades) {
            if (especialidad.getNombre().equals(nombreEspecialidad)) {
                return especialidad;
            }
        }
        return null;
    }

    public Administrativo obtenerAdministrativoEspecialidad(String nombreEspecialidad, String rut) {
        return null;
    }

    public List<Medico> obtenerMedicosEspecialidad(String nombreEspecialidad) {
        return null;
    }
}