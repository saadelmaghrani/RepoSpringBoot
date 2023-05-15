package ma.geo.local.services;

import ma.geo.local.Dtos.StudentDTO;
import ma.geo.local.mappers.StudentMapper;
import ma.geo.local.repositories.StudentResitory;
import org.mapstruct.factory.Mappers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("service1")
public class StudentServiceImpl implements StudentService{
    private final static Logger LOGGER= LoggerFactory.getLogger(StudentServiceImpl.class);
    private StudentResitory studentResitory;
    private StudentMapper studentMapper= Mappers.getMapper(StudentMapper.class);
    public StudentServiceImpl(@Qualifier("repo") StudentResitory studentRepository){
        this.studentResitory = studentRepository;
    }
    @Override
    public StudentDTO save(StudentDTO student) {
        LOGGER.debug("start method save dto : {} ",student);
        return studentMapper.convertEntityToDto(studentResitory.save(studentMapper.convertDtoToEntity(student)));
    }

    @Override
    public StudentDTO update(StudentDTO student) {
        LOGGER.debug("start method update dto : {} ",student);

        return studentMapper.convertEntityToDto(studentResitory.save(studentMapper.convertDtoToEntity(student)));
    }

  @Override
    public Boolean delete(Long id) {
        LOGGER.debug("start method Delete dto : {} ",id);
        studentResitory.deleteById(id);
        return true;
    }

    @Override
    public List<StudentDTO> getAll() {
        LOGGER.debug("start method select All");
        return studentMapper.convertEntitysToDto(studentResitory.findAll());
    }
}
