package br.com.encurtador.url.services;

import br.com.encurtador.url.dtos.UrlCurtaDto;
import br.com.encurtador.url.dtos.UrlOriginalDto;
import br.com.encurtador.url.models.UrlCurta;
import br.com.encurtador.url.repositories.UrlCurtaRepository;
import br.com.encurtador.url.services.interfaces.IEncurtadorUrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class EncurtadorUrlService implements IEncurtadorUrlService {

    @Autowired
    private final UrlCurtaRepository urlCurtaRepository;

    @Value("${app.dominio}")
    private String MEU_DOMINIO;

    public EncurtadorUrlService(UrlCurtaRepository urlCurtaRepository) {
        this.urlCurtaRepository = urlCurtaRepository;
    }

    public UrlCurtaDto createUrlCurta(UrlOriginalDto dto){
        String codigo = UUID.randomUUID().toString().substring(0,8);

        String urlOriginal = dto.urlOriginal();

        if(!dto.urlOriginal().startsWith("http://") && !dto.urlOriginal().startsWith("https://")){
            urlOriginal = "https://" + urlOriginal;
        }

        UrlCurta urlCurta = new UrlCurta(urlOriginal, codigo);
        urlCurtaRepository.insert(urlCurta);

        return new UrlCurtaDto(MEU_DOMINIO + codigo);
    }

    public String getUrlOriginal(String codigo){

        UrlCurta urlCurta = urlCurtaRepository.findByCodigo(codigo);

        return  urlCurta.getUrlOriginal();
    }
}
