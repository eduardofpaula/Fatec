package fatec.sp.gov.br.SpringBootLab4;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigInteger;
import java.time.LocalDateTime;

// Classe que representa o objeto Trabalho
@Entity
@Table(name="tra_trabalho")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Trabalho {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "tra_id")
    private BigInteger id;

    @Column(name = "tra_titulo", nullable = true, unique = true)
    private String titulo;

    @Column(name = "tra_data_hora_entrega", nullable = true)
    private LocalDateTime data_hora_entrega;

    @Column(name = "tra_descricao")
    private String descricao;

    @Column(name = "tra_grupo", nullable = true)
    private String grupo;

    @Column(name = "tra_nota")
    private int nota;

    @Column(name = "tra_justificativa")
    private String justificativa;

}
