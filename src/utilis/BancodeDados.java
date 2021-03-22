/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilis;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author biel_
 */
public class BancodeDados {
    public static void salvarArquivo(String caminho, String texto) {
        
        Path arquivo = Paths.get(caminho);
        BufferedWriter bw = null;
        if (!Files.exists(arquivo)) {
            try {
                Files.createFile(arquivo);
                bw = new BufferedWriter(new FileWriter(arquivo.toFile(), true));
                bw.write(texto);
            } catch (IOException ex) {
                System.out.println("Erro no arquivo");
            } finally {
                try {
                    bw.close();
                } catch (IOException ex) {
                    System.out.println("Não consegui fechar o arquivo");
                }
            }
        } else {
            try {
                bw = new BufferedWriter(new FileWriter(arquivo.toFile(), true));
                bw.newLine();
                bw.write(texto);
            } catch (IOException ex) {
                System.out.println("Erro no arquivo");
            } finally {
                try {
                    bw.close();
                } catch (IOException ex) {
                    System.out.println("Não consegui fechar o arquivo");
                }

            }
        }

    }
}