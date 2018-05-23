/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.theparrot.provider;

import com.theparrot.model.User;
import java.io.*;
import com.google.gson.Gson;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gustavomiara
 */
public class ReadAndWrite {

    public User user;
    public ObjectOutputStream out;
    private ObjectInputStream in;

    /*
    *   Leitura e escrita com File Reader e File Writer
     */
    public User readFileReader() {
        System.out.println("readFileReader()");
        try {
            FileReader r;
            r = new FileReader("../../../teste.txt");
            BufferedReader in = new BufferedReader(r);
            String line = in.readLine();
            while (line != null) {
                System.out.println(line);
                line = in.readLine();
            }
            in.close();
            r.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ReadAndWrite.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException erro) {
            Logger.getLogger(ReadAndWrite.class.getName()).log(Level.SEVERE, null, erro);
        }
        return user;
    }

    public void writeFileReader(User user) {
        FileWriter w = null;
        try {
            w = new FileWriter("./teste.txt");
            PrintWriter out = new PrintWriter(w);
            out.println(user.getName());
            out.println(user.getUsername());
            out.println(user.getEmail());
            out.println(user.getSenha());
            out.close();
            w.close();
        } catch (IOException ex) {
            Logger.getLogger(ReadAndWrite.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                w.close();
            } catch (IOException ex) {
                Logger.getLogger(ReadAndWrite.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    /*
    *   Manipulação de arquivos com JSON
     */
    public String convertToJSON(User user) {
        String json = new Gson().toJson(user, User.class);
        return json;
    }

    public User converToUser(String json) {
        User user = new Gson().fromJson(json, User.class);
        return user;
    }

    public void saveJSON(String file, String json) {
        try {
            FileWriter w;
            w = new FileWriter(file);
            w.write(json);
            w.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Erro ao salvar (arquivo não encontrado): " + ex.getMessage());
        } catch (IOException e) {
            System.out.println("Erro ao salvar: " + e.getMessage());
        }
    }

    public String loadJSON(String file) {
        try {
            FileReader r;
            r = new FileReader(file);
            BufferedReader in = new BufferedReader(r);
            String buffer = in.readLine();
            String all = "";
            while (buffer != null) {
                all += buffer;
                buffer = in.readLine();
            }
            return all;
        } catch (FileNotFoundException ex) {
            System.out.println("Erro ao ler (arquivo não encontrado): " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("Erro ao ler : " + ex.getMessage());
        }
        return null;
    }

    /*
    *   Manipulação de arquivo binários
     */
    public void openFile() {
        try {
            this.out = new ObjectOutputStream(new FileOutputStream("../../../teste.bin"));
        } catch (IOException e) {
            System.err.println("Error opening file.");
        }
    }

    public void addRecords(User user) {
        this.openFile();
        try {
            out.writeObject(user);
        } catch (IOException e) {
            System.err.println("Error.");
        }
        this.closeFile();
    }

    public void readRecords(User user) {
        this.openFile();
        try {
            while (true) {
                user = (User) in.readObject();
                System.out.println(user.getName());
            }
        } catch (IOException | ClassNotFoundException e) {
        }
        this.closeFile();
    }

    public void closeFile() {
        try {
            if (this.out != null) {
                this.out.close();
            }
        } catch (IOException e) {
            System.err.println("Error closing file.");
        }
    }

}
