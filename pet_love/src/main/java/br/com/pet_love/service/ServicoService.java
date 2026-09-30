package br.com.pet_love.service;
import br.com.pet_love.entity.ServicoEntity;
import br.com.pet_love.repository.ServicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ServicoService {

    @Autowired
    private ServicoRepository repository;

    public List<ServicoEntity> listarTodosServicos() {
        return repository.findAll();
    }

    public ServicoEntity salvarServicos(ServicoEntity servicos) {

        if (repository.findByNome(servicos.getNome()).isPresent())
            throw new IllegalArgumentException("Serviço já cadastrado");

        return repository.save(servicos);
    }

    public ServicoEntity atualizarServico(Long id, ServicoEntity servico) {
        if (!repository.existsById(id))
            throw new IllegalArgumentException("Serviço não encontrado");

        servico.setId(id);
        return repository.save(servico);
    }

    public void excluirServico(Long id) {
        if (!repository.existsById(id))
            throw new IllegalArgumentException("Serviço não encontrado");

        repository.deleteById(id);
    }
}
