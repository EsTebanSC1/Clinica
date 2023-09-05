abstract class Trabajador {
    protected String tituloProfesional;
    protected String nombre;
    protected String direccion;
    protected String estadoCivil;
    protected String rut;

    public String getTituloProfesional() {
        return tituloProfesional;
    }

    public void setTituloProfesional(String tituloProfesional) {
        this.tituloProfesional = tituloProfesional;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getHorarioTrabajo() {
        return horarioTrabajo;
    }

    public void setHorarioTrabajo(String horarioTrabajo) {
        this.horarioTrabajo = horarioTrabajo;
    }

    protected String horarioTrabajo;

    public Trabajador(String tituloProfesional, String nombre, String direccion,
                      String estadoCivil, String rut, String horarioTrabajo) {
        this.tituloProfesional = tituloProfesional;
        this.nombre = nombre;
        this.direccion = direccion;
        this.estadoCivil = estadoCivil;
        this.rut = rut;
        this.horarioTrabajo = horarioTrabajo;
    }

    public abstract String getTipo();
}