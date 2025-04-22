package com.senac.cantina.service;

import com.senac.cantina.model.Produto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProdutoService {

    private List<Produto> produtos = new ArrayList<>();

    public ProdutoService() {
        produtos.add(new Produto(1L, "Pão Caipira", 6.0, "pao-caipira.jpg", "Salgados"));
        produtos.add(new Produto(2L, "Refrigerante 350mL", 6.0, "refrigerante.jpg", "Bebidas"));
        produtos.add(new Produto(3L, "Pão Pizza", 6.0, "pao-pizza.jpg", "Salgados"));
        produtos.add(new Produto(4L, "Brigadeiro", 3.0, "brigadeiro.jpg", "Doces"));
        produtos.add(new Produto(5L, "Coxinha", 5.0, "coxinha.jpg", "Salgados"));
        produtos.add(new Produto(6L, "Tortalete", 7.0, "tortalete.jpg", "Doces"));
    }

    public List<Produto> listarProdutos() {
        return produtos;
    }
}
