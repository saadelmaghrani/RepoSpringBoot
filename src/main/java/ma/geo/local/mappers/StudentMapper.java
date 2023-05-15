package ma.geo.local.mappers;
import ma.geo.local.Dtos.StudentDTO;
import ma.geo.local.entities.StudentEntity;
import org.mapstruct.Mapper;

import java.util.List;
@Mapper
public interface StudentMapper {
    public StudentEntity convertDtoToEntity(StudentDTO dto);

    List<StudentEntity> convertDtosToEntity(List<StudentDTO> dtos);

    public StudentDTO convertEntityToDto(StudentEntity entity);

    List<StudentDTO> convertEntitysToDto(List<StudentEntity> entities);
}
