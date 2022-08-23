package ru.netology.BillboardManager;

public class BillboardManager {
    private String[] films = new String[0];
    private int lastFilm;
    public BillboardManager() {
        this.lastFilm=10;
    }

    public BillboardManager(int lastFilm) {
        this.lastFilm = lastFilm;
    }

    public void addFilm(String film) {
        String[] tmp = new String[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;
    }

    public String[] findAll() {
        return films;
    }

    public String[] findLast() {
        int resultLength;
        if (lastFilm <= films.length) {
            resultLength = lastFilm;
        } else {
            resultLength = films.length;
        }
        String[] tmp = new String[resultLength];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = films[films.length - 1 - i];
        }
        return tmp;
    }
}
