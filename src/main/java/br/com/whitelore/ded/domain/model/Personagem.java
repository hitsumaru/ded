package br.com.whitelore.ded.domain.model;

import lombok.*;

import javax.persistence.*;


/**
 * The class defines the domain object model
 */
@Data
public class Personagem {

    private Integer id;
    private String nome;
    private Integer nivel;
    private String raca;
    private String classe;

}
