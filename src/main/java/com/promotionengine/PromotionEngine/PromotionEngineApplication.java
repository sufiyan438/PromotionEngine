package com.promotionengine.PromotionEngine;

import java.io.BufferedReader;
import java.io.FileReader;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PromotionEngineApplication {
	public static void main(String[] args) {
		if(args.length != 1){
			System.out.println("Provide the input file path!");
			return;
		}
		Cart cart = new Cart();
		try(BufferedReader br = new BufferedReader(new FileReader(args[0]))){
			String line = br.readLine();
			while(line != null){
				processCommand(line, cart);
				line = br.readLine();
			}
		}catch(Exception e){
			System.out.println(e.getMessage());
			return;
		}
		new Processing().processingAndOutput(cart);
	}

	private static void processCommand(String line, Cart cart){
		String[] parts = line.split(" ");
		SKU sku = SKU.valueOf(parts[0]);
		int quantity = Integer.parseInt(parts[1]);
		cart.addItem(sku, quantity);
	}

}
