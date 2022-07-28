package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        // a partir da palavra new se instancia o objeto;
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição Curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição Curso JS");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição Mentoria Java");
        mentoria.setData(LocalDate.now());

       /* System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devLorrayne = new Dev();
        devLorrayne.setNome("Lorrayne");
        devLorrayne.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos" + devLorrayne.getConteudosInscritos());
        devLorrayne.progredir();
        devLorrayne.progredir();
        System.out.println("---");
        System.out.println("Conteúdos Inscritos" + devLorrayne.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos" + devLorrayne.getConteudosConcluidos());
        System.out.println("XP" + devLorrayne.calcularTotalXp());



        System.out.println("---------");

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("---");
        System.out.println("Conteúdos Inscritos" + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos" + devJoao.getConteudosConcluidos());
        System.out.println("XP" + devJoao.calcularTotalXp());


    }
}
