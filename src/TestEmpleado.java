public class TestEmpleado {
    public static void main(String[] args) {
        Empleado g = new Gerente("Ana", 2500, "Administración", 500);
        Empleado d = new Desarrollador("Carlos", 1800, "Informatica", "Java");

        System.out.println("Gerente:");
        g.mostrarInfo();
        System.out.println("--------------------------");

        System.out.println("Desarrollador");
        d.mostrarInfo();
    }
}
