package ma.geo.local.services;

import ma.geo.local.Dtos.StudentDTO;

import java.util.List;

public interface StudentService {
    StudentDTO save(StudentDTO student);
    StudentDTO update(StudentDTO student);
    Boolean delete(Long id);
    List<StudentDTO> getAll();
}
