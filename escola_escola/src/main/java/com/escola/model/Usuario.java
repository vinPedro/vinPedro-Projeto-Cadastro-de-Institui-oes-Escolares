package com.escola.model;

import java.awt.Point;

import org.springframework.boot.context.properties.bind.Name;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class Usuario {

	@Name("Nome")
	private String nomeString;
	
	@Column(columnDefinition = "geometry(Point, 4326)", nullable = false)
	private Point coordenadaPoint;

	public String getNomeString() {
		return nomeString;
	}

	public void setNomeString(String nomeString) {
		this.nomeString = nomeString;
	}

	public Point getCoordenadaPoint() {
		return coordenadaPoint;
	}

	public void setCoordenadaPoint(Point coordenadaPoint) {
		this.coordenadaPoint = coordenadaPoint;
	}
	
	
}
