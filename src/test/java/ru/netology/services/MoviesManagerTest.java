package ru.netology.services;
import org.junit.jupiter.api.Assertions;
import  org.junit.jupiter.api.Test;
public class MoviesManagerTest {

    @Test
    public void testFindAll() {
        MoviesManager manager = new MoviesManager();

        manager.addMovie("Film 1");
        manager.addMovie("Film 2");
        manager.addMovie("Film 3");
        manager.addMovie("Film 4");
        manager.addMovie("Film 5");
        manager.addMovie("Film 6");
        manager.addMovie("Film 7");
        manager.addMovie("Film 8");
        manager.addMovie("Film 9");

        String[] expected = { "Film 1", "Film 2", "Film 3", "Film 4", "Film 5",  "Film 6", "Film 7",  "Film 8", "Film 9" };
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLast() {
        MoviesManager manager = new MoviesManager();

        manager.addMovie("Film 1");
        manager.addMovie("Film 2");
        manager.addMovie("Film 3");
        manager.addMovie("Film 4");
        manager.addMovie("Film 5");
        manager.addMovie("Film 6");
        manager.addMovie("Film 7");
        manager.addMovie("Film 8");
        manager.addMovie("Film 9");

        String[] expected = { "Film 9", "Film 8", "Film 7", "Film 6", "Film 5" };
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastLessThanBasicLimit() {
        MoviesManager manager = new MoviesManager();

        manager.addMovie("Film 1");
        manager.addMovie("Film 2");
        manager.addMovie("Film 3");

        String[] expected = { "Film 3", "Film 2", "Film 1" };
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastWithNewLimit() {
        MoviesManager manager = new MoviesManager(7);

        manager.addMovie("Film 1");
        manager.addMovie("Film 2");
        manager.addMovie("Film 3");
        manager.addMovie("Film 4");
        manager.addMovie("Film 5");
        manager.addMovie("Film 6");
        manager.addMovie("Film 7");
        manager.addMovie("Film 8");
        manager.addMovie("Film 9");

        String[] expected = { "Film 9", "Film 8", "Film 7", "Film 6", "Film 5", "Film 4", "Film 3"  };
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

}
