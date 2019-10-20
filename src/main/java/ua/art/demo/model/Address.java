package ua.art.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "addresses")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String address;

    @OneToOne(mappedBy = "address")
    //@JoinColumn(name = "id") // column of This class that will be as referece in Employee table (columnt = address_id)
    private Employee employee;
}
