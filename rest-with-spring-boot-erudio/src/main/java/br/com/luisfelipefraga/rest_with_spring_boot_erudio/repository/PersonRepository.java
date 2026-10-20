package br.com.luisfelipefraga.rest_with_spring_boot_erudio.repository;

import br.com.luisfelipefraga.rest_with_spring_boot_erudio.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {}
