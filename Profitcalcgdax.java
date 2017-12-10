//Profitability calculator using gdax-api-java


import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileNotFoundException;


public class Profitcalcgdax
{
  
  public class Trade{
    int name;
    int type;
    double priceUSD;
    double amount;
    String date;
    
  }
  
  
  public static void main(String[] args)
  {
    
   Scanner in = new Scanner(System.in);
   
   File tradedata = new File("tradedata.txt");
   
   Int[] trade_Coin = new Int[4];
   trade_Coin[0] = 0;
   trade_Coin[1] = 1;
   trade_Coin[2] = 2;
   trade_coin[3] = 3;
   
   String[] coin_Names = new String[4];
   coin_Names[0] = "0";
   coin_Names[1] = "Btc";
   coin_Names[2] = "Eth";
   coin_Names[3] = "Ltc";
   
   ArrayList<Double> buy_Trade = new ArrayList<Double>();
   ArrayList<Double> sell_Trade = new ArrayList<Double>();
   
   
   
   
   
  }
}

   
   
   
   
   
   
  
