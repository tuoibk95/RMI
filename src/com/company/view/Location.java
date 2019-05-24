package com.company.view;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class Location {
    public static void main(String args[]) throws URISyntaxException, IOException {
        File htmlFile = new File("C:\\Users\\anhdt\\IdeaProjects\\hephantan\\src\\com\\company\\view\\Location.html");
        Desktop.getDesktop().browse(htmlFile.toURI());
    }
}
