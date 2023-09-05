import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GestorClinica {
        private Clinica clinica;
        private Scanner scanner;

    public GestorClinica() {
        this.clinica = new Clinica("Mi Clínica", new ArrayList<>(), "Privada");
        this.scanner = new Scanner(System.in);
    }

    public void mostrarMenu() {
        int opcion;
        do {
            System.out.println("=== Menú de Gestión de Clínica ===");
            System.out.println("1. Obtener todos los médicos de la clínica");
            System.out.println("2. Obtener todos los administrativos de la clínica");
            System.out.println("3. Obtener médicos de una especialidad médica");
            System.out.println("4. Obtener administrativo de una especialidad médica");
            System.out.println("5. Agregar un médico");
            System.out.println("6. Agregar un administrativo");
            System.out.println("7. Salir");
            System.out.print("Ingrese la opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    List<Medico> medicosClinica = clinica.obtenerMedicos();
                    mostrarMedicos(medicosClinica);
                    break;
                case 2:
                    List<Administrativo> administrativosClinica = clinica.obtenerAdministrativos();
                    mostrarAdministrativos(administrativosClinica);
                    break;
                case 3:
                    System.out.print("Ingrese el nombre de la especialidad médica: ");
                    scanner.nextLine(); // Consumir el salto de línea
                    String nombreEspecialidad = scanner.nextLine();
                    List<Medico> medicosEspecialidad = clinica.obtenerMedicosEspecialidad(nombreEspecialidad);
                    mostrarMedicos(medicosEspecialidad);
                    break;
                case 4:
                    System.out.print("Ingrese el nombre de la especialidad médica: ");
                    scanner.nextLine(); // Consumir el salto de línea
                    nombreEspecialidad = scanner.nextLine();
                    System.out.print("Ingrese el rut del administrativo: ");
                    String rutAdministrativo = scanner.nextLine();
                    Administrativo administrativoEspecialidad = clinica.obtenerAdministrativoEspecialidad(nombreEspecialidad, rutAdministrativo);
                    mostrarAdministrativo(administrativoEspecialidad);
                    break;
                case 5:
                    agregarMedico();
                    break;
                case 6:
                    agregarAdministrativo();
                    break;
                case 7:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
                    break;
            }
        } while (opcion != 7);
    }

    private void agregarMedico() {
        System.out.println("Ingrese los datos del médico:");

        System.out.print("Título Profesional: ");
        String tituloProfesional = scanner.nextLine();
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Dirección: ");
        String direccion = scanner.nextLine();
        System.out.print("Estado Civil: ");
        String estadoCivil = scanner.nextLine();
        System.out.print("Rut: ");
        String rut = scanner.nextLine();
        System.out.print("Horario de Trabajo: ");
        String horarioTrabajo = scanner.nextLine();
        System.out.print("Especialización: ");
        String especializacion = scanner.nextLine();
        System.out.print("Horario de Atención: ");
        String horarioAtencion = scanner.nextLine();
        System.out.print("Pacientes Asignados (separados por comas): ");
        String pacientesStr = scanner.nextLine();
        List<String> pacientesAsignados = new ArrayList<>();

        System.out.print("Nombre de la Especialidad Médica a la que está vinculado: ");
        String nombreEspecialidad = scanner.nextLine();
        EspecialidadMedica especialidad = clinica.getEspecialidadPorNombre(nombreEspecialidad);



        Medico nuevoMedico = new Medico(tituloProfesional, nombre, direccion, estadoCivil, rut,
                horarioTrabajo, especializacion, horarioAtencion, pacientesAsignados, especialidad);
        clinica.agregarMedico(nuevoMedico);
        System.out.println("Médico agregado con éxito.");
    }

    private void agregarAdministrativo() {
        System.out.println("Ingrese los datos del administrativo:");

        System.out.print("Título Profesional: ");
        String tituloProfesional = scanner.nextLine();
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Dirección: ");
        String direccion = scanner.nextLine();
        System.out.print("Estado Civil: ");
        String estadoCivil = scanner.nextLine();
        System.out.print("Rut: ");
        String rut = scanner.nextLine();
        System.out.print("Horario de Trabajo: ");
        String horarioTrabajo = scanner.nextLine();
        System.out.print("Correo Electrónico: ");
        String correoElectronico = scanner.nextLine();

        Administrativo nuevoAdministrativo = new Administrativo(tituloProfesional, nombre, direccion, estadoCivil, rut,
                horarioTrabajo, correoElectronico);
        clinica.agregarAdministrativo(nuevoAdministrativo);
        System.out.println("Administrativo agregado con éxito.");
    }

    private void mostrarMedicos(List<Medico> medicos) {
        System.out.println("=== Médicos ===");
        for (Medico medico : medicos) {
            System.out.println("- Nombre: " + medico.getNombre() + ", Especialización: " + medico.getEspecializacion());
        }
        System.out.println("================");
    }
    private void mostrarAdministrativos(List<Administrativo> administrativos) {
        System.out.println("=== Administrativos ===");
        for (Administrativo administrativo : administrativos) {
            System.out.println("- Nombre: " + administrativo.getNombre() + ", Correo Electrónico: " + administrativo.getCorreoElectronico());
        }
        System.out.println("=======================");
    }

    private void mostrarAdministrativo(Administrativo administrativo) {
        if (administrativo != null) {
            System.out.println("=== Administrativo Encontrado ===");
            System.out.println("- Nombre: " + administrativo.getNombre() + ", Correo Electrónico: " + administrativo.getCorreoElectronico());
            System.out.println("===============================");
        } else {
            System.out.println("No se encontró el administrativo en esa especialidad.");
        }
    }
}
