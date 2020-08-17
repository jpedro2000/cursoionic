package com.joaopedro.cursoionic;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.joaopedro.cursoionic.domain.Categoria;
import com.joaopedro.cursoionic.repositories.CategoriaRepository;


@SpringBootApplication
public class CursoionicApplication implements CommandLineRunner{
	
	@Autowired
	private CategoriaRepository categoriaRepository;

	public static void main(String[] args) {
		SpringApplication.run(CursoionicApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Categoria cat1 = new Categoria(null, "informatica");
		Categoria cat2 = new Categoria(null, "escritorio"); 
		
		categoriaRepository.saveAll(Arrays.asList(cat1, cat2));
	}
	
	

}
