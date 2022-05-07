package br.com.whitelore.ded.port;

import br.com.whitelore.ded.domain.model.Personagem;

import java.util.List;

/**
 * The repository interface is an outbound port that enables communication from the core application to a database
 */
public interface PersonagemRepository {

    List<Personagem> getPersonagens();

    Personagem getPersonagemById(Integer personagemId);

    Personagem addPersonagem(Personagem personagem);

    Personagem removePersonagem(Integer personagemId);
}
