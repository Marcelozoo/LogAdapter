/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ufes.logadapter.interfaces;

import java.time.LocalDate;
import java.time.LocalTime;

public interface IArquivoLog {
    public void salvarLog(String msg, String operacao, String nome, LocalDate data, LocalTime hora,
            boolean usuarioAutenticado);

    public boolean verificaTipoArquivo(String tipoArquivo);
}
