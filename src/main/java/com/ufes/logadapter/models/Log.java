package com.ufes.logadapter.models;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Log {

    private String msgFalha;
    private String operacao;
    private String nome;
    private String data;
    private String hora;
    private boolean usuarioAutenticado;

    public Log() {}

    public Log(String operacao, String nome, String data, String hora, boolean usuarioAutenticado) {

        this.operacao = operacao;
        this.nome = nome;
        this.data = data;
        this.hora = hora;
        this.usuarioAutenticado = usuarioAutenticado;
    }

    public void setOperacao(String operacao) {
        this.operacao = operacao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setUsuarioAutenticado(boolean usuarioAutenticado) {
        this.usuarioAutenticado = usuarioAutenticado;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public void setMsgFalha(String msgFalha) {
        this.msgFalha = msgFalha;
    }

    public Log(String msgFalha, String operacao, String nome, String data, String hora,
               boolean usuarioAutenticado) {


        this.msgFalha = msgFalha;
        this.operacao = operacao;
        this.nome = nome;
        this.data = data;
        this.hora = hora;
        this.usuarioAutenticado = usuarioAutenticado;
    }

    public String getMsgFalha() {
        return msgFalha;
    }



    public String getOperacao() {
        return operacao;
    }



    public String getNome() {
        return nome;
    }



    public String getData() {
        return data;
    }



    public String getHora() {
        return hora;
    }



    public boolean isUsuarioAutenticado() {
        return usuarioAutenticado;
    }


}
