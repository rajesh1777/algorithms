package com.avaya.java8;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileDemoWithStream
{
    public static void main(String[] args)
    {
        
        try
        {
            File file = new File("");
            URI url = FileDemoWithStream.class.getClassLoader().getResource("./com/avaya/java8/test.txt").toURI();
            Path path = Paths.get(url);
            Files.lines(path).parallel().forEach(System.out::println);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        catch (URISyntaxException e)
        {
            e.printStackTrace();
        }
    }
}
