package com.primerApp.SpringBoot.Controller;

import com.primerApp.SpringBoot.model.Experiencia;
import com.primerApp.SpringBoot.repository.ExperienciaRepository;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exp/")
@CrossOrigin(origins = "https://porfolio-7cda6.web.app")
public class ExperienciaController {

    @Autowired
    public ExperienciaRepository exprepo;

    @PostMapping("/new/exp")
    public void agregarExp(@RequestBody Experiencia exp) {
        exprepo.save(exp);

    }

    @GetMapping("/encontrar/exp/{id}")
    public Experiencia buscarExp(@PathVariable Long id) {

        return exprepo.findById(id).orElse(null);

    }

    @DeleteMapping("/elimExp/{id}")

    public void eliminarExp(@PathVariable Long id) {

        exprepo.deleteById(id);
    }

    @PutMapping("/edit/exp/{id}")
    public void editarExp(@PathVariable Long id, @RequestBody Experiencia exp) {
        Experiencia experiencia = exprepo.findById(id).orElse(null);

        experiencia.setNombreEmpresa(exp.getNombreEmpresa());
        experiencia.setPuesto(exp.getPuesto());
        experiencia.setFechaInicio(exp.getFechaInicio());
        experiencia.setFechaFin(exp.getFechaFin());
        experiencia.setDescripcion(exp.getDescripcion());

        exprepo.save(experiencia);

    }

    @GetMapping("/ver/exp")
    @ResponseBody
    public List<Experiencia> verExp() {
        return exprepo.findAll();

    }

}
