package assignment_1;

import java.util.ArrayList;

//Creation of Java ArrayLists
public class Encryption {
    ArrayList<Character> symbols = new ArrayList<Character>();
    ArrayList<Character> alphabets = new ArrayList<Character>();

    public Encryption() {
        symbols.add('!');
        symbols.add('@');
        symbols.add('#');
        symbols.add('$');
        symbols.add('^');
        symbols.add('&');
        symbols.add('*');
        symbols.add('(');
        symbols.add(')');
        symbols.add('_');
        symbols.add('-');
        symbols.add('+');
        symbols.add('=');
        symbols.add('?');
        symbols.add(',');
        symbols.add('{');
        symbols.add('}');
        symbols.add('[');
        symbols.add(']');
        symbols.add('/');
        symbols.add('|');
        symbols.add(';');
        symbols.add(':');
        symbols.add('.');
        symbols.add('<');
        symbols.add('>');

        for(char letter = 'a'; letter <= 'z'; letter++) {
            alphabets.add(letter);
        }
    }

    //add a method which takes an integer and returns the alphabet stored at that position    
    public char getChar(int par1Int) {
        return alphabets.get(par1Int);
    }

    //add a method which takes in an alphabetic character and returns the index of the characterin the alphabets list
    public int getCharIndex(char par1Char) {
        for (int i = 0; i < alphabets.size(); i++) {
            if (alphabets.get(i) == par1Char) return i;
        }
        return -1;
    }

    //add a method which takes an integer and returns the symbol stored at that position 
    public char getSymbol(int par1Int) {
        return symbols.get(par1Int);
    }
    // add a method which takes in a symbol and returns the index of the symbol in the symbols list
    public int getSymbolIndex(char par1Char) {
        for (int i = 0; i < symbols.size(); i++) {
            if (symbols.get(i) == par1Char) return i;
        }
        return -1;
    }

    // add a method which takes in a plain-text string and returns the encrypted version of that string 
    public String encryptString(String par1String) {
        //method which takes plain-text string to lowercase 
        String str = par1String.toLowerCase();
        String encrypt_str = "";

        char[] tmpArray = str.toCharArray();

        for (int i = 0; i < tmpArray.length; i++) {
            
            int char_index = getCharIndex(tmpArray[i]);

            if (char_index != -1) {
                encrypt_str = encrypt_str.concat(Character.toString(getSymbol(char_index)));
            }
            else return "Error: Invalid Character";
            //if an invalid alphabet character is found, return the error string 
        }
        return encrypt_str;
    }
    // adda method which takes in an encrypted string and returns the decrypted version of that string 
    public String decryptString(String par1String) {
        String str = par1String.toLowerCase();
        String decrypt_str = "";

        char[] tmpArray = str.toCharArray();

        for (int i = 0; i < tmpArray.length; i++) {
            int symbol_index = getSymbolIndex(tmpArray[i]);

            if (symbol_index != -1) {
                decrypt_str = decrypt_str.concat(Character.toString(getChar(symbol_index)));
            }
            else return "Error: Invalid Symbol";
        }
        return decrypt_str;
    }
}
