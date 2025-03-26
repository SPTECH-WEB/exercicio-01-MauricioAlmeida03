package com.faturas.service;

import com.faturas.model.Fatura;
import com.faturas.repository.FaturaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FaturaService {
    FaturaRepository faturaRepository;

    public FaturaService(FaturaRepository faturaRepository) {
        this.faturaRepository = faturaRepository;
    }

    public void cadastrarFatura(Fatura fatura) {
        faturaRepository.save(fatura);
    }

    public List<Fatura> listarTodasFaturas() {
       return faturaRepository.findAll();
    }
}
