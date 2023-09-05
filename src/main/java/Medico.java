import java.util.List;
class Medico extends Trabajador {
    private String especializacion;
    private String horarioAtencion;
    private List<String> pacientesAsignados;
    private EspecialidadMedica especialidad;
    private List<String> areasExperiencia;

    public String getEspecializacion() {
        return especializacion;
    }

    public void setEspecializacion(String especializacion) {
        this.especializacion = especializacion;
    }

    public String getHorarioAtencion() {
        return horarioAtencion;
    }

    public void setHorarioAtencion(String horarioAtencion) {
        this.horarioAtencion = horarioAtencion;
    }

    public List<String> getPacientesAsignados() {
        return pacientesAsignados;
    }

    public void setPacientesAsignados(List<String> pacientesAsignados) {
        this.pacientesAsignados = pacientesAsignados;
    }

    public EspecialidadMedica getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(EspecialidadMedica especialidad) {
        this.especialidad = especialidad;
    }

    public List<String> getAreasExperiencia() {
        return areasExperiencia;
    }

    public void setAreasExperiencia(List<String> areasExperiencia) {
        this.areasExperiencia = areasExperiencia;
    }

    public Medico(String tituloProfesional, String nombre, String direccion,
                  String estadoCivil, String rut, String horarioTrabajo,
                  String especializacion, String horarioAtencion,
                  List<String> pacientesAsignados, EspecialidadMedica especialidad) {
        super(tituloProfesional, nombre, direccion, estadoCivil, rut, horarioTrabajo);
        this.especializacion = especializacion;
        this.horarioAtencion = horarioAtencion;
        this.pacientesAsignados = pacientesAsignados;
        this.especialidad = especialidad;
        this.areasExperiencia = areasExperiencia;
    }


    public String getTipo() {
        return "Médico";
    }
}