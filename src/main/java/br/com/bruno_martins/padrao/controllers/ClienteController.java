/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bruno_martins.padrao.controllers;

import br.com.bruno_martins.efinancas.models.Cliente;
import br.com.bruno_martins.padrao.rest.util.IsServiceDefault;
import br.com.bruno_martins.padrao.rest.util.PadraoController;
import br.com.bruno_martins.padrao.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Bruno Martins
 */
@RestController
@RequestMapping(path = "api/clientes")
public class ClienteController extends PadraoController<Cliente> {

    //********************** inject service in controller **********************
    @IsServiceDefault
    @Autowired
    private ClienteService service;

    //*************************** endpoint *************************************
}
