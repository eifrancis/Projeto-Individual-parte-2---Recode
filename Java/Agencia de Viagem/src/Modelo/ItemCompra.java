package Modelo;

public class ItemCompra
{
	private int id_item ;
	private String tipo_item;
	private String nome_item;
	private double valor_item;
	

public ItemCompra() {
		
	
}
	
public ItemCompra(int id_item, String tipo_item, String nome_item, double valor_item) {
		super();
		this.id_item = id_item;
		this.tipo_item = tipo_item;
		this.nome_item = nome_item;
		this.valor_item = valor_item;
	}


public int getId_item() {
		return id_item;
	}

public void setId_item(int id_item) {
		this.id_item = id_item;
	}

public String getTipo_item() {
		return tipo_item;
	}

public void setTipo_item(String tipo_item) {
		this.tipo_item = tipo_item;
	}

public String getNome_item() {
		return nome_item;
	}

public void setNome_item(String nome_item) {
		this.nome_item = nome_item;
	}

public double getValor_item() {
		return valor_item;
	}

public void setValor_item(double valor_item) {
		this.valor_item = valor_item;
	}
	
	
}

