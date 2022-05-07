package br.com.whitelore.ded.adapter.rest;

import br.com.whitelore.ded.domain.model.Personagem;
import br.com.whitelore.ded.port.PersonagemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * The class defines a REST controller which is a primary adapter and invokes the inbound port of the application.
 */
@RestController
@RequestMapping("/api/v1/personagens")
public class PersonagemController {

    private final PersonagemService personagemService;

    @Autowired
    public PersonagemController(PersonagemService personagemService) {
        this.personagemService = personagemService;
    }

    @GetMapping
    public ResponseEntity<List<Personagem>> getPersonagens() {
        return new ResponseEntity<>(personagemService.getPersonagens(), HttpStatus.OK);
    }

    @GetMapping("/{personagemId}")
    public ResponseEntity<Personagem> getPersonagemById(@PathVariable Integer personagemId) {
        return new ResponseEntity<>(personagemService.getPersonagemById(personagemId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Personagem> addPersonagem(@RequestBody Personagem personagem) {
        return new ResponseEntity<>(personagemService.addPersonagem(personagem), HttpStatus.CREATED);
    }

    @DeleteMapping("/{personagemId}")
    public ResponseEntity<Personagem> removePersonagem(@PathVariable Integer personagemId) {
        return new ResponseEntity<>(personagemService.removePersonagem(personagemId), HttpStatus.OK);
    }
}
