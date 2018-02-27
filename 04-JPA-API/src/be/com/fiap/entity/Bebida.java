package be.com.fiap.entity;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table (name="TAB_BEBIDA")
@SequenceGenerator (name="bebida", sequenceName="SEQ_TB_BEBIDA", allocationSize=1)
public class Bebida implements Serializable{

@Id
@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="bebida")
@Column(name="CD_BEBIDA")
private int codigo;

@Column(name="DS_TIPO")
@Enumerated(EnumType.STRING)
private TIpo tipo;

@Column(name="NM_BEBIDA", nullable=false, length=50)
private String nome;

@Column(name="DT_VALIDADE")
@Temporal(value=TemporalType.DATE)
private Calendar dataValidade;

@Column(name="FL_ROTULO")
@Lob
private byte[] rotulo;

@Column(name="ST_ALCOOLICO")
private boolean alcoolico;



public Bebida() {
	super();
}



public Bebida(TIpo tipo, String nome, Calendar dataValidade, byte[] rotulo, boolean alcoolico) {
	super();
	this.tipo = tipo;
	this.nome = nome;
	this.dataValidade = dataValidade;
	this.rotulo = rotulo;
	this.alcoolico = alcoolico;
}



public int getCodigo() {
	return codigo;
}



public void setCodigo(int codigo) {
	this.codigo = codigo;
}



public TIpo getTipo() {
	return tipo;
}



public void setTipo(TIpo tipo) {
	this.tipo = tipo;
}



public String getNome() {
	return nome;
}



public void setNome(String nome) {
	this.nome = nome;
}



public Calendar getDataValidade() {
	return dataValidade;
}



public void setDataValidade(Calendar dataValidade) {
	this.dataValidade = dataValidade;
}



public byte[] getRotulo() {
	return rotulo;
}



public void setRotulo(byte[] rotulo) {
	this.rotulo = rotulo;
}



public boolean isAlcoolico() {
	return alcoolico;
}



public void setAlcoolico(boolean alcoolico) {
	this.alcoolico = alcoolico;
}


	

	
}
