package assignment_1;

import java.util.ArrayList;


class Encryption {


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

    public char getChar(int par1Int) {
        
        return alphabets.get(par1Int);

    }

    public int getCharIndex(char par1Char) {
        
        for (int i = 0; i < alphabets.size(); i++) {
            
            if (alphabets.get(i) == par1Char) return i;

          }

    return -1;

    }

    public char getSymbol(int par1Int) {
        
        return symbols.get(par1Int);

    }

    public int getSymbolIndex(char par1Char) {
        
        for (int i = 0; i < symbols.size(); i++) {
            
            if (symbols.get(i) == par1Char) return i;

          }

    return -1;

    }

    public String encryptString(String par1String) {

        String str = par1String.toLowerCase();
        String encrypt_str = "";

        StringBuilder str_br = new StringBuilder();

        str_br.append(encrypt_str);

        char[] tmpArray = str.toCharArray();

        for (int i = 0; i < tmpArray.length; i++) {
            
            int char_index = getCharIndex(tmpArray[i]);

            if (char_index != -1) {
                str_br.append(getSymbol(char_index));
            }
            else return "Error: Invalid Character";

          }

        return encrypt_str;

    }

    public String decryptString(String par1String) {

        String str = par1String.toLowerCase();
        String decrypt_str = "";

        StringBuilder str_br = new StringBuilder();

        str_br.append(decrypt_str);

        char[] tmpArray = str.toCharArray();

        for (int i = 0; i < tmpArray.length; i++) {
            
            int symbol_index = getSymbolIndex(tmpArray[i]);

            if (symbol_index != -1) {
                str_br.append(getChar(symbol_index));
            }
            else return "Error: Invalid Symbol";

          }

        return decrypt_str;

    }

}
