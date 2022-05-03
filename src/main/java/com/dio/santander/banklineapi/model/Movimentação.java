package com.dio.santander.banklineapi.model;

public class Movimentação {
private Integer id;
private LocalDataeTime datahora;
private String descricao;
private Double valor;
private MovimentaçãoTipo tipo;
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public LocalDataeTime getDatahora() {
	return datahora;
}
public void setDatahora(LocalDataeTime datahora) {
	this.datahora = datahora;
}
public String getDescricao() {
	return descricao;
}
public void setDescricao(String descricao) {
	this.descricao = descricao;
}
public Double getValor() {
	return valor;
}
public void setValor(Double valor) {
	this.valor = valor;
}
public MovimentaçãoTipo getTipo() {
	return tipo;
}
public void setTipo(MovimentaçãoTipo tipo) {
	this.tipo = tipo;
}
}
