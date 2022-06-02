package br.com.magrinelli.catequese.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

import org.springframework.lang.NonNull;

import br.com.magrinelli.catequese.enumeration.TypeOfPersonEnum;
import lombok.Data;

@Data
@Entity(name = "person")
public class Person {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "person_sequence")
	@SequenceGenerator(name = "person_sequence", sequenceName = "person_seq")
	private Long id;
	@NonNull
	private String name;
	@NonNull
	private LocalDate birthady;
	@ManyToOne
	private Person father;
	@ManyToOne
	private Person mother;
	private String civilState;
	@NonNull
	@OneToOne
	private Address edress;
	@NonNull
	private String phoneNumber;
	@NonNull
	private TypeOfPersonEnum typeOfPerson;
}
