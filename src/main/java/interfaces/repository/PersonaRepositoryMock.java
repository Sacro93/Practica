package interfaces.repository;

import interfaces.Persona;

public class PersonaRepositoryMock implements PersonaRepository {

    private static Persona jorge = new Persona(120, "Jorge");
    private static Persona jose = new Persona(80, "Jose");

    @Override
    public Persona findByName(String name) {
        return null;
    }

    @Override
    public void save(Persona persona) {

    }
}
