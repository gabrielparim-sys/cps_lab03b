package pe.edu.tecsup.lab03.services;

import pe.edu.tecsup.lab03.entities.StudentEntity;
import pe.edu.tecsup.lab03.repositories.StudentRepository;

import java.util.List;

public class StudentService {

    private StudentRepository repository = new StudentRepository();

    public void registrarEstudiante(Long id, String nombre, String correo) {
        StudentEntity student = new StudentEntity(id, nombre, correo);
        repository.save(student);
    }

    public List<StudentEntity> listarEstudiantes() {
        return repository.findAll();
    }

    public StudentEntity buscarPorId(Long id) {
        return repository.findById(id);
    }
}
