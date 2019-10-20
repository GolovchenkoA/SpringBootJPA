package ua.art.demo.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name="emails")
public class Email {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

//    @Column(name = "employee_id", nullable = false)
//    private String employeeId;


    @Column(name = "email", nullable = false)
    private String email;

    //    @OneToMany(fetch = FetchType.LAZY)
//    @JoinColumn(name = "employee_id")
    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;


    @Override
    public String toString() {
        return "Email{" +
                "id=" + id +
                ", employeeId=" + employee.getId() +
                ", email='" + email + '\'' +
                '}';
    }
}
