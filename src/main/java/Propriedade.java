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

}
