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

/**
 * Execução de testes sobre a classe Reserva
 *
 * @author Luis Guisso &lt;luis dot guisso at ifnmg dot edu dot br&gt;
 */
public class Program {

    public static void main(String[] args) {
        Reserva r = new Reserva();
        System.out.println(">> " + r);

        r.setPropriedade("Linda casa de campo com vista para a montanha");
        r.setHospede("Ana Zaira");
        r.setEntrada(LocalDate.now().plusDays(2));
        r.setSaida(LocalDate.now().plusDays(25));
        r.setLimiteHospedes(3);
        r.setHospedes(2);
        r.atualizarEstado();

        System.out.println(">> " + r);
    }
}
