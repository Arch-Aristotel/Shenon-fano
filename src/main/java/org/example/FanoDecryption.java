package org.example;

public class FanoDecryption {

    /**Класс для создания объекта с возможностью кодирования символов abcd
     * @param Word_output объект для записи раскодированного символа
     * @param table_of_code таблица присвоения символа к двоичному коду
     * @param mass_code для посимвольной сортировки двоичного кода с последующим сравнением
     */
    private String Word_output="";
    private String table_of_code[][] = {{"0","10","110","111"}, {"a","b","c","d"}};
    public FanoDecryption(String Word_input){
        Start_gen(Word_input);
    }
    public String get_Word_output(){
        return Word_output;
    }
    private void Start_gen(String Word_input){
        char mass_code[] = Word_input.toCharArray();
        int p = Word_input.length();
        String temp_word="";
        for(int i=0; i<p; ++i){
            temp_word+=mass_code[i];
            for(int g=0; g<4; ++g){
                if(temp_word.equals(table_of_code[0][g])){
                    Word_output=Word_output+table_of_code[1][g];
                    temp_word="";
                }
            }
        }
    }
}
