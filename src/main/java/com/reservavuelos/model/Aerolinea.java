package com.reservavuelos.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "aerolinea")
public class Aerolinea {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private long idaerolinea;
	private String nombre;
	private String sucursal;

	public long getIdaerolinea() {
		return idaerolinea;
	}

	public void setIdaerolinea(long idaerolinea) {
		this.idaerolinea = idaerolinea;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getSucursal() {
		return sucursal;
	}

	public void setSucursal(String sucursal) {
		this.sucursal = sucursal;
	}

	@Override
	public String toString() {
		return "Aerolinea [idaerolinea=" + idaerolinea + ", nombre=" + nombre + ", sucursal=" + sucursal + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (idaerolinea ^ (idaerolinea >>> 32));
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((sucursal == null) ? 0 : sucursal.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aerolinea other = (Aerolinea) obj;
		if (idaerolinea != other.idaerolinea)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (sucursal == null) {
			if (other.sucursal != null)
				return false;
		} else if (!sucursal.equals(other.sucursal))
			return false;
		return true;
	}
	
	
	
	
	
	
	
	
}
