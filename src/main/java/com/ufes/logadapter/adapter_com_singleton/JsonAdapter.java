
package com.ufes.logadapter.adapter_com_singleton;

import java.time.LocalDate;
import java.time.LocalTime;
import com.ufes.logadapter.interfaces.IArquivoLog;
import com.ufes.logadapter.services.FormatadorDataService;

public class JsonAdapter implements IArquivoLog {
    final private JsonApiSingleton arquivoJson;

    public JsonAdapter(JsonApiSingleton arqJsonApi) {
        this.arquivoJson = arqJsonApi;

    }

    @Override
    public void salvarLog(String operacao, String nome, LocalDate data, LocalTime hora, String usuarioAutenticado, String msgFalha) {
        this.arquivoJson.salvarLog(
                operacao,
                nome,
                FormatadorDataService.formatarData(data),
                FormatadorDataService.formatarHora(hora),
                usuarioAutenticado,
                msgFalha
        );
    }

    @Override
    public boolean verificaTipoArquivo(String tipoArquivo) {
        return tipoArquivo.equals("Json");
    }
}
