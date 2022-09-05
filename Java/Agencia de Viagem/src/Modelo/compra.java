package Modelo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class compra{
	
private int id_compra;
private double valor_compra;
private LocalDateTime data_compra;
	
	
public compra() {		
		
}

public compra(int id_compra, double valor_compra, LocalDateTime data_compra) {
	super();
	this.id_compra = id_compra;
	this.valor_compra = valor_compra;
	this.data_compra = data_compra;
}


public int getId_compra() {
		return id_compra;
	}

public void setId_compra(int id_compra) {
		this.id_compra = id_compra;
	}

public double getValor_compra() {
		return valor_compra;
	}

public void setValor_compra(double valor_compra) {
		this.valor_compra = valor_compra;
	}

public LocalDateTime getData_compra() {
		return data_compra;
	}

public void setData_compra(LocalDateTime data_compra) {
		this.data_compra = data_compra;
	}


DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
}



