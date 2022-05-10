package de.akkjon.fowler;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovieTest {

    Movie movie;
    String name;
    int pieceCode;

    @BeforeEach
    void setup() {
        this.name = randomString();
        this.pieceCode = (int) (Math.random() * 3);
        this.movie = new Movie(name, pieceCode);
    }

    @Test
    void getPriceCode() {
        assertEquals(pieceCode, movie.getPriceCode());
    }

    @Test
    void setPriceCode() {
        movie.setPriceCode(2);
        assertEquals(2, movie.getPriceCode());
    }

    @Test
    void getTitle() {
        assertEquals(name, movie.getTitle());
    }

    private String randomString() {

        String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz ";
        StringBuilder result = new StringBuilder();
        for(int i = 0; i<15; i++) {
            result.append(s.getBytes()[(int) (Math.random() * s.length())]);
        }
        return result.toString();
    }
}