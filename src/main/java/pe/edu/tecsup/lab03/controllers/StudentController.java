package pe.edu.tecsup.lab03.controllers;

import pe.edu.tecsup.lab03.entities.StudentEntity;
import pe.edu.tecsup.lab03.services.StudentService;

import java.util.List;

public class StudentController {

    private StudentService studentService = new StudentService();

    public void registrarEstudiante(Long id, String nombre, String correo) {
        studentService.registrarEstudiante(id, nombre, correo);
        System.out.println("✅ Estudiante registrado con éxito");
    }

    public void mostrarEstudiantes() {
        List<StudentEntity> estudiantes = studentService.listarEstudiantes();
        System.out.println("📋 Lista de estudiantes:");
        for (StudentEntity e : estudiantes) {
            System.out.println(e);
        }
    }

    public void sinEstudiante(long id){
        StudentEntity estudiante = studentService.buscarPorId(id);
    }

    public void buscarEstudiante(Long id) {
        StudentEntity estudiante = studentService.buscarPorId(id);
        if (estudiante != null) {
            System.out.println("🔍 Estudiante encontrado: " + estudiante);
        } else {
            System.out.println("⚠️ Estudiante con ID " + id + " no encontrado.");
        }
    }
}
