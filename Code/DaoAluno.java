import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class DaoAluno implements Dao {

    private List<Aluno> alunos = new ArrayList<>();

    public boolean buscarID(long id) {
        for (Aluno alunoID : alunos) {
            if (alunoID.getId() == id) {
                return true;
            }
        }
        return false;
    }

    public boolean buscarObjeto(Object t) {
        for (Aluno aluno : alunos) {
            if (aluno == t) {
                return true;
            }
        }
        return false;
    }

    public void imprimirAluno() {
        for (Aluno aluno : alunos) {
            System.out.println(aluno.getNome());
        }
    }

    // ----------------------------------------//

    @Override
    public Optional<Aluno> get(long id) {

        Optional<Long> r = Optional.ofNullable(id);
        if (r.isPresent()) {
            Long aluno = r.get();
        }
        return null;

    }

    @Override
    public List<Aluno> getAll() {

        return alunos;
    }

    @Override
    public void save(Object t) {
        boolean buscar = buscarObjeto(t);
        if (buscar == false) {
            alunos.add((Aluno) t);
        }
    }

    @Override
    public void update(Object t) {
        Optional<Aluno> busca = get(((Aluno) t).getId());

        if (busca.isPresent()) {
            var a = busca.get();
            a.setNome(((Aluno) t).getNome());
            a.setCpf(((Aluno) t).getCpf());

        } else {
            this.alunos.add((Aluno) t);
        }

    }

    @Override
    public void delete(Object t) {
        boolean busca = buscarObjeto(t);
        if (busca != false) {
            alunos.remove(t);
        }
    }
}
