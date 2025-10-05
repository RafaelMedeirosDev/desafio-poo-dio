import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição do curso Java");
        curso1.setCargaHoraria(10);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso POO");
        curso2.setDescricao("Aprendendo POO");
        curso2.setCargaHoraria(5);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Aprendendo Java");
        mentoria.setData(LocalDate.now());

//        System.out.println(mentoria);
//        System.out.println(curso1);
//        System.out.println(curso2);

        Bootcamp bootcamp1 = new Bootcamp();
        bootcamp1.setNome("Java");
        bootcamp1.setDescricao("Aprendendo POO com Java");
        bootcamp1.getConteudos().add(curso1);
        bootcamp1.getConteudos().add(curso2);
        bootcamp1.getConteudos().add(mentoria);

        Dev devRafael = new Dev();
        devRafael.setNome("Rafael");
        devRafael.inscreverBootcamp(bootcamp1);
        System.out.println("Conteúdos Inscritos Rafael: " + devRafael.getConteudosInscritos());
        devRafael.progredir();
        devRafael.progredir();
        devRafael.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Rafael: " + devRafael.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos: " + devRafael.getConteudosConcluidos());
        System.out.println("XP:" + devRafael.calcularTotalXp());


        System.out.println("--------------------");

        Dev devJose = new Dev();
        devJose.setNome("José");
        devJose.inscreverBootcamp(bootcamp1);
        System.out.println("Conteúdos Inscritos: " + devJose.getConteudosInscritos());
        devJose.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos José: " + devJose.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos José: " + devJose.getConteudosConcluidos());
        System.out.println("XP:" + devJose.calcularTotalXp());
    }
}
