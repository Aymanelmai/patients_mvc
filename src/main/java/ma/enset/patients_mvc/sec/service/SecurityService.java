package ma.enset.patients_mvc.sec.service;

import ma.enset.patients_mvc.sec.entities.AppRole;
import ma.enset.patients_mvc.sec.entities.AppUser;

public interface SecurityService  {
    AppUser saveNewUser(String username,String password,String rePassword);
    AppRole saveNewRole(String roleName,String description);
    void  addRoleToUser(String username,String roleName);
    void  removeRoleFromUser(String username,String roleName);
    AppUser loadByUserName(String username);

}
