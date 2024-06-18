package org.example.service;

import org.example.dto.CompraDto;
import org.example.dto.InfoFornecedorDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CompraService {

    @Autowired
    private RestTemplate client;
    public void realizaCompra(CompraDto compra) {


        ResponseEntity<InfoFornecedorDTO> exchange =
                client.exchange("http://fornecedor/info/" + compra.getEndereco().getEstado(),
                        HttpMethod.GET, null, InfoFornecedorDTO.class);

    }

}
