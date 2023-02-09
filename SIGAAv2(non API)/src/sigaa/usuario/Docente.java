package sigaa.usuario;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import sigaa.entidades.Atividade;
import sigaa.entidades.Departamento;
import sigaa.entidades.Formacao;
import sigaa.entidades.Materia;
import sigaa.sistema.Sistema;

public class Docente extends Usuario{
	
	public Docente(Sistema sistema, String login, String senha, String email, String nome) {
		super(login, senha, email, nome);
		sistema.adicionaUsuario(this);
	}

	private Formacao formacao;
	private Departamento departamento;
	private List<Materia> materias = new ArrayList<>();
	
	public void cadastraAtividade(Materia materia, LocalDate dataEntrega, String descricao) {
		List<Atividade> m = materia.getListaDeAtividades(this);
		m.add(new Atividade(LocalDate.now(), dataEntrega, descricao));
	}
	
	public List<Materia> getMateriasDocente(Usuario usuario){
		if(usuario instanceof Administrador)
			return this.materias;
		return Collections.unmodifiableList(this.materias);
	}
	
	// public void editaFrequencia();
}
