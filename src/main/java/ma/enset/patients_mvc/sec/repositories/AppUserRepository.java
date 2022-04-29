package ma.enset.patients_mvc.sec.repositories;

import ma.enset.patients_mvc.sec.entities.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppUserRepository extends JpaRepository<AppUser,String > {
AppUser findByUsername(String username);

}
