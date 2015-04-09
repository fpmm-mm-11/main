package org.jboss.as.quickstarts.helloworld;

import org.hibernate.annotations.Entity;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigInteger;

//@Entity
@Table(name = "ss")
public class ss implements Serializable {

    private Long id;
    private String name;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pk")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
