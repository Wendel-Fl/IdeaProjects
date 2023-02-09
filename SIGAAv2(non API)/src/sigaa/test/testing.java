package sigaa.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import sigaa.entidades.Materia;
import sigaa.sistema.Sistema;
import sigaa.usuario.Administrador;
import sigaa.usuario.Discente;
import sigaa.usuario.Docente;

public class testing {
	
	private Sistema sigaav2;
	
	@Before
	public void setup() {
		sigaav2 = Sistema.getInstance();
	}

	// Administrado realiza login
	@Test
	public void test001() {
		Administrador adm = new Administrador(sigaav2,
				"adm001",
				"12345678",
				"guilherme.santos@discente.ufg.br",
				"Guilherme Santos");
		assertEquals(adm.logar("12345678"), true);
	}

	// Discente realiza login
	@Test
	public void teste002() {
		Discente dis = new Discente(sigaav2,
				"julio002",
				"87654321",
				"julio.cesar@discente.ufg.br",
				"Julio Cesar");
		assertEquals(dis.logar("87654321"), true);
	}

	// Docente realiza login
	@Test
	public void teste003() {
		Docente doc = new Docente(sigaav2,
				"bruno003",
				"45685219",
				"bruno.fernandes@docente.ufg.br",
				"Bruno Fernandes");
		assertEquals(doc.logar("45685219"), true);
	}

	// Docente realiza login
	@Test
	public void teste004() {
		Docente doc = new Docente(sigaav2,
				"jorge004",
				"456321987",
				"jorge.guimaraes@docente.ufg.br",
				"Jorge Guimaraes");
		assertEquals(doc.logar("456321987"), true);
	}

	// Docente recebe sua materia
	@Test
	public void teste005() {
		Administrador adm = new Administrador(sigaav2,
				"adm001",
				"12345678",
				"guilherme.santos@discente.ufg.br",
				"Guilherme Santos");

		Docente doc = new Docente(sigaav2,
				"jorge004",
				"456321987",
				"jorge.guimaraes@docente.ufg.br",
				"Jorge Guimaraes");

		Materia mat = new Materia();
		mat.setNome("Banco de Dados");
		mat.setCh(64);
		mat.setLocal("INF");
		mat.setVagas(30);
		mat.setCod("12355");
		mat.setDocente(doc);
		mat.setHorario("Noturno");

		adm.cadastraDocente(sigaav2,
				"jorge004",
				"456321987",
				"jorge.guimaraes@docente.ufg.br",
				"Jorge Guimaraes");

		adm.matriculaMateria(mat, sigaav2);

		assertEquals(doc.getMateriasDocente(adm).add(mat), true);
	}

	// Discente realiza matricula
	@Test
	public void teste006() {
		Administrador adm = new Administrador(sigaav2,
				"adm002",
				"33557766",
				"andre.neves@ufg.br",
				"Andre Neves");

		Docente doc = new Docente(sigaav2,
				"romulomm",
				"849562",
				"romulo.mendonca@ufg.br",
				"Romulo Mendonca");

		Discente dis = new Discente(sigaav2,
				"ricardobg",
				"8524697",
				"ricardo.bugarelli@discente.ufg.br",
				"Ricardo Bugarelli");

		Materia mat = new Materia();
		mat.setHorario("Noturno");
		mat.setVagas(40);
		mat.setCh(64);
		mat.setLocal("INF");
		mat.setDocente(doc);
		mat.setNome("Projeto de Software");
		mat.setCod("5566");

		adm.matriculaMateria(mat, sigaav2);

		assertEquals(dis.getMaterias(adm).add(mat), true);

	}

}
