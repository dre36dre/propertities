import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Propriedade {
	
	@Id
	private String nome;
	private String valor;
	private String descricao;
	private String categoria;
	private String subcateria;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getSubcateria() {
		return subcateria;
	}
	public void setSubcateria(String subcateria) {
		this.subcateria = subcateria;
	}

	
	
}
