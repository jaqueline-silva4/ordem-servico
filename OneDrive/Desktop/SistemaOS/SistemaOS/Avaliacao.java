package SistemaOS;
public class Avaliacao {

	private static int contador = 1;
    private int id;
    private int nota;
    private String conteudo;

    public Avaliacao(int nota, String conteudo) {
    	this.id = contador++;
    	setNota(nota);
        setConteudo(conteudo);
    }
    
    public int getId() {
		return this.id;
	}

    public int getNota(){
		return this.nota;
	}

	public void setNota(int nota){
		if(nota >= 0 && nota <=10){
			this.nota = nota;
		} else {
			throw new IllegalArgumentException("Nota inválida!");
		}
	}
	
	public String getConteudo() {
		return this.conteudo;
	}

	public void setConteudo(String conteudo) {
		if(conteudo != null && !conteudo.isEmpty()) {
			this.conteudo = conteudo;
		} else {
			throw new IllegalArgumentException("Conteúdo inválido!");
		}
	}

	public void mostrarAvaliacao(Servico servico){
		System.out.println("	------------Avaliação----------");
		System.out.println("	ID do serviço: " + servico.getId());
		System.out.println("	ID da avaliação: " + getId());
		System.out.println("	Conteudo: " + getConteudo());
		System.out.println("	Nota: " + getNota());
		System.out.println("	-------------------------------");
	}
}
