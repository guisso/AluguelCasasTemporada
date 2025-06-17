/*
 * Copyright (C) 2025 Luis Guisso &lt;luis dot guisso at ifnmg dot edu dot br&gt;
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package br.edu.ifnmg.poo.aluguelcasastemporada;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * Controle das reservas do sistema de gestão de aluguéis de temporada
 *
 * @author Luis Guisso &lt;luis dot guisso at ifnmg dot edu dot br&gt;
 */
public class Reserva {

    private String propriedade;
    private String hospede;
    private LocalDate entrada;
    private LocalDate saida;
    private int limiteHospedes;
    private int hospedes;
    private char estado;

    //<editor-fold defaultstate="collapsed" desc="Constructor">
    public Reserva() {
        estado = 'P';
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public String getPropriedade() {
        return propriedade;
    }

    public void setPropriedade(String propriedade) {
        if (propriedade == null || propriedade.isBlank()
                || propriedade.length() > 150) {
            return;
        }
        this.propriedade = propriedade;
    }

    public String getHospede() {
        return hospede;
    }

    public void setHospede(String hospede) {
        if (hospede == null || hospede.isBlank()
                || hospede.length() > 45) {
            return;
        }
        this.hospede = hospede;
    }

    public LocalDate getEntrada() {
        return entrada;
    }

    public void setEntrada(LocalDate entrada) {
        if (entrada == null || entrada.isBefore(LocalDate.now())) {
            return;
        }
        this.entrada = entrada;
    }

    public LocalDate getSaida() {
        return saida;
    }

    public void setSaida(LocalDate saida) {
        if (saida == null || !saida.isAfter(entrada)
                || entrada.until(saida, ChronoUnit.DAYS) > 30) {
            return;
        }
        this.saida = saida;
    }

    public int getLimiteHospedes() {
        return limiteHospedes;
    }

    public void setLimiteHospedes(int limiteHospedes) {
        if (limiteHospedes <= 0) {
            return;
        }
        this.limiteHospedes = limiteHospedes;
    }

    public int getHospedes() {
        return hospedes;
    }

    public void setHospedes(int hospedes) {
        if (hospedes > limiteHospedes) {
            return;
        }
        this.hospedes = hospedes;
    }

    public char getEstado() {
        return estado;
    }

    public void setEstado(char estado) {
        this.estado = estado;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="toString">
    @Override
    public String toString() {
        return "Reserva{"
                + "propriedade=" + propriedade
                + ", hospede=" + hospede
                + ", entrada=" + entrada
                + ", saida=" + saida
                + ", limiteHospedes=" + limiteHospedes
                + ", hospedes=" + hospedes
                + ", estado=" + estado
                + '}';
    }
    //</editor-fold>

}
