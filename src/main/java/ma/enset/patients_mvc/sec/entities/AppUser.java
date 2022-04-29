package ma.enset.patients_mvc.sec.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class AppUser {
    @Id
    private String userId;
    @Column(unique = true)
    private String username;
    private String password;
    private boolean active;
    @ManyToMany(fetch = FetchType.EAGER)// a chaque fois que je vais charger un user de la bd automatiquement hibernate va charger tout les roles de ces utilisateurs
    private List<AppRole> appRoles=new ArrayList<>();

}
