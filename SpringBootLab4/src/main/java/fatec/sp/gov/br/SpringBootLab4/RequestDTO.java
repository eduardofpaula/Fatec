package fatec.sp.gov.br.SpringBootLab4;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.math.BigInteger;
import java.time.LocalDateTime;

// Classe que representa o objeto RequestDTO
@JsonIgnoreProperties(ignoreUnknown = true)
public record RequestDTO(@JsonAlias("id") BigInteger id,
                         @JsonAlias("titulo") String titulo,
                         @JsonAlias("data_hora_entrega") LocalDateTime data_hora_entrega,
                         @JsonAlias("descricao") String descricao,
                         @JsonAlias("grupo") String grupo,
                         @JsonAlias("nota") int nota,
                         @JsonAlias("justificativa") String justificativa) {
}
