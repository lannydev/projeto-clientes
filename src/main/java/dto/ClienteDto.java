package dto;

import com.clientes.clientes.entities.Cliente;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
//@AllArgsConstructor
@NoArgsConstructor
public class ClienteDto {

    private Long id;
    private String nome;
    private String cpf;

    public ClienteDto(Cliente cliente){
        id = cliente.getId();
        nome = cliente.getNome();
        cpf = cliente.getCpf();
    }


}
