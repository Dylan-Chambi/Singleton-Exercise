package chainofresponsability.exercise;


public interface IHandler {
    void setNext(IHandler handler);
    void criteriaHandler(Persona[] personaArray);
    IHandler next();
}
