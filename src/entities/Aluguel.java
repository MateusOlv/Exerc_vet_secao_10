package entities;

public class Aluguel {
	private String nomeEstudante;
	private String emailEstudante;
	private int quarto;
	
	public Aluguel(String nomeEstudante, String emailEstudante, int quarto) {
		this.nomeEstudante = nomeEstudante;
		this.emailEstudante = emailEstudante;
		this.quarto = quarto;
	}

	public String getNomeEstudante() {
		return nomeEstudante;
	}

	public void setNomeEstudante(String nomeEstudante) {
		this.nomeEstudante = nomeEstudante;
	}

	public String getEmailEstudante() {
		return emailEstudante;
	}

	public void setEmailEstudante(String emailEstudante) {
		this.emailEstudante = emailEstudante;
	}

	public int getQuarto() {
		return quarto;
	}

	public void setQuarto(int quarto) {
		this.quarto = quarto;
	}

}
