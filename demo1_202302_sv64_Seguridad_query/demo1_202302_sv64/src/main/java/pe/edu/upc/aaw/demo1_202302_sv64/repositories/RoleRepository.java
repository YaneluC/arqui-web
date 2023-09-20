package pe.edu.upc.aaw.demo1_202302_sv64.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aaw.demo1_202302_sv64.entities.Role;


@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

}