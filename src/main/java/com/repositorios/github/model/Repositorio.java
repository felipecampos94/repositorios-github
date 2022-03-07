package com.repositorios.github.model;

import java.io.Serializable;

import lombok.Data;

@Data
public class Repositorio implements Serializable{

		private static final long serialVersionUID = 1L;
		
		private Integer id;
		private String nome;

}
