package br.com.digital.innovation.one.javafuncional.stringlines;

import java.util.stream.Collectors;

public class StringLinesExemplo {

    public static void main(String[] args) {
        String html = "<html>\n<head>\n<head>\n <body> \n<html>";

        System.out.println(html.lines().filter(s -> s.contains("head"))
                .collect(Collectors.joining()));

    }
}
