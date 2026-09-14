package com.ufes.logadapter.models;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Log {


    private int id;
    private String msgFalha;
    private String operacao;
    private String nome;
    private String data;
    private String hora;
    private boolean usuario;
    private String tipoArquivoLog;

    public Log() {}

    public Log(String operacao, String nome, String data, String hora, boolean usuario, String msgFalha) {

        this.operacao = operacao;
        this.nome = nome;
        this.data = data;
        this.hora = hora;
        this.usuario = usuario;
        this.tipoArquivoLog = "JSON";
        this.msgFalha = msgFalha;
    }

    public void setId(int id )  {
        this.id = id;
    }
    public void setOperacao(String operacao) {
        this.operacao = operacao;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setUsuario(boolean usuario) {
        this.usuario = usuario;
    }
    public void setData(String data) {
        this.data = data;
    }
    public void setHora(String hora) {
        this.hora = hora;
    }
    public void setMsgFalha(String msgFalha) {
        this.msgFalha = msgFalha;
    }
    public void setTipoArquivoLog(String tipoArquivoLog) {
        this.tipoArquivoLog = tipoArquivoLog;
    }

    public String getMsgFalha() {
        return msgFalha;
    }
    public String getOperacao() {return operacao;}
    public String getNome() {return nome;}
    public String getData() {return data;}
    public String getHora() {return hora;}
    public String getTipoArquivoLog() {return this.tipoArquivoLog;}
    public boolean getUsuario() {
        return this.usuario;
    }


}
