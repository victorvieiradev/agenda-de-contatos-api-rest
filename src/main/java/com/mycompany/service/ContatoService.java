package com.mycompany.service;

import com.mycompany.model.ContatoModel;
import com.mycompany.repositories.ContatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContatoService {
    @Autowired
    private ContatoRepository contatoRepository;
    private ContatoRepository contatoRepository1;

    public ContatoModel cadastrarNovoContato(ContatoModel contatoModel){
        contatoModel.getId();
        contatoModel.getNome();
        contatoModel.getTel();
        return contatoRepository.save(contatoModel);
    }
    public void excluirContato(Long id){
        contatoRepository.deleteById(id);
    }
    public ContatoModel editarContato(ContatoModel contatoModel){
        contatoModel.getId();
        contatoModel.getNome();
        contatoModel.getTel();
        return contatoRepository.save(contatoModel);
    }
    public List<ContatoModel> exibirContatosCadastrados(){
        return contatoRepository.findAll();
    }
    public Optional<ContatoModel>exibirContatoPorId(Long id){
        return contatoRepository.findById(id);
    }
public ContatoModel buscarPorNome(String nome){
        return contatoRepository.findByNome(nome);
}
}
