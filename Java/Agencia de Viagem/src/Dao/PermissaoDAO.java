package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Connection.ConnectionMySQL;
import Modelo.Permissao;
import Modelo.Usuario;


public class PermissaoDAO {

	//CREATE
		public void save(Permissao Permissao) { 
			
			String sql = "INSERT INTO permisao (tipo_permissao) VALUES (?)";
					
			Connection conn = null;
			PreparedStatement pstm = null;
			
			try {
				
				conn = ConnectionMySQL.createConnectionMySQL();
				
				pstm = conn.prepareStatement(sql);
				
				pstm.setString(1, Permissao.getTipo_permissao());
				
				pstm.execute();
				
			}  catch (Exception e) { 
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
		

		//DELETE BY ID
		public void deleteById(int id) { 
					String sql = "DELETE FROM Permissao WHERE id_Permissao = ?";
					
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
				public void update(Permissao Permissao) { 
					String sql = "UPDATE Permissao SET Tipo_Permissao = ? WHERE id_Permissao = ?";
					
					Connection conn = null;
					PreparedStatement pstm = null;
					
					try { 
						conn = ConnectionMySQL.createConnectionMySQL();
						pstm = conn.prepareStatement(sql);
						
						pstm.setString(1, Permissao.getTipo_permissao());
						pstm.setInt(2, Permissao.getId_permissao());
						
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
				public List<Permissao> getPermissao() { 
					String sql = "SELECT * FROM permissao";
					
					List<Permissao> Permissao = new ArrayList<Permissao>();
					
					Connection conn = null;
					PreparedStatement pstm = null;
					ResultSet rset = null;
					
					try { 
						conn = ConnectionMySQL.createConnectionMySQL();
						
						pstm = conn.prepareStatement(sql);
						
						rset = pstm.executeQuery();
						
						while (rset.next()) { 
							Permissao permissao = new Permissao();
							
							permissao.setTipo_permissao(rset.getString("tipo_permissao"));
							((Modelo.Permissao) Permissao).setId_permissao(rset.getInt("id_permissao"));
							
							Permissao.add((Modelo.Permissao) Permissao);
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
					
					return Permissao;
				}	
				
				public Permissao getPermissaoById(int id_Permissao) {
					String sql = "SELECT * FROM permissao WHERE id_permissao = ?";
					
					Permissao permissao = new Permissao();
					
					Connection conn = null;
					PreparedStatement pstm = null;
					ResultSet rset = null;
					
					try {
						conn = ConnectionMySQL.createConnectionMySQL();
						pstm = conn.prepareStatement(sql);
						pstm.setInt(1, id_Permissao);
						
						rset = pstm.executeQuery();
						rset.next();
						
						permissao.setId_permissao(rset.getInt("id_permissao"));
						permissao.setTipo_permissao(rset.getString("tipo_permissao"));
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
					
					return permissao;
}


				public void update(Usuario usuario1) {
					// TODO Auto-generated method stub
					
				}
}