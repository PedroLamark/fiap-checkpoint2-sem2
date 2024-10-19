package br.com.fiap.ecommerce.dtos;

import java.math.BigDecimal;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class ProdutoResponseDto {
    private Long id;
    private String nome;
    private BigDecimal valor;

}
