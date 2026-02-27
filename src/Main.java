import br.com.desafio.dominio.Bootcamp;
import br.com.desafio.dominio.Curso;
import br.com.desafio.dominio.Dev;
import br.com.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso Python");
        curso2.setDescricao("descrição curso Python");
        curso2.setCargaHoraria(6);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Camila: " + devCamila.getConteudoInscritros());
        devCamila.progredir();
        System.out.println("Conteudos inscritos Camila: " + devCamila.getConteudoInscritros());
        System.out.println("Conteudos concluidos Camila: " + devCamila.getConteudoConcluido());
        devCamila.progredir();
        System.out.println("XP: " + devCamila.calcularXp());


        System.out.println("===========================================================================");

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos João: " + devJoao.getConteudoInscritros());
        devJoao.progredir();
        System.out.println("Conteudos inscritos João: " + devJoao.getConteudoInscritros());
        System.out.println("Conteudos concluidos João: " + devJoao.getConteudoConcluido());
        System.out.println("XP: " + devJoao.calcularXp());


    }

}
