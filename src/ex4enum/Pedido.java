package ex4enum;

import java.util.Date;
import java.util.Objects;

public class Pedido {

	private Integer id;

	private Date estante;

	private OrdeStatus status;

	public Pedido() {
		super();
	}

	public Pedido(Integer id, Date estante, OrdeStatus status) {
		this.id = id;
		this.estante = estante;
		this.status = status;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getEstante() {
		return estante;
	}

	public void setEstante(Date estante) {
		this.estante = estante;
	}

	public OrdeStatus getStatus() {
		return status;
	}

	public void setStatus(OrdeStatus status) {
		this.status = status;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pedido other = (Pedido) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Pedido id :" + id + ", estante :" + estante + ", status : " + status;
	}

}
