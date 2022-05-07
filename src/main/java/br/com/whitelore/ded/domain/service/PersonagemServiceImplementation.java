package br.com.whitelore.ded.domain.service;

import br.com.whitelore.ded.domain.model.Personagem;
import br.com.whitelore.ded.port.PersonagemRepository;
import br.com.whitelore.ded.port.PersonagemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * The class is an use case implementation of the inbound port.
 */
@Service
public class PersonagemServiceImplementation implements PersonagemService {

    @Autowired
    private PersonagemRepository personagemRepository;


    @Override
    public List<Personagem> getPersonagens() {
        return personagemRepository.getPersonagens();
    }

    @Override
    public Personagem getPersonagemById(Integer personagemId) {
        return personagemRepository.getPersonagemById(personagemId);
    }

    @Override
    public Personagem addPersonagem(Personagem personagem) {
        return personagemRepository.addPersonagem(personagem);
    }

    @Override
    public Personagem removePersonagem(Integer personagemId) {
        return personagemRepository.removePersonagem(personagemId);
    }
}
