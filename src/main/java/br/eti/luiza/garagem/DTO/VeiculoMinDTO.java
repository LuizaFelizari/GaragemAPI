/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.eti.luiza.garagem.DTO;

import br.eti.luiza.garagem.entities.Veiculo;

/**
 *
 * @author sesidevb
 */
public class VeiculoMinDTO {
    
    private long id;
    private String nomeVeiculo;
    private String marca;
    private String modelo;
    private String cor;
    private String ano;
    private double km;
    private String linkImagem;
    
    public VeiculoMinDTO(){
        
    }

    public VeiculoMinDTO(long id, String nomeVeiculo, String marca, String modelo, String cor, String ano, double km, String linkImagem) {
        this.id = id;
        this.nomeVeiculo = nomeVeiculo;
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.km = km;
        this.linkImagem = linkImagem;
    }
    
    
    public VeiculoMinDTO(Veiculo v) {
        this.id = v.getId();
        this.nomeVeiculo = v.getNomeVeiculo();
        this.marca = v.getMarca();
        this.modelo = v.getModelo();
        this.cor = v.getCor();
        this.ano = v.getAno();
        this.km = v.getKm();
        this.linkImagem = v.getLinkImagem();
    }
    

    public long getId() {
        return id;
    }

    public String getNomeVeiculo() {
        return nomeVeiculo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public String getAno() {
        return ano;
    }

    public double getKm() {
        return km;
    }

    public String getLinkImagem() {
        return linkImagem;
    }
    
    
}
