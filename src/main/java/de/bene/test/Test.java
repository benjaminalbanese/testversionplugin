package de.bene.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Test {
  public static void main(String[] args) {
    String test = """
        Dies ist ein Test
        Der Test geht über 2 Zeilen
        """;
    System.out.println(test);
    try {
      Path path = Paths.get("test.txt");
      if (!Files.exists(path)) {
        Files.createFile(path);
      }
      Files.writeString(path, test);
      List<String> strings = Files.readAllLines(path);
      for (String string : strings) {
        System.out.println(string);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
