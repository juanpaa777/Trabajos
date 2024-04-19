package mx.utng.s25.testdb.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Batalla {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(length = 50, nullable=false)
    private String numBatalla;

    @Column(nullable = false)
    private Type type;

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return numBatalla;
    }
}
