package ma.geo.local.repositories;


import ma.geo.local.entities.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("repo")
public interface StudentResitory
        extends JpaRepository<StudentEntity,Long> {
    String findByName(String name);
}
