import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Password {
    /**
     * TODO
     * Store generated password
     * Encrypt
     * Implement password strength checker
     */

    private String password;
    public Password(String password) {
        this.password = password;
        /*
        switch(menuNum) {
            case 1:
                caesarCipher();
                break;
            case 2:
                keyedCaesarCipher();
                break;
            case 3:
                affineCipher();
            default:
                RSAEncrypt();
        }
        */
    }

    public void RSAEncrypt() {

    }

    public void caesarCipher() {

    }

    public void keyedCaesarCipher() {

    }

    private void affineCipher() {
        //TODO
    }

    public void savePassword() {
        try {
            File saveFile = new File("filename.txt");
            if (saveFile.createNewFile()) {
                System.out.println("File created: " + saveFile.getName());

                //Later this will write multiple lines (pswd specs etc.)
                try(BufferedWriter bfw = new BufferedWriter(new FileWriter(saveFile))) {
                    bfw.write(this.password);
                }
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException ioe) {
            System.err.println("An error occoured while creating save file!");
            ioe.printStackTrace();
        }
    }

    public void rankPasswordStrength() {
        //TODO
    }
}
