package proyecto2.com.example.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Pelicula {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private String title;
    private String duration;
    private String country;
    private String script;
    private String music;
    private String photography;
    private String company;
    private String synopsis;

    public Pelicula() {
    }

    public Pelicula(Long id, String title, String duration, String country, String script,
                    String music, String photography, String company, String synopsis) {
        this.id = id;
        this.title = title;
        this.duration = duration;
        this.country = country;
        this.script = script;
        this.music = music;
        this.photography = photography;
        this.company = company;
        this.synopsis = synopsis;
    }

    public Long getId() {
        return id;
    }

    public Pelicula setId(Long id) {
        this.id = id;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public Pelicula setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getDuration() {
        return duration;
    }

    public Pelicula setDuration(String duration) {
        this.duration = duration;
        return this;
    }

    public String getCountry() {
        return country;
    }

    public Pelicula setCountry(String country) {
        this.country = country;
        return this;
    }

    public String getScript() {
        return script;
    }

    public Pelicula setScript(String script) {
        this.script = script;
        return this;
    }

    public String getMusic() {
        return music;
    }

    public Pelicula setMusic(String music) {
        this.music = music;
        return this;
    }

    public String getPhotography() {
        return photography;
    }

    public Pelicula setPhotography(String photography) {
        this.photography = photography;
        return this;
    }

    public String getCompany() {
        return company;
    }

    public Pelicula setCompany(String company) {
        this.company = company;
        return this;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public Pelicula setSynopsis(String synopsis) {
        this.synopsis = synopsis;
        return this;
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", duration='" + duration + '\'' +
                ", country='" + country + '\'' +
                ", script='" + script + '\'' +
                ", music='" + music + '\'' +
                ", photography='" + photography + '\'' +
                ", company='" + company + '\'' +
                ", synopsis='" + synopsis + '\'' +
                '}';
    }
}
