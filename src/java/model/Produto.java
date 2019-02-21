/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author 141812
 */
public class Produto {
    private int codigo;
    private String nome;
    private Categoria categoria;
    private double preco;
    private int moeda;
    private double imposto;
    private int tipo;
    
    public Produto () {
        
    }

    public Produto(int codigo, String nome, Categoria categoria, double preco, int moeda, double imposto) {
        this.codigo = codigo;
        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
        this.moeda = moeda;
        this.imposto = imposto;
    }

    
    
    public void copiaProduto(Produto p) {
        this.codigo = p.getCodigo();
        this.nome = p.getNome();
        this.categoria = p.getCategoria();
        this.preco = p.getPreco();
        this.moeda = p.getMoeda();
        this.imposto = p.getImposto();
        this.tipo = p.getTipo();
    }
    
    

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }   

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getMoeda() {
        return moeda;
    }

    public void setMoeda(int moeda) {
        this.moeda = moeda;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }
    
    
}