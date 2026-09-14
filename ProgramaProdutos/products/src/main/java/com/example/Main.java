package com.example;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Exercício 02

        // Criando a lista de produtos
        List<Produto> produtos = new ArrayList<>();

        // Adiciona os produtos a lista de produtos
        produtos.add(new Produto("Notebook", 3500.00, "Informática"));
        produtos.add(new Produto("Mouse", 80.00, "Periféricos"));
        produtos.add(new Produto("Teclado", 150.00, "Periféricos"));
        produtos.add(new Produto("Monitor", 1200.00, "Informática"));
        produtos.add(new Produto("Headset", 300.00, "Periféricos"));

        // Pegamos cada produto e transformamos em um texto
        List<String> textos = produtos.stream()
            .map(produto -> produto.nome + " - R$ " + produto.preco)
            .toList();

        System.out.println(textos);

        // Exercício 03
        // Filtra os produtos até R$ 300,
        // ordena pelo preço e depois transforma em texto
        List<String> promocao = produtos.stream()
            .filter(produto -> produto.preco <= 300)
            .sorted((p1, p2) -> Double.compare(p1.preco, p2.preco))
            .map(produto -> produto.nome + " - R$ " + produto.preco)
            .toList();

        System.out.println(promocao);

        // Exercício 04
        // Soma todos os preços
        double total = produtos.stream()
            .mapToDouble(produto -> produto.preco)
            .sum();

        // Calcula a média dos preços
        double media = produtos.stream()
            .mapToDouble(produto -> produto.preco)
            .average()
            .orElse(0);

        // Verifica se existe algum produto acima de R$ 1000
        boolean existeAcimaDeMil = produtos.stream()
            .anyMatch(produto -> produto.preco > 1000);

        // Verifica se todos custam menos de R$ 4000
        boolean todosAbaixoDeQuatroMil = produtos.stream()
            .allMatch(produto -> produto.preco < 4000);

        System.out.println("Preço total: R$ " + total);
        System.out.println("Preço médio: R$ " + media);
        System.out.println("Existe produto acima de R$ 1000? " + existeAcimaDeMil);
        System.out.println("Todos os produtos custam menos de R$ 4000? " + todosAbaixoDeQuatroMil);
    }
}