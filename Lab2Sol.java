//Vinith Nair
//Student no: A00241282
//This program provides the user with 4 choices which are Ceasar cipher, average of the array, search an element in the array and reverse the string

//importing the necessary libraries
import java.util.Scanner;
import java.util.Arrays;
import java.io.*;
import java.lang.*;

public class Lab2Sol{

  public static void main(String args[]){
    //creating a scanner object
    Scanner choiceInput = new Scanner(System.in);

    //displaying the menu
    System.out.println("Choose any one: \n 1. Caesar Cipher \n2. Average of given numbers \n3. Find a number \n4. Reverse the array of numbers");
    int choice = choiceInput.nextInt();

    switch(choice){
      case 1:
      caesarCipher();
      break;
      case 2:
      arrayAvg();
      break;
      case 3:
      arrayContains();
      break;
      case 4:
      reverse();
      break;
      default:
      System.out.println("Invalid choice...please try again");
      break;}

  }


  public static void caesarCipher(){
    Scanner strEncrypt = new Scanner(System.in);
    //taking the input to encrypt from user
    System.out.println("Enter the string to encrypt");
    String inputString = strEncrypt.nextLine();

    Scanner keyInput = new Scanner(System.in);
    //taking the input key from user
    System.out.println("Enter the key");
    int key = keyInput.nextInt();
    char[] charArr = inputString.toCharArray();
    char[] decryptArr = new char[charArr.length];
    char c;
    for(int i = 0;i<charArr.length;i++){
      c = charArr[i]+=key;
      decryptArr[i] = c;
      //displaying the encrypted the string
      System.out.print(decryptArr[i]);
    }
    System.out.println("");

    System.out.println("Decrypting the string with -"+key);
    for(char ch : decryptArr){
    ch-=key;
    //displaying the decrypted string
    System.out.print(ch);
    }


  }

  public static void arrayAvg(){

    int i=0;
    int avgSum = 0;
    int avg = 0;

    Scanner avgCount = new Scanner(System.in);
    System.out.println("Enter the number of elements you want to enter");
    int count = avgCount.nextInt();


    int[] averageArray = new int[count];
    //taking the numbers as input from the user
    System.out.println("Enter the numbers");
    Scanner avgArr = new Scanner(System.in);
    for(i=0;i<averageArray.length;i++){
        averageArray[i] = avgArr.nextInt();
    }

    for(i=0;i<averageArray.length;i++){
      avgSum = avgSum + averageArray[i];
    }
    //calculating the average
    avg = avgSum/averageArray.length;
    System.out.println("");
    //displaying output
    System.out.println("The average is" + avg);

  }

  public static void arrayContains(){

    int i=0;
    Scanner searchArrCount = new Scanner(System.in);
    System.out.println("Enter the number of elements you want to enter");
    int count = searchArrCount.nextInt();
    int[] searchArray = new int[count];

    Scanner searchArr = new Scanner(System.in);
    //taking the numbers as input from the user
    System.out.println("Enter the numbers");

    for(i=0;i<searchArray.length;i++){
        searchArray[i] = searchArr.nextInt();
    }

    Scanner searchKeySc = new Scanner(System.in);
    //taking the number which has to be searched as the input
    System.out.println("Enter the number you want to search");
    int searchNumber = searchKeySc.nextInt();
    int flag = 0;
    for(i=0;i<searchArray.length;i++){
      //searching the number
      if(searchArray[i] == searchNumber){
      flag++;

      }
      }
      //displaying the output
      if(flag>0){
          System.out.println("Array contains the number "+searchNumber);
      }
      else{
          System.out.println("Array does not contains the number "+searchNumber);
      }



  }
  public static void reverse(){

    int i=0;
    Scanner reverseSc = new Scanner(System.in);
    System.out.println("Enter the number of elements you want to enter");
    int count = reverseSc.nextInt();
    int[] reverseArray = new int[count];

    Scanner reverseSc2 = new Scanner(System.in);
    //taking the numbers as input from the user
    System.out.println("Enter the numbers");

    for(i=0;i<reverseArray.length;i++){
        reverseArray[i] = reverseSc2.nextInt();
    }
    System.out.println("The reversed string is: ");

    for(i=reverseArray.length-1;i>=0;i--){
      System.out.print(" ");
      //displaying the output
      System.out.print(reverseArray[i]);
    }


  }
}
