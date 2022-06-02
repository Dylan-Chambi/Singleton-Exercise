package mediator.exercise;

public class Client {
    public static void main (String []args){
        Skype skypeUPB = new Skype();

        PersonaQA personaQA1 = new PersonaQA(skypeUPB);
        personaQA1.setGrado("S").setCi("123456789").setName("JuanQA");
        PersonaQA personaQA2 = new PersonaQA(skypeUPB);
        personaQA2.setGrado("C").setCi("987654321").setName("PedroQA");
        PersonaQA personaQA3 = new PersonaQA(skypeUPB);
        personaQA3.setGrado("A").setCi("111111111").setName("JorgeQA");

        PersonaDEV personaDEV1 = new PersonaDEV(skypeUPB);
        personaDEV1.setLenguaje("Java").setCi("222222222").setName("CarlosDEV");
        PersonaDEV personaDEV2 = new PersonaDEV(skypeUPB);
        personaDEV2.setLenguaje("TypeScript").setCi("333333333").setName("JuanDEV");
        PersonaDEV personaDEV3 = new PersonaDEV(skypeUPB);
        personaDEV3.setLenguaje("Brainfuck").setLenguaje("Java").setCi("444444444").setName("PedroDEV");

        PersonaSM personaSM1 = new PersonaSM(skypeUPB);
        personaSM1.setCertificaciones(new String[]{"AWS", "Scrum"}).setCi("555555555").setName("JorgeSM");
        PersonaSM personaSM2 = new PersonaSM(skypeUPB);
        personaSM2.setCertificaciones(new String[]{"CCNA", "Javacript"}).setCi("666666666").setName("CarlosSM");
        PersonaSM personaSM3 = new PersonaSM(skypeUPB);
        personaSM3.setCertificaciones(new String[]{"Prolog", "Excel"}).setCi("777777777").setName("JuanSM");

        PersonaQA personaRepetida = new PersonaQA(skypeUPB);
        personaRepetida.setGrado("B").setCi("123456789").setName("HernestoQA");

        skypeUPB
                .addPersonaToChat(personaQA1)
                .addPersonaToChat(personaQA2)
                .addPersonaToChat(personaQA3)
                .addPersonaToChat(personaDEV1)
                .addPersonaToChat(personaDEV2)
                .addPersonaToChat(personaDEV3)
                .addPersonaToChat(personaSM1)
                .addPersonaToChat(personaSM2)
                .addPersonaToChat(personaSM3)
                .addPersonaToChat(personaRepetida);

        personaQA1.send("Hola a todos soy JuanQA");
        personaDEV3.send("Hola a todos soy PedroDEV");
        personaSM2.send("Hola a todos soy CarlosSM");


    }

}
