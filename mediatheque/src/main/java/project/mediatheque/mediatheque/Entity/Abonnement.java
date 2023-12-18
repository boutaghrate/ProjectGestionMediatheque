package project.mediatheque.mediatheque.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "abonnement")
public class Abonnement {

    @Id
    @Column(name = "abonnement_id",length = 50)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int abonnementId;

    @Column(name = "abonnement_name",length = 50)
    String name;


}
