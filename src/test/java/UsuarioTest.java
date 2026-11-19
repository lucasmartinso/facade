import org.example.Escrita;
import org.example.Usuario;
import org.example.Visualizacao;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class UsuarioTest {
    @Test
    void deveRetornarBloqueioVisualizacao() {
        Usuario usuario = new Usuario();
        Visualizacao.getInstance().bloqueiaUsuario(usuario);

        assertEquals(false, usuario.logar());
    }

    @Test
    void deveRetornarBloqueioEscrita() {
        Usuario usuario = new Usuario();
        Escrita.getInstance().bloqueiaUsuario(usuario);

        assertEquals(false, usuario.logar());
    }

    @Test
    void deveRetornarAcessoTotal() {
        Usuario usuario = new Usuario();

        assertEquals(true, usuario.logar());
    }
}
