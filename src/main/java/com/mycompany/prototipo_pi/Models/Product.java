package com.mycompany.prototipo_pi.Models;

public class Product {

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    private String nome;
    private int tamanho;
    private String marca;
    private int estoque;

    public Product(String nome, int tamanho, String marca, int estoque) {
        this.nome = nome;
        this.tamanho = tamanho;
        this.marca = marca;
        this.estoque = estoque;
    }
     public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }
}
