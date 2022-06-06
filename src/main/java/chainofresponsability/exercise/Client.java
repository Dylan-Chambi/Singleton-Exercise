package chainofresponsability.exercise;

public class Client {
    public static void main(String[] args) {
        ManagerHandler managerHandler = new ManagerHandler();

        System.out.println("-----------------Array de mas de 50 desordenado-----------------");
        for(Persona persona : PersonaArrayExamples.personasMas50){
            System.out.println("CI: " + persona.getCi() + " Nombre: " + persona.getNombre() + " Edad: " + persona.getEdad());
        }
        System.out.println("-----------------Array de mas de 50 ordenado-----------------");
        managerHandler.criteriaHandler(PersonaArrayExamples.personasMas50);
        System.out.println("Array de tamaño: " + PersonaArrayExamples.personasMas50.length);
        System.out.println();
        for(Persona persona : PersonaArrayExamples.personasMas50){
            System.out.println("CI: " + persona.getCi() + " Nombre: " + persona.getNombre() + " Edad: " + persona.getEdad());
        }

        System.out.println("-----------------Array de mas de 20 desordenado-----------------");
        for(Persona persona : PersonaArrayExamples.personasMas20){
            System.out.println("CI: " + persona.getCi() + " Nombre: " + persona.getNombre() + " Edad: " + persona.getEdad());
        }
        System.out.println("-----------------Array de mas de 20 ordenado-----------------");
        managerHandler.criteriaHandler(PersonaArrayExamples.personasMas20);
        System.out.println("Array de tamaño: " + PersonaArrayExamples.personasMas20.length);
        System.out.println();
        for(Persona persona : PersonaArrayExamples.personasMas20){
            System.out.println("CI: " + persona.getCi() + " Nombre: " + persona.getNombre() + " Edad: " + persona.getEdad());
        }

        System.out.println("-----------------Array de menos de 20 desordenado-----------------");
        for(Persona persona : PersonaArrayExamples.personasMenos20){
            System.out.println("CI: " + persona.getCi() + " Nombre: " + persona.getNombre() + " Edad: " + persona.getEdad());
        }
        System.out.println("-----------------Array de menos de 20 ordenado-----------------");
        managerHandler.criteriaHandler(PersonaArrayExamples.personasMenos20);
        System.out.println("Array de tamaño: " + PersonaArrayExamples.personasMenos20.length);
        System.out.println();
        for(Persona persona : PersonaArrayExamples.personasMenos20){
            System.out.println("CI: " + persona.getCi() + " Nombre: " + persona.getNombre() + " Edad: " + persona.getEdad());
        }

    }
}
