package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "identity")
public class Identity{
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;
    @Column(name = "name", nullable = false)
    private String name;
    // Setter and Getter methods
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
    
    
}
	

