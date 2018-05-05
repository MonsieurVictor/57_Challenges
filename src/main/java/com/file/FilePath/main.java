package com.file.FilePath;

import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class main {
    public static void main(String[] args) throws IOException {
        Path path;


        path = Paths.get("temp.txt").toAbsolutePath();


        System.out.println(path.getFileName().toAbsolutePath());
        System.out.println(path.getParent());
        System.out.println(path.getRoot());

        System.out.println(path.isAbsolute());


        Files.copy(Paths.get("temp.txt"), Paths.get("temp2.txt"), StandardCopyOption.REPLACE_EXISTING);
        Files.move(Paths.get("temp2.txt"), Paths.get("temp3.txt"), StandardCopyOption.REPLACE_EXISTING);
        Files.deleteIfExists(Paths.get("temp3.txt"));

        System.out.println(Files.size(path));

        System.out.println(Files.isDirectory(path));
        System.out.println(Files.isHidden(path));
        System.out.println(Files.isExecutable(path));
        System.out.println(Files.isReadable(path));
        System.out.println(Files.isWritable(path));

        System.out.println(Files.getAttribute(path, "size", LinkOption.NOFOLLOW_LINKS));

        byte[] bytes = Files.readAllBytes(path);
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }
        Files.write(path, "bla\nnew str".getBytes());

        List<String> list = Files.readAllLines(Paths.get("temp.txt"));
        for (String s: list) {
            System.out.println(s);
        }


        List<String> list1 = new ArrayList<String>();
        list1.add("very new");
        list1.add("veryvery new");
        Files.write(path, list1);

        try(DirectoryStream<Path> entries = Files.newDirectoryStream(Paths.get("."))) {
            for (Path path1 :entries) {
                System.out.println(path1.getFileName());
            }
        }

        Files.walkFileTree(Paths.get("."), new HashSet<FileVisitOption>(), 1, new MyFileVisitor());

    }
}

class MyVisitor implements FileVisitor<Path> {
    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        return null;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        return null;
    }

    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
        return null;
    }

    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
        return null;
    }
}





