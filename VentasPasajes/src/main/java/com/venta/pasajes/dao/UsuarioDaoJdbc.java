package com.venta.pasajes.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.venta.pasajes.model.Usuario;

@Repository
public class UsuarioDaoJdbc extends SimpleJdbcDaoSupport implements UsuarioDao{

	@Autowired
	public UsuarioDaoJdbc(DataSource dataSource){
		setDataSource(dataSource);
	}
	
	@Override
	public boolean registrarUsuario(Usuario usuario) {
		String sql = 
				"insert into usuario " +
				"(codUsuario,nomUsuario, apepatUsuario, apematUsuario, tipoDocumento, numDocumento, sexo, email, password) " +
				"values(?,?,?,?,?,?,?,?,?)";
		try{
			getSimpleJdbcTemplate().update(sql, 
					usuario.getCodUsuario(),
					usuario.getNomUsuario(),
					usuario.getApepatUsuario(),
					usuario.getApematUsuario(),
					usuario.getTipoDocumento(),
					usuario.getNumDocumento(),
					usuario.getSexo(),
					usuario.getEmail(),
					usuario.getPassword());
			return true;
		}catch(Exception ex){
			return false;
		}
		
	}

	@Override
	public void eliminarUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
	}

	@Override
	public Usuario buscarUsuario(String codUsuario, String password) {
		try {
			return getSimpleJdbcTemplate()
					.queryForObject(
							"select codUsuario,nomUsuario, apepatUsuario, apematUsuario, " +
							"tipoDocumento, numDocumento, sexo, email, password " +
							"from usuario " +
							"where codUsuario=? and password=?",
							new BeanPropertyRowMapper<Usuario>(Usuario.class),
							codUsuario, password);
		} catch (EmptyResultDataAccessException e) {
			return null;
		}
	}

	@Override
	public void actualizarUsuario(Usuario usuario) {
		
	}

	@Override
	public List<Usuario> getLista() {
		String sql = 
		"select codUsuario,nomUsuario, apepatUsuario, apematUsuario, " +
		"tipoDocumento, numDocumento, sexo, email, password " +
		"from usuario ";
		return getSimpleJdbcTemplate().query(sql, new BeanPropertyRowMapper<Usuario>(Usuario.class));
	}	

}
