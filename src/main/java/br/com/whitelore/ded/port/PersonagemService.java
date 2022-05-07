package br.com.whitelore.ded.port;

import br.com.whitelore.ded.domain.model.Personagem;

import java.util.List;

/**
 * The interface is an inbound port provides the flow and the application functionality to the outside
 */
public interface PersonagemService {

    List<Personagem> getPersonagens();

    Personagem getPersonagemById(Integer personagemId);

    Personagem addPersonagem(Personagem personagem);

    Personagem removePersonagem(Integer personagemId);
}
