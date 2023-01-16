package entities;

import java.util.Date;

public class DadosPessoais {
	
	private Integer matricula;
	private String nome;
	private Integer telefone;
	private Date dtNascimento;
	private String endereco;
	private Integer numeroCasa;
	private String cidade;
	private String estado;
	
	public DadosPessoais() {
	}

	public DadosPessoais(Integer matricula, String nome, Integer telefone, Date dtNascimento,
			String endereco, Integer numeroCasa, String cidade, String estado) {
		this.matricula = matricula;
		this.nome = nome;
		this.telefone = telefone;
		this.dtNascimento = dtNascimento;
		this.endereco = endereco;
		this.numeroCasa = numeroCasa;
		this.cidade = cidade;
		this.estado = estado;
	
	}

	public Integer getMatricula() {
		return matricula;
	}

	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getTelefone() {
		return telefone;
	}

	public void setTelefone(Integer telefone) {
		this.telefone = telefone;
	}

	public Date getDtNascimento() {
		return dtNascimento;
	}

	public void setDtNascimento(Date dtNascimento) {
		this.dtNascimento = dtNascimento;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Integer getNumeroCasa() {
		return numeroCasa;
	}

	public void setNumeroCasa(Integer numeroCasa) {
		this.numeroCasa = numeroCasa;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
}
