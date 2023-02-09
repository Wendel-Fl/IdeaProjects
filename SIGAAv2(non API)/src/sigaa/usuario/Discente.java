package sigaa.usuario;

import sigaa.entidades.Curso;
import sigaa.entidades.Materia;
import sigaa.sistema.Sistema;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Discente extends Usuario implements Comparable<Discente>{
	public Discente(Sistema sistema, String login, String senha, String email, String nome) {
		super(login, senha, email, nome);
		sistema.adicionaUsuario(this);
	}
	private String matricula;
	private Curso curso;
	private Integer indicePrioridade;
	private List<Materia> materias = new ArrayList<Materia>();
	
	public void matriculaMateria(Materia materia) {
		materia.joinListaDeEspera(this);
	}
	
	public Integer getIndiceDePrioridade(Usuario usuario) {
		return this.indicePrioridade;
	}
	
	public List<Materia> getMaterias(Usuario usuario){
		if(usuario instanceof Administrador)
			return this.materias;
		return Collections.unmodifiableList(this.materias);
	}

	@Override
	public int compareTo(Discente discente) {
		return this.indicePrioridade.compareTo(discente.getIndiceDePrioridade(discente));
	}
}
