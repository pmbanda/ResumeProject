package com.resumeShowCase;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class UserIo
{
    public static void add(User user, String path) throws IOException
    {
        File file = new File(path);
        
        try (PrintWriter out = new PrintWriter(new FileWriter(file, true))) 
        {
            out.println(user.getName() + "|" + user.getEmail() + "|" + user.getMessage());
        }
    }
}