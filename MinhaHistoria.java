class Pessoa {
    protected String dataNascimento;
    protected String biografia;

    public Pessoa(String dataNascimento, String biografia) {
        this.dataNascimento = dataNascimento;
        this.biografia = biografia;
    }

    public void exibirBiografia() {
        System.out.println("--- Biografia de uma pessoa ---");
        System.out.println("Data de nascimento: " + dataNascimento);
        System.out.println("Resumo: " + biografia);
        System.out.println();
    }
}

class Pais extends Pessoa {
    private String descricaoRelacionamento;

    public Pais(String dataConheceram, String biografia, String descricaoRelacionamento) {
        super(dataConheceram, biografia);
        this.descricaoRelacionamento = descricaoRelacionamento;
    }

    @Override
    public void exibirBiografia() {
        System.out.println("--- Como nossos pais se conheceram ---");
        System.out.println("Data: " + dataNascimento);
        System.out.println("Descrição da época: " + biografia);
        System.out.println("Relacionamento: " + descricaoRelacionamento);
        System.out.println();
    }
}

class Filho extends Pessoa {
    private String fase0a5;
    private String fase6a7;
    private String fase8a10;
    private String fase10a15;
    private String fase15a18;
    private String fase18a22;

    public Filho(String dataNascimento, String biografia, String fase0a5, String fase6a7, String fase8a10, String fase10a15, String fase15a18, String fase18a22) {
        super(dataNascimento, biografia);
        this.fase0a5 = fase0a5;
        this.fase6a7 = fase6a7;
        this.fase8a10 = fase8a10;
        this.fase10a15 = fase10a15;
        this.fase15a18 = fase15a18;
        this.fase18a22 = fase18a22;
    }

    @Override
    public void exibirBiografia() {
        System.out.println("--- Minha história (linha do tempo) ---");
        System.out.println("Data de Nascimento: " + dataNascimento);
        System.out.println("Resumo da infância: " + biografia);
        System.out.println();

        System.out.println("- 0 a 5 anos:");
        System.out.println(fase0a5);
        System.out.println();

        System.out.println("- 6 a 7 anos:");
        System.out.println(fase6a7);
        System.out.println();

        System.out.println("- 8 a 10 anos:");
        System.out.println(fase8a10);
        System.out.println();

        System.out.println("- 10 a 15 anos:");
        System.out.println(fase10a15);
        System.out.println();

        System.out.println("15 a 18 anos:");
        System.out.println(fase15a18);
        System.out.println();

        System.out.println("- 18 a 22 anos:");
        System.out.println(fase18a22);
        System.out.println();
    }
}

public class MinhaHistoria {
    public static void main(String[] args) {
        Pais historiaPais = new Pais(
            "Por volta de 1995",
            "Meu pai, um homem de pensamento forte, teve de amadurecer rapidamente devido a sua familia, e minha mãe, uma mulher sonhadora, imaginava-se ser uma astrológa, viveu boa parte da vida em um campo com seus pais.",
            "Se conheceram e acabam se apaixonando."
        );

        Filho minhaHistoria = new Filho(
            "03 de Junho de 2003",
            "Minha infância foi marcada por mudanças e descobertas...",
            "Dos 0 aos 5 anos, fui hospitalizado duas vezes logo nos primeiros anos de vida. Comecei a falar e mudei de local onde morava, ja tinha meus irmãos - Lucas, Rafael, Emanuelle, William e Leonardo.",
            "Dos 6 aos 7, comecei a estudar, e tive como professora a Sra. Jerusa. E o primeiro melhor amigo João Pedro.",
            "Dos 8 aos 10, tive a descoberta de um problema chamado Sopro no coração. Entrei para a primeira escolhinha de futsal e jogava jogos como Counter-Strike 1.6, Point Blank, 18 Wheels of Steel, Mario Kart 64, entre outros...",
            "Dos 11 aos 15 anos, troquei de escola, troquei de escolinha de futsal para futebol de campo, comecei a pilotar kart, passei pela primeira copa do mundo que me recordo (marcante) e completei o album da copa.",
            "Dos 16 aos 18, tomei a primeira bebida alcoólica, comecei a trabalhar, tive minha primeira \"namorada\", tirei minha carteira de motorista, fiz meu primeiro estágio, me alistei no exercito e finalizei o ensino médio.",
            "Dos 19 aos 22 anos, logo após a saída do exercito, ingressei na faculdade de Sistemas de Informação, me mudei para a um apartamento, depois de dois empregos, comecei a trabalhar na área de TI, viajei para fora do Brasil (Espanha, Grécia, França e Itália)."
        );

        historiaPais.exibirBiografia();
        minhaHistoria.exibirBiografia();
    }
}