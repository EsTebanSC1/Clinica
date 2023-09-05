class Administrativo extends Trabajador {
    private String correoElectronico;

    public Administrativo(String tituloProfesional, String nombre, String direccion,
                          String estadoCivil, String rut, String horarioTrabajo,
                          String correoElectronico) {
        super(tituloProfesional, nombre, direccion, estadoCivil, rut, horarioTrabajo);
        this.correoElectronico = correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    @Override
    public String getTipo() {
        return "Administrativo";
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }
}