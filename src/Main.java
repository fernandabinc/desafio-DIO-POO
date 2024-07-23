import br.com.dio.desafio.dominio.*;

import java.awt.*;
import java.time.LocalDate;


public class Main {

    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("Descricao curso java");
        curso1.setCargaHoraria(8);


        Curso curso2 = new Curso();
        curso2.setTitulo("curso JS");
        curso2.setDescricao("Descricao curso JS");
        curso2.setCargaHoraria(4);


        Mentoria mentoria = new Mentoria();  curso2.setTitulo("curso JS");
        mentoria.setTitutlo("Mentoria de java");
        mentoria.setDescricao("Descricao mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao do Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscrverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Camila:" + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteudos inscritos Camila:" + devCamila.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Camila:" + devCamila.getConteudosConcluidos());
        System.out.println("XP:" + devCamila.caucularTotalXP());

        System.out.println("-----------");
        Dev devFernanda = new Dev();
        devFernanda.setNome("Fernanda");
        devFernanda.inscrverBootcamp(bootcamp );
        System.out.println("Conteudos inscritos Fernanda:" + devFernanda.getConteudosInscritos());
        devFernanda.progredir();
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteudos inscritos Fernanda:" + devFernanda.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Fernanda:" + devFernanda.getConteudosConcluidos());
        System.out.println("XP:" + devFernanda.caucularTotalXP());


        }


    }
