package br.com.encurtador.url.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "urls")
public class UrlCurta {

    @Id
    private String id;
    private String urlOriginal;
    private String codigo;

    public UrlCurta() {
    }

    public UrlCurta(String urlOriginal, String codigo) {
        this.urlOriginal = urlOriginal;
        this.codigo = codigo;
    }

    public UrlCurta(String id, String urlOriginal, String codigo) {
        this.id = id;
        this.urlOriginal = urlOriginal;
        this.codigo = codigo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUrlOriginal() {
        return urlOriginal;
    }

    public void setUrlOriginal(String urlOriginal) {
        this.urlOriginal = urlOriginal;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}
