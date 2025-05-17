package br.com.encurtador.url.services.interfaces;

import br.com.encurtador.url.dtos.UrlCurtaDto;
import br.com.encurtador.url.dtos.UrlOriginalDto;

public interface IEncurtadorUrlService {

    UrlCurtaDto createUrlCurta(UrlOriginalDto dto);
    String getUrlOriginal(String codigo);
}
