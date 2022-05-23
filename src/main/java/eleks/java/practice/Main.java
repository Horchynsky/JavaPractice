package eleks.java.practice;

import eleks.java.practice.controller.BankController;
import eleks.java.practice.dto.BankRequestDto;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        BankController bankController = new BankController();
        BankRequestDto bankRequestDto = new BankRequestDto();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter id:\n");
        bankRequestDto.setId(Integer.parseInt(scanner.next()));
        System.out.println("Enter name:\n");
        bankRequestDto.setName(scanner.next());
        System.out.println("Enter qnt:\n");
        bankRequestDto.setQnt(Integer.parseInt(scanner.next()));

        //TODO create unique 5 Banks
        bankController.create(bankRequestDto);
        bankController.create(bankRequestDto);
        //TODO Return list of banks
        System.out.println(bankController.getAllBanks());
        //TODO Get bank by id

        //TODO Remove bank by id

        //TODO Return list of banks

        //TODO Create account
        //TODO Set account to the bank
        //TODO Get Banks with accounts
    }
}