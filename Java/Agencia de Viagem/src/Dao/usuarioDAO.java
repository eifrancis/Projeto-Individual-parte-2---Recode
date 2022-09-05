package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Connection.ConnectionMySQL;
import Modelo.Permissao;
import Modelo.Usuario;

public class usuarioDAO {

		//CREATE
		public void save(usuarioDAO usuario) { 
			
			String sql = "INSERT INTO usuarios " + "(Nome_usuario, Email_usuario, senha_usuario, id_permissao)" + " VALUES (?, ?, ?, ?)";
			
			Connection conn = null;
			PreparedStatement pstm = null;
			
			try { 
				conn = ConnectionMySQL.createConnectionMySQL();
				pstm = conn.prepareStatement(sql);
				
				pstm.setString(1, usuario.getNome_usuario());
				pstm.setString(2, usuario.getEmail_usuario());
				pstm.setString(3, usuario.getSenha_usuario());
				pstm.setInt(4, usuario.getPermissoes().getId_permissao());
				
				pstm.execute();
						
			} catch (Exception e) { 
				e.printStackTrace();
			} finally { 
				try { 
					if (pstm != null) { 
						pstm.close();
					}
					if (conn != null) { 
						conn.close();
					}
				} catch (Exception e) { 
					e.printStackTrace();
				}
			}
		}
		
		private Permissao getPermissoes() {
			// TODO Auto-generated method stub
			return null;
		}

		private String getSenha_usuario() {
			// TODO Auto-generated method stub
			return null;
		}

		private String getEmail_usuario() {
			// TODO Auto-generated method stub
			return null;
		}

		private String getNome_usuario() {
			// TODO Auto-generated method stub
			return null;
		}

		//DELETE BY ID
		public void deleteById(int id) { 
			String sql = "DELETE FROM usuarios WHERE id_usuario = ?";
			
			Connection conn = null;
			PreparedStatement pstm = null;
			
			try { 
				conn = ConnectionMySQL.createConnectionMySQL();
				pstm = conn.prepareStatement(sql);
				
				pstm.setInt(1, id);
				
				pstm.execute();
			} catch (Exception e) { 
				e.printStackTrace();
			} finally { 
				try { 
					if (pstm != null) { 
						pstm.close();
					}
					if (conn != null) { 
						conn.close();
					}
				} catch (Exception e) { 
					e.printStackTrace();
				}
			}
		}
		
		//UPDATE
		public void update(Usuario usuario) { 
			String sql = "UPDATE usuarios " + "SET nome_usuario = ?, email_usuario = ?, senha_usuario = ?, id_permissao = ?" + " WHERE id_usuario = ?";
			
			Connection conn = null;
			PreparedStatement pstm = null;
			
			try { 
				conn = ConnectionMySQL.createConnectionMySQL();
				pstm = conn.prepareStatement(sql);
				
				pstm.setString(1, usuario.getNome_usuario());
				pstm.setString(2, usuario.getEmail_usuario());
				pstm.setString(3, usuario.getsenha_usuario());
				pstm.setInt(4, usuario.getPermissoes().getId_permissao());
				pstm.setInt(5, usuario.getId_usuario());
				
				pstm.execute();
				
			} catch (Exception e) { 
				e.printStackTrace();
			} finally { 
				try { 
					if (pstm != null) { 
						pstm.close();
					}
					if (conn != null) { 
						conn.close();
					}
				} catch (Exception e) { 
					e.printStackTrace();
				}
			}
		}
		
		//READ
		public List<Usuario> getUsuario() { 
			String sql = "SELECT * FROM usuario";
			
			List<Usuario> usuario = new ArrayList<Usuario>();
			
			Connection conn = null;
			PreparedStatement pstm = null;
			
			ResultSet rset = null;
			
			try { 
				conn = ConnectionMySQL.createConnectionMySQL();
				
				pstm = conn.prepareStatement(sql);
				
				rset = pstm.executeQuery();
				
				while (rset.next()) { 
					Usuario usuario1 = new Usuario();
					Permissao permissao = new Permissao();
					
					usuario1.setId_usuario(rset.getInt("id_usuario"));
					usuario1.setNome_usuario(rset.getString("nome_usuario"));
					usuario1.setEmail_usuario(rset.getString("email_usuario"));
					usuario1.setsenha_usuario(rset.getString("senha_usuario"));
					
					permissao.setId_permissao(rset.getString("tipo_permissao"));
					usuario1.setPermissao(permissao);
					
					usuario1.add(usuario1);
				}
			} catch (Exception e) { 
				e.printStackTrace();
			} finally { 
				try { 
					if (pstm != null) { 
						pstm.close();
					}
					if (conn != null) { 
						conn.close();
					}
				} catch (Exception e) { 
					e.printStackTrace();
				}
			}
			
			return usuario;
		}

		public void save(Usuario usuario) {
			// TODO Auto-generated method stub
			
		}
		
	}


