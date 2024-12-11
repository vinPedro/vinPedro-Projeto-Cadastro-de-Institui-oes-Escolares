package com.escola.dao;

import java.awt.Point;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.escola.model.Escola;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Repository
public class EscolaDAO implements EscolaDAOInterface{
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public boolean addEscola(Escola escola) {
		entityManager.persist(escola);
		return false;
	}

	@Override
	public boolean delEscola(Long id) {
		Escola escola = recuperarEscola(id);
		
		if(escola != null) {
			entityManager.remove(escola);
			return true;
		}
		
		return false;
	}

	@Override
	public Escola recuperarEscola(Long id) {
		return entityManager.find(Escola.class, id);
	}

	@Override
	public boolean atualizarEscola(Long id, String nome, Point coordenadas) {
		Escola escola = recuperarEscola(id);
		if(escola != null) {
			escola.setNomeString(nome);
			escola.setCoordenadasPoint(coordenadas);
			entityManager.merge(escola);
			return true;
		}
		return false;
	}
	
	public List<Escola> recuperarEscolas() {
		return entityManager.createQuery("SELECT * FROM ESCOLA", Escola.class).getResultList();
	}

}
