import java.time.LocalDate;

import br.com.dio.dominio.Bootcamp;
import br.com.dio.dominio.Curso;
import br.com.dio.dominio.Dev;
import br.com.dio.dominio.Mentoria;

public class App {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("JAVA");
        curso1.setDescricao("POO");
        curso1.SetCurso(50);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Sobre java");
        mentoria.setDescricao("Tudo sobre POO");
        mentoria.setDate(LocalDate.now());
        
        Bootcamp bot = new Bootcamp();

        bot.setNome("Bootcamp Java");
        bot.setDescricao("Java POO");
        bot.getConteudos().add(curso1);
        bot.getConteudos().add(mentoria);

        Dev dev = new Dev();
        dev.setName("Eduardo");
        // System.out.println("Bootcamp inscritos: " + dev.getConteudoInscrito());
        dev.inscreverBootcamp(bot);
        System.out.println("Bootcamp que você se inscreveu: " + dev.getConteudoInscrito());
        dev.progredindo();
        System.out.println("Conteúdo(s) concluído(s): " + dev.getconteudoConcluido());        
        dev.progredindo();
        System.out.println("XP: " + dev.calcularTotal());

        // Dev dev2 = new Dev();
        // dev2.setName("Dev2");
        // System.out.println("Bootcamp inscritos: Dev2 " + dev2.getConteudoInscrito());

    }
}
