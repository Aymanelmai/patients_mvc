package ma.enset.patients_mvc.sec.repositories;

import ma.enset.patients_mvc.sec.entities.AppRole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppRoleRepository extends JpaRepository<AppRole,Long > {
AppRole findByRoleName(String roleName);

}
