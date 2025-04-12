package br.com.alura.owasp.validator;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.net.URLConnection;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import br.com.alura.owasp.model.Usuario;

@Component
public class ImagemValidator {

    public boolean tratarImagem(MultipartFile imagem, Usuario usuario,
            HttpServletRequest request) throws IllegalStateException, IOException {
        ByteArrayInputStream bytesImagem = new ByteArrayInputStream(imagem.getBytes());
<<<<<<< HEAD
        String mime = URLConnection.guessContentTypeFromStream(bytesImagem);

        if (mime == null) {
=======
        String mine = URLConnection.guessContentTypeFromStream(bytesImagem);

        if (mine == null) {
>>>>>>> 23502c9917fa140bbb5f2835c3982b1b6337f972
            return false;
        }

        usuario.setNomeImagem(imagem.getOriginalFilename());
        File arquivo = new File(request.getServletContext().getRealPath(
                "/image"), usuario.getNomeImagem());
        imagem.transferTo(arquivo);
        return true;

    }
}
