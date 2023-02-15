
package sigaa.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import sigaa.entidades.*;
import sigaa.sistema.Sistema;
import sigaa.usuario.Administrador;
import sigaa.usuario.Discente;
import sigaa.usuario.Docente;
import sigaa.usuario.Usuario;

import java.util.ArrayList;
import java.util.List;

public class testing {
	
	private Sistema sigaav2;
	
	@Before
	public void setup() {
		sigaav2 = Sistema.getInstance();
	}
	
//	@Test
//	public void TS001() {
//		Administrador adm = new Administrador(sigaav2,
//				"adm001",
//				"12345678",
//				"guilherme.santos@discente.ufg.br",
//				"Guilherme Santos");
//		assertEquals(adm.logar("12345678"), true);
//	}
	
	@Test
	public void TS002() {
        Curso cs = Curso.ES;
        Departamento dp = Departamento.INF;
        Formacao fm = Formacao.MESTRADO;
		Situacao st;
		List<Materia> materias = new ArrayList<Materia>();

        Administrador adm = new Administrador(sigaav2,
                "adm",
                "123456",
                "adm@ufg.br",
                "Administrador");

        Materia materia = new Materia(
                "INF0042",
                "Testes de Software",
                64,
                "4N2345",
                "CAB107, CAB104",
                45
        );

		Materia ts = new Materia(
				"INF0042",
				"Testes de Software",
				64,
				"4N2345",
				"CAB107, CAB104",
				45
		);

		Materia ps = new Materia(
				"INF0042",
				"Testes de Software",
				64,
				"4N2345",
				"CAB107, CAB104",
				45
		);

		materias.add(materia);
		materias.add(ts);
		materias.add(ps);

        Discente dis = new Discente(sigaav2,
				"julio002",
				"87654321",
				"julio.cesar@discente.ufg.br",
				"Julio Cesar",
				"20210547",
				cs);

        Docente doc = new Docente(sigaav2,
                "doc",
                "12324",
                "doc@ufg.br",
                "Gilmar",
                fm,
                dp);

        adm.aprovaMatricula(sigaav2);
        adm.cadastraDocente(sigaav2,
                "doc",
                "12324",
                "doc@ufg.br",
                "Gilmar",
                fm,
                dp);
        adm.cadastraDiscente(sigaav2,
                "julio002",
                "87654321",
                "julio.cesar@discente.ufg.br",
                "Julio Cesar",
                "20210547",
                cs);
//        adm.matriculaMateria(materia, sigaav2);
		dis.matriculaMateria(materias.addAll(List.of(materia, ps, ts)));
		dis.matriculaMateria(ps);
		dis.matriculaMateria(ts);
		assertEquals(dis.getMaterias(dis).add(materia), true);

	}
	
//	@Test
//	public void TS005() {
//		Materia materia = new Materia(
//				"INF0042",
//				"Testes de Software",
//				64,
//				"4N2345",
//				"CAB107, CAB104",
//				45
//				);
//
//		assertTrue(materia instanceof Materia);
//	}
	
	@Test
	public void TS006() {
		Sistema ponteiro1 = Sistema.getInstance();
		Sistema ponteiro2 = Sistema.getInstance();
		
		assertTrue(sigaav2 == ponteiro1);
		assertTrue(ponteiro1 == ponteiro2);
		
	}

}