package org.example.dto;

import java.util.List;

public class CompraDto {

    private List<ItemDaCompraDto> itens;
    private EnderecoDto endereco;

    // Getters and setters
    public List<ItemDaCompraDto> getItens() {
        return itens;
    }

    public void setItens(List<ItemDaCompraDto> itens) {
        this.itens = itens;
    }

    public EnderecoDto getEndereco() {
        return endereco;
    }

    public void setEndereco(EnderecoDto endereco) {
        this.endereco = endereco;
    }
}
