package ma.geo.local.controllers;
import ma.geo.local.Dtos.StudentDTO;
import ma.geo.local.services.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    private final static Logger LOGGER= LoggerFactory.getLogger(StudentController.class);
    private StudentService studentService;
    public StudentController(@Qualifier("service1") StudentService studentService) {
        this.studentService = studentService;
    }
    @PostMapping
    public StudentDTO save(StudentDTO dto){
        LOGGER.debug("start method save dto : {} ",dto);
        return studentService.save(dto);
    }
    @GetMapping
    public List<StudentDTO> getAll(){
        LOGGER.debug("start method detall");
        return studentService.getAll();
    }
    @PutMapping
    public StudentDTO update(StudentDTO dto){
        LOGGER.debug("start method update dto : {} ",dto);
        return studentService.update(dto);
    }
    @DeleteMapping("/{ids}")
    public Boolean delete(Long id){
        LOGGER.debug("start method delete dto : {} ",id);
        return studentService.delete(id);
    }
}