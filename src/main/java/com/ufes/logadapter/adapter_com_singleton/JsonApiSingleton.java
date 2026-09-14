package com.ufes.logadapter.adapter_com_singleton;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import com.ufes.logadapter.models.Log;

public class JsonApiSingleton {

    final private ObjectMapper objetoMapper;
    private FileWriter arquivoJson;
    private static JsonApiSingleton instancia = null;

    private JsonApiSingleton() {

        objetoMapper = new ObjectMapper();

    }

    public static JsonApiSingleton getInstancia() {
        if (instancia == null) {
            instancia = new JsonApiSingleton();
        }
        return instancia;
    }

    public void salvarLog(
                          String operacao,
                          String nome,
                          String data,
                          String hora,
                          boolean usuarioAutenticado,
                          String msgFalha) {

        if (arquivoJson == null) {
            criaArquivo();
        } else {
            try {
                this.arquivoJson = new FileWriter("log.json", true);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        Log log = new Log(operacao, nome, data, hora, usuarioAutenticado, msgFalha);
        this.escreveNoArquivoJson(log);


    }

    private void escreveNoArquivoJson(Log log) {
        String json;
        try {

            json = objetoMapper.writeValueAsString(log);
            arquivoJson.write(json);
            arquivoJson.write(System.lineSeparator());
            arquivoJson.flush();
            arquivoJson.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void criaArquivo() {
        try {
            this.arquivoJson = new FileWriter("log.json");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
