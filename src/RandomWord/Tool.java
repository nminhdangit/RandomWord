/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RandomWord;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


/*
         *
         * @author nminh
 */


public class Tool {
    public static void main(String[] args) {
        List word = new ArrayList();
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        
        try{
        URL web = new URL("http://www-personal.umich.edu/~jlawler/wordlist");
        URLConnection open = web.openConnection();
            InputStreamReader reader = new InputStreamReader(open.getInputStream(),"UTF8");
            BufferedReader buffer = new BufferedReader(reader);
            String line = " ";
            while(true){
                line = buffer.readLine();
                if(line!=null)
                    word.add(line);
                    
                else
                    break;
                
            }
        
        }catch(Exception e){
            e.printStackTrace();
        }
        int n =0;
        do{
        System.out.println("Input the number of word you want to random: ");
        n = Integer.parseInt(input.nextLine());
        for(int i =0;i< n;i++){
            
            System.out.print(word.get(random.nextInt(word.size()))+" ");
            
        }
        System.out.println("");
        }
        while(n !=0);
    }
}
