package br.com.encurtador.url.controllers;

import br.com.encurtador.url.dtos.UrlCurtaDto;
import br.com.encurtador.url.dtos.UrlOriginalDto;
import br.com.encurtador.url.services.interfaces.IEncurtadorUrlService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping()
@CrossOrigin(origins = "*")
@Tag(name = "Encurtador")
public class EncurtadorUrlController {

    @Autowired
    private final IEncurtadorUrlService encurtadorUrlService;

    public EncurtadorUrlController(IEncurtadorUrlService encurtadorUrlService) {
        this.encurtadorUrlService = encurtadorUrlService;
    }

    @PostMapping(value = "/encurtador")
    @ResponseStatus(HttpStatus.CREATED)
    @Operation(summary = "Cria uma URL encurtada a partir de uma URL original")
    public UrlCurtaDto createUrlCurta(@RequestBody UrlOriginalDto dto){
        return encurtadorUrlService.createUrlCurta(dto);
    }


    @GetMapping("/{codigo}")
    @Operation(summary = "Redireciona para a URL original a partir da URL encurtada.",
               description = "NÃO UTILIZE ESSE ENDPOINT PELO SWAGGER, cole o link encurtado no navegador" +
                       " ou teste pelo postman")
    @ResponseStatus(HttpStatus.FOUND)
    public ResponseEntity<Void> getUrlOriginal(@PathVariable String codigo){

        String urlOriginal =  encurtadorUrlService.getUrlOriginal(codigo);

        return ResponseEntity
                .status(HttpStatus.FOUND)
                .header("Location", urlOriginal)
                .build();
    }
}
