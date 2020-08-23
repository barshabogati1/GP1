package com.vastika.gp.gp;

import java.util.Scanner;


import com.vastika.gp.controller.AccountInfoController;

public class UserTest {
	public static void main(String[] args) {
		
	AccountInfoController controller = new AccountInfoController();
		Scanner input = new Scanner(System.in);
		controller.saveUserInfo(input);
	}

}
