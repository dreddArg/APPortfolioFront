package com.portfolio.BackEnd.Service;

import com.portfolio.BackEnd.Entity.Experiencia;
import com.portfolio.BackEnd.Interface.IExperienciaService;
import com.portfolio.BackEnd.Repository.IExperienciaRepository;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ImpExperienciaService implements IExperienciaService {
    
    @Autowired
    public IExperienciaRepository iExperienciaRepository;
    
    public List<Experiencia> getExperiencia(){
        return iExperienciaRepository.findAll();
    }
    
    public Optional<Experiencia> getOneExperiencia(int id){
        return iExperienciaRepository.findById(id);
    }
    
    public Optional<Experiencia> getByNombreEmpresa(String nombreEmpresa){
        return iExperienciaRepository.findByNombreEmpresa(nombreEmpresa);
    }
    
    public void saveExperiencia(Experiencia expe){
        iExperienciaRepository.save(expe);
    }
    
    public void deleteExperiencia(int id){
        iExperienciaRepository.deleteById(id);
    }
}
