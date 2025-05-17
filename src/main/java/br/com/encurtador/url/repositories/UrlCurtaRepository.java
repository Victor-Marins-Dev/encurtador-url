package br.com.encurtador.url.repositories;

import br.com.encurtador.url.models.UrlCurta;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UrlCurtaRepository extends MongoRepository<UrlCurta, String> {

    UrlCurta findByCodigo(String codigo);
}
