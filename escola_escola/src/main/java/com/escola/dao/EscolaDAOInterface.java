package com.escola.dao;

import java.awt.Point;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.escola.model.Escola;

@Repository
public interface EscolaDAOInterface {
	
	public boolean addEscola(Escola escola);
	
	public boolean delEscola(Long id);
	
	public Escola recuperarEscola(Long id);
	
	public boolean atualizarEscola(Long id, String nome, Point coordenadas);
	
	public List<Escola> recuperarEscolas();

}
