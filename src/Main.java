import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("Descrição curso java");
        curso1.setCargaHoraria(8);


        Curso curso2 = new Curso();
        curso2.setTitulo("curso JS");
        curso2.setDescricao("Descrição curso JS");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();  curso2.setTitulo("curso JS");
        mentoria.setTitutlo("Mentoria de java");
        mentoria.setDescricao("Descricao mentoria java");
        mentoria.setData(LocalDate.now());





        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);


    }
}