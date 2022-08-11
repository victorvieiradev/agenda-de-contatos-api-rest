package com.mycompany.controllers;

import com.mycompany.model.ContatoModel;
import com.mycompany.service.ContatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ContatoController {
    @Autowired
    private ContatoService contatoService;
    @GetMapping(path = "/contato")
    public List<ContatoModel> exibirContatosCadastrados(){
        return contatoService.exibirContatosCadastrados();
    }
    @GetMapping(path = "/contato/{id}")
    public Optional<ContatoModel> exibirContatoPorId(@PathVariable Long id){
        return contatoService.exibirContatoPorId(id);
    }
    @PostMapping(path = "/contato")
    @ResponseStatus(HttpStatus.CREATED)
    public ContatoModel cadastrarContato(@RequestBody ContatoModel contatoModel){
        return contatoService.cadastrarNovoContato(contatoModel);
    }
    @PutMapping(path = "/contato/{id}")
    public ContatoModel editarContato(@RequestBody ContatoModel contatoModel){
        return contatoService.editarContato(contatoModel);
    }
    @DeleteMapping(path = "/contato/{id}")
    public void excluirContato(@PathVariable Long id){
        contatoService.excluirContato(id);
    }
    @GetMapping(path = "/contato/nome")
    public ContatoModel buscarPorNome(@RequestParam(value = "nome", defaultValue = "") String nome ){
        return contatoService.buscarPorNome(nome);
    }

}
