package br.com.model.beans;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "reserva")
public class Reserva {

	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	private int id;
	private Date dtReserva;
	
	public Reserva() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDtReserva() {
		return dtReserva;
	}

	public void setDtReserva(Date dtReserva) {
		this.dtReserva = dtReserva;
	}

	
}
