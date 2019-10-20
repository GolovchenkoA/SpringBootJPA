package ua.art.demo.model;


import lombok.*;
import org.springframework.stereotype.Component;


import javax.persistence.*;
import java.util.Set;

//@Component
@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "employees", schema = "public")
public class Employee {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    //    @Column(name = "email_address", nullable = false)
    @OneToMany(fetch = FetchType.EAGER)//(mappedBy = "employee")
    //@ManyToOne//(mappedBy = "employee", fetch = FetchType.LAZY)
    private Set<Email> emails;

    // тут employee - это название поля в классе Address
    @OneToOne //(mappedBy = "employee") mappedBy -- колонка будет в противоположной таблице
    //@JoinColumn(name = "addressId") // column of This class that will be as referece in Addreses table (columnt = employee_id)
    private Address address;


    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", emails=" + emails +
                ", address=" + address +
                '}';
    }
}
