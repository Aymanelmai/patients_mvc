package ma.enset.patients_mvc.sec.service;

import groovy.util.logging.Slf4j;
import lombok.AllArgsConstructor;
import ma.enset.patients_mvc.sec.entities.AppRole;
import ma.enset.patients_mvc.sec.entities.AppUser;
import ma.enset.patients_mvc.sec.repositories.AppRoleRepository;
import ma.enset.patients_mvc.sec.repositories.AppUserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
@Slf4j//permet de donner un attribut qui permet de loger
@AllArgsConstructor
@Transactional
public class SecurityServiceImpl  implements SecurityService{
   private AppUserRepository appUserRepository;
   private AppRoleRepository appRoleRepository;
   private PasswordEncoder passwordEncoder;



    @Override
    public AppUser saveNewUser(String username, String password, String rePassword) {
        if (!password.equals(rePassword))throw new  RuntimeException("Passwords not match");
String hachedPWD=passwordEncoder.encode(password);
AppUser appUser= new AppUser();
appUser.setUserId(UUID.randomUUID().toString());//UUID permet de generer une chaine de caractere aleatoirement
appUser.setUsername(username);
appUser.setPassword(hachedPWD);
appUser.setActive(true);
AppUser savedAppUser=appUserRepository.save(appUser);
        return savedAppUser;
    }

    @Override
    public AppRole saveNewRole(String roleName, String description) {

      AppRole appRole=  appRoleRepository.findByRoleName(roleName);
        if (appRole != null) throw  new RuntimeException("Role" +roleName+"Already exists");
        appRole=new AppRole();
        appRole.setRoleName(roleName);
        appRole.setDescription(description);
      AppRole savedAppRole=  appRoleRepository.save((appRole));
        return savedAppRole;
    }
//@Transactional// spring qui va gerer les transactions
    @Override
    public void addRoleToUser(String username, String roleName) {
AppUser appUser= appUserRepository.findByUsername(username);
    if (appUser == null) throw  new RuntimeException("User not found");
AppRole appRole=appRoleRepository.findByRoleName(roleName);
    if (appRole == null) throw  new RuntimeException("Role not found");
appUser.getAppRoles().add(appRole);
//appUserRepository.save(appUser);// quand on fait transactionnal pas besoin d'ajouter cette ligne
    }

    @Override
    public void removeRoleFromUser(String username, String roleName) {
        AppUser appUser= appUserRepository.findByUsername(username);
        if (appUser == null) throw  new RuntimeException("User not found");
        AppRole appRole=appRoleRepository.findByRoleName(roleName);
        if (appRole != null) throw  new RuntimeException("Role not found");
        appUser.getAppRoles().remove(appRole);
    }

    @Override
    public AppUser loadByUserName(String username) {
        return appUserRepository.findByUsername(username );
    }
}
