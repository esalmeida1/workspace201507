package br.fatec.integracao;

import static org.junit.Assert.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import br.fatec.dominio.Empresa;
import br.fatec.persistencia.HibernateEmpresaDAO;

public class UC01CadastrarEmpresa1 {
	public static HibernateEmpresaDAO empresaDAO;
	public static Empresa empresa;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		empresaDAO = new HibernateEmpresaDAO();
		empresa = new Empresa();
		//89.424.232/0001-80
		empresa.setNomeDaEmpresa("empresa x");
		empresa.setCnpj("89424232000180");
		empresa.setNomeFantasia("empresa x");
		empresa.setEndereco("rua taquari");
		
	}

	@Test
	public void CT01UC01CadastrarEmpresa_com_sucesso() {
		try{
			assertEquals("Cadastro realizado com sucesso",empresaDAO.cadastra(empresa));
			}catch (Exception e){
				System.out.println(e.getMessage());
			}
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		empresaDAO.exclui("89424232000180");
	}

}
