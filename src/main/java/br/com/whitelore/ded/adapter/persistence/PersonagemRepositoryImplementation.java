package br.com.whitelore.ded.adapter.persistence;

import br.com.whitelore.ded.domain.model.Personagem;
import br.com.whitelore.ded.port.PersonagemRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The interface defines an output adapter which is an implementation of the outbound port. It enables the core application to communicate to external dependency such as the database.
 */
@Repository
public class PersonagemRepositoryImplementation implements PersonagemRepository {
    private static final Map<Integer, Personagem> personagemMap = new HashMap<>(0);

    @Override
    public List<Personagem> getPersonagens() {
        return new ArrayList<>(personagemMap.values());
    }

    @Override
    public Personagem getPersonagemById(Integer personagemId) {
        return personagemMap.get(personagemId);
    }

    @Override
    public Personagem addPersonagem(Personagem personagem) {
        personagemMap.put(personagem.getId(), personagem);
        return personagem;
    }

    @Override
    public Personagem removePersonagem(Integer personagemId) {
        if (personagemMap.get(personagemId) != null) {
            Personagem personagem = personagemMap.get(personagemId);
            personagemMap.remove(personagemId);
            return personagem;
        } else
            return null;
    }

}
