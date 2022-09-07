package py.edu.facitec.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import py.edu.facitec.model.Alumno;
import py.edu.facitec.repository.AlumnoRepository;

@Controller
public class AlumnoController {
	@Autowired
	private AlumnoRepository alumnoRepository;
	
	@RequestMapping("/formulario")
	public String accederFormulario(Alumno alumno) {
		System.out.println("Se accedió al formulario con exito");
		
		return "alumno/formulario_alumno";
	}
	@RequestMapping("/registrar_alumno")
	public String registrarAlumno(Alumno alumno) {
		System.out.println("Se registró con exito");
		
		alumnoRepository.save(alumno);
		
		return "alumno/formulario_alumno";
	}
}
