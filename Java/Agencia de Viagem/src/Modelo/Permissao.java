package Modelo ;


public class Permissao 
{
	private int id_permissao;
	private String tipo_permissao;
	
public Permissao() {
	
	}
	
	
public Permissao(int id_permissao, String tipo_permissao) {
		super();
		this.id_permissao = id_permissao;
		this.tipo_permissao = tipo_permissao;
	}



public int getId_permissao() {
	return id_permissao;
}


public void setId_permissao(int id_permissao) {
	this.id_permissao = id_permissao;
}


public String getTipo_permissao() {
	return tipo_permissao;
}


public void setTipo_permissao(String string) {
	this.tipo_permissao = string;
}


public void setId_permissao(String string) {
	// TODO Auto-generated method stub
	
}



}
