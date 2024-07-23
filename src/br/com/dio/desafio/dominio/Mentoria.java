package br.com.dio.desafio.dominio;

import java.time.LocalDate;


public class Mentoria extends Conteudo {

  private LocalDate data;

    @Override
    public double caucularXP() {
        return XP_PADRAO + 20d;
    }

    public Mentoria() {

    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titutlo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }


    public void setTitutlo(String mentoriaDeJava) {
    }
}
