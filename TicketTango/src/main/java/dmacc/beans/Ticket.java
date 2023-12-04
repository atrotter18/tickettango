package dmacc.beans;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

/**
 * @author Eric Grabe - egrabe
 * CIS175 - Fall 2023
 * Nov 12, 2023
 */
@Data
@Entity
@Embeddable
public class Ticket {
	
	@Id
	@GeneratedValue
	private long id;

	
	public Ticket() {
		//super();
	}
	

	
	
}
