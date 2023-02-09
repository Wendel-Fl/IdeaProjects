package sigaa.entidades;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import lombok.Getter;
import lombok.Setter;
import sigaa.usuario.Administrador;
import sigaa.usuario.Discente;
import sigaa.usuario.Docente;
import sigaa.usuario.Usuario;

public class Materia {

	private @Getter @Setter String cod;
	private @Getter @Setter String nome;
	private @Getter @Setter int ch;
	private @Getter @Setter String horario;
	private @Getter @Setter String local;
	private @Getter @Setter int vagas;
	private @Getter @Setter Docente docente;
	private List<Discente> alunos = new ArrayList<>();
	private List<Discente> listaDeEspera = new ArrayList<>();
	private List<Atividade> listaDeAtividades = new ArrayList<>();
	
	public List<Discente> getAlunos(Usuario usuario){
		if(usuario instanceof Administrador)
			return this.alunos;
		return Collections.unmodifiableList(this.alunos);
	}
	
	public void joinListaDeEspera(Discente discente) {
		this.listaDeEspera.add(discente);
	}
	
	public List<Discente> getListaDeEspera(Usuario usuario){
		if(usuario instanceof Administrador)
			return this.listaDeEspera;
		return Collections.unmodifiableList(this.listaDeEspera);
	}
	
	public List<Atividade> getListaDeAtividades(Usuario usuario){
		if(usuario instanceof Discente)
			return Collections.unmodifiableList(this.listaDeAtividades);
		return listaDeAtividades;
	}
	
	@Override
	public String toString() {
		return this.getCod() + " - " + this.getNome();
	}
	
}
