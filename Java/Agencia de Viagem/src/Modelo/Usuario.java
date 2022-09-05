package Modelo;

public class Usuario {
	
	private int id_usuario;
	private String Nome_usuario;
	private String Email_usuario;
	private String senha_usuario;
	
	
public Usuario(int id, String nome, String email, Permissao permissao) {
		
		
	}	
	
public Usuario(int id_usuario, String nome, String email, String senha) {
		super();
		this.id_usuario = id_usuario;
		this.Nome_usuario = nome;
		this.Email_usuario = email;
		this.senha_usuario = senha;
	}
public Usuario() {
	// TODO Auto-generated constructor stub
}

public Usuario(int id, String nome, String email, String senha, Permissao permissao1) {
	// TODO Auto-generated constructor stub
}

public int getId_usuario() {
		return id_usuario;
	}

public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}

public String getNome() {
		return Nome_usuario;
	}

public void setNome(String nome) {
	Nome_usuario = nome;
	}

public String getEmail() {
		return Email_usuario;
	}

public void setEmail(String email) {
	Email_usuario = email;
	}

public String getsenha() {
		return senha_usuario;
	}

public void setsenha(String senha) {
		this.senha_usuario = senha;
	}

public String getNome_usuario() {
	// TODO Auto-generated method stub
	return null;
}

public String getEmail_usuario() {
	// TODO Auto-generated method stub
	return null;
}

public String getsenha_usuario() {
	// TODO Auto-generated method stub
	return null;
}

public Permissao getPermissoes() {
	// TODO Auto-generated method stub
	return null;
}

public void setNome_usuario(String string) {
	// TODO Auto-generated method stub
	
}

public void setEmail_usuario(String string) {
	// TODO Auto-generated method stub
	
}

public void setsenha_usuario(String string) {
	// TODO Auto-generated method stub
	
}

public void setPermissao(Permissao permissao) {
	// TODO Auto-generated method stub
	
}

public void add(Usuario usuario) {
	// TODO Auto-generated method stub
	
}

public String getPermissao() {
	// TODO Auto-generated method stub
	return null;
}
	
	
}

