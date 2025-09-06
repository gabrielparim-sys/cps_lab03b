package pe.edu.tecsup.lab03.repositories;

import pe.edu.tecsup.lab03.entities.StudentEntity;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository {
    public void sinEstudiante(long id){
        StudentEntity estudiante = studentService.buscarPorId(id);
    }
    private List<StudentEntity> estudiantes = new ArrayList<>();

    public void save(StudentEntity student) {
        estudiantes.add(student);
    }

    public List<StudentEntity> findAll() {
        return estudiantes;
    }

    public StudentEntity findById(Long id) {
        return estudiantes.stream()
                .filter(s -> s.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}
