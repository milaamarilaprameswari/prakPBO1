/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prakpbo;

//import java.time.Clock;
//import jdk.nashorn.internal.objects.NativeRegExp;

/**
 *
 * @author ACER
 */
public class MovieTestDrive {
    
    public static void main(String[] args) {
        movie satu = new movie();
        satu.title= "Ayat-ayat Cinta";
        satu.genre="Islami";
        satu.rating=4;
        satu.playit();
        
        movie dua = new movie();
        dua.title="the davinci code";
        dua.genre="misteri";
        dua.rating=4;
        dua.playit();
        
        movie tiga= new movie();
        tiga.title= "sang pencerah";
        tiga.genre= "islami";
        tiga.rating=5;
        tiga.playit();
        
    }
}
