package com.reservavuelos.model;

import java.sql.Time;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "vuelo")
public class Vuelo {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private long idvuelo;
	
	private String destino;
	private Date fecha;
	private Time hora;
	private int monto;
	
	@ManyToOne
	@JoinColumn(name="idusuario")
	private Usuario usuario;
	
	@ManyToOne
	@JoinColumn(name="idaerolinea")
	private Aerolinea aerolinea;

	public long getIdvuelo() {
		return idvuelo;
	}

	public void setIdvuelo(long idvuelo) {
		this.idvuelo = idvuelo;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Time getHora() {
		return hora;
	}

	public void setHora(Time hora) {
		this.hora = hora;
	}

	public int getMonto() {
		return monto;
	}

	public void setMonto(int monto) {
		this.monto = monto;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Aerolinea getAerolinea() {
		return aerolinea;
	}

	public void setAerolinea(Aerolinea aerolinea) {
		this.aerolinea = aerolinea;
	}


	
	
	
	
	
	
}
