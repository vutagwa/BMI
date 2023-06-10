/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmi;
import java.util.Scanner;

class details{
    public int height, weight;
    void persona(int x,int y){
        x = height;
        y = weight;
    }
    int mass(){
        int mass = weight/height;
        return mass;
    }
}
public class BMI {

    public static void main(String[] args) {
        details person = new details();
        Scanner input = new Scanner(System.in);
        System.out.println("enter your height in cm");
        int hei = input.nextInt();
        hei = person.height;
        System.out.println("enter your weight in KGs");
        int wei = input.nextInt();
        wei = person.weight;
        int body = person.mass();
        System.out.println(body);
    }
    
}
