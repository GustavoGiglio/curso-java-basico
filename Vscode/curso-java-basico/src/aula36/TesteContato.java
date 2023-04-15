package aula36;

public class TesteContato {

    public static void main(String[] args) {

        Contato contato = new Contato();
        contato.setNome("Gustavo");

        // criar objeto endereco
        // Relacionamento tem-um endereco
        Endereco end = new Endereco();
        end.setNomeRua("Rua professor ferreira");
        end.setNumero("n/a");
        end.setComplemento("-");
        end.setCidade("Porto alegre");
        end.setEstado("RS");
        end.setCep("09999942");

        contato.setEndereco(end);

        // Criar objeto telefone
        // Relacionamento tem-muitos telefone
        Telefone tel1 = new Telefone();
        tel1.setTipo("celular");
        tel1.setDdd("51");
        tel1.setNumero("9999-9999");

        Telefone tel2 = new Telefone();
        tel2.setTipo("casa");
        tel2.setDdd("51");
        tel2.setNumero("8888-8888");

        Telefone[] telefones = new Telefone[2];
        telefones[0] = tel1;
        telefones[1] = tel2;

        contato.setTelefones(telefones);

        // Teste saída no console
        System.out.println(contato.getNome());

        if (contato != null && contato.getEndereco() != null) {
            System.out.println(contato.getEndereco().getCidade());
        }

        if (contato != null && contato.getTelefones() != null) {
            for (Telefone t : contato.getTelefones()) {
                System.out.println(t.getDdd() + " " + t.getNumero());
            }
        }

    }
}
