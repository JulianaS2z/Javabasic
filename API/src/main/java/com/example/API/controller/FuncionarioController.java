package com.example.API.controller;

import com.example.API.entity.FuncionarioEntity;
import com.example.API.service.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/Funcionarios")
public class FuncionarioController {

    @Autowired
    private FuncionarioService service;

    @GetMapping
    public List<FuncionarioEntity> ListarTodosFuncionarios(){
        return service.listarTodosFuncionarios();
    }

    @PostMapping
    public ResponseEntity<Map<String, String>> salvar(@RequestBody FuncionarioEntity funcionario){
        service.salvarFuncionario(funcionario);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(Map.of("mensagem","Funcionario cadastrado com sucesso."));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Map<String,String>> atualizar(
            @PathVariable Long id,
            @RequestBody FuncionarioEntity funcionario) {
        service.atualizarFuncionario(id, funcionario);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(Map.of("mensagem","Funcionario atualizado com sucesso."));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Map<String,String>> excluir(@PathVariable Long id) {
        service.excluirFuncionario(id);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(Map.of("mensagem","Funcionario excluído com sucesso."));
    }
}
