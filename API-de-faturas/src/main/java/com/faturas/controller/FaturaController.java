package com.faturas.controller;

import com.faturas.model.Fatura;
import com.faturas.service.FaturaService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/faturas")
public class FaturaController {
    FaturaService faturaService;

    public FaturaController(FaturaService faturaService) {
        this.faturaService = faturaService;
    }

    @PostMapping
    public void cadastrarNovaFatura(@Valid @RequestBody Fatura fatura){
        faturaService.cadastrarFatura(fatura);
    }

    @GetMapping
    public List<Fatura> buscarTodasFaturas() {
        return faturaService.listarTodasFaturas();
    }
}
