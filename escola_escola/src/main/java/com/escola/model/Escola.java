package com.escola.model;

import java.awt.Point;
import org.springframework.boot.context.properties.bind.Name;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Escola {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idLong;
	
	@Name("Nome_Escola")
	private String nomeString;
	
	@Column(columnDefinition = "geometry(Point, 4326)", nullable = false)
	private Point coordenadasPoint;

	public Long getIdLong() {
		return idLong;
	}

	public void setIdLong(Long idLong) {
		this.idLong = idLong;
	}

	public String getNomeString() {
		return nomeString;
	}

	public void setNomeString(String nomeString) {
		this.nomeString = nomeString;
	}

	public Point getCoordenadasPoint() {
		return coordenadasPoint;
	}

	public void setCoordenadasPoint(Point coordenadasPoint) {
		this.coordenadasPoint = coordenadasPoint;
	}
	
	
}
