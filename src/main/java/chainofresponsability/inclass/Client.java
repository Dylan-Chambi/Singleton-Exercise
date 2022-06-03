package chainofresponsability.inclass;


public class Client {
    public static void main(String []args){
        Persona persona1 = new Persona();
        persona1
                .setNombre("Carlos")
                .setHizoPagoAlBanco(true)
                .setTieneCertificadoNacimiento(true)
                .setTieneFichaAtencion(true);

        ManagerHandler managerHandler= new ManagerHandler();
        managerHandler.criteriaHandler(persona1);
    }
}
