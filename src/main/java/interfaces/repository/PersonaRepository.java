package interfaces.repository;

import interfaces.Persona;

public interface PersonaRepository {
    Persona findByName(String name);

    void save(Persona persona);
}
