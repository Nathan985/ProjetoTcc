package com.example.projetotcc.cep;

import java.util.List;

/*Expõe os serviços básicos de busca de CEPs*/

public interface CEPService {

    /**
     * Obtem um <code>{@link CEP}</code> pelo número do CEP
     * @param numeroCEP a ser procurado
     * @return o <code>{@link CEP}</code> encontrado
     * @exception CEPNaoEncontradoException caso o número fornecido não retorne nada
     * @exception CEPServiceFailureException no caso de falha no serviço
     */
    public CEP obtemPorNumeroCEP(String numeroCEP);

    /**
     * Obtem os <code>{@link CEP}s</code> que satisfazem o termo fornecido
     * @param query - termo utilizado para a busca de CEPs. Normalmente o nome (ou um trecho) de um logradouro.
     * @return lista de <code>{@link CEP}s</code> encontrados
     * @exception CEPNaoEncontradoException no caso de falha no serviço
     */
    public List<CEP> obtemPorEndereco(String query);

}
