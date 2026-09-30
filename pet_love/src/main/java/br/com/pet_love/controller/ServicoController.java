package br.com.pet_love.controller;

import br.com.pet_love.entity.ServicoEntity;
import br.com.pet_love.service.ServicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/Servicos")

public class ServicoController {
    @Autowired

    private ServicoService service;

    @GetMapping
    public List<ServicoEntity> ListarTodosServicos() {
        return service.listarTodosServicos();

    }

    @PostMapping
    public ResponseEntity<Map<String, String>> salvar(@RequestBody ServicoEntity servico){
        service.salvarServicos(servico);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(Map.of("mensagem","Serviço cadastrado com sucesso"));

    }

    @PutMapping("/{id}")
    public ResponseEntity<Map<String, String>> atualizar(@PathVariable Long id, @RequestBody ServicoEntity servico) {
        service.atualizarServico(id, servico);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(Map.of("mensagem", "Serviço atualizado com sucesso."));


    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Map<String, String>> excluir(@PathVariable Long id) {
        service.excluirServico(id);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(Map.of("mensagem","Serviço excluido com sucesso."));
    }

}
