package org.example;



public class FanoEncryption {

    /**Класс для создания объекта с возможностью кодирования символов abcd
     * @param Word_output объект для записи в двоичную систему кодированного символа
     * @param table_of_code таблица присвоения символа к двоичному коду
     */
    private String Word_output="";

    private String table_of_code[][] = {{"0","10","110","111"}, {"a","b","c","d"}};
    public FanoEncryption(String Word_input){
        String mass_word[] = Word_input.split("");
        int p = Word_input.length();
        for(int i=0; i<p; ++i){
                for(int s=0;s<4;++s){
                    if(mass_word[i].equals(table_of_code[1][s])) Word_output+=table_of_code[0][s];
                }
        }
    }
    public String get_Word_output(){
        return Word_output;
    }
}
