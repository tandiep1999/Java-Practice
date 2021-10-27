package com.tandiep;

import java.util.Random;
import java.util.Scanner;

public class BaiTap1 {
    static final byte KEO = 0;
    static final byte BUA = 1;
    static final byte BAO = 2;

    static final byte WIN = 0;
    static final byte DRAW = 1;
    static final byte LOSE = 2;

    static short userWinCount = 0;
    static short computerWinCount = 0;
    static short drawCount = 0;

    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        boolean restart = false;
        short restartChoice = 0; // 0 = not restart
        do {
            startGame();
            restartChoice = restartGameChoice();
            restart = isRestart(restartChoice);
            if (!restart)
                endGame();
        } while (restart);
        scanner.close();
    }

    public static void startGame() {
        short userChoice;
        short computerChoice;
        short gameResult;
        boolean validChoice;

        do {
            System.out.println("OẲN TÙ TÌ BẮT ĐẦU");
            System.out.println("\nHãy đưa ra lựa chọn của bạn: ");
            System.out.println("0: Kéo\n1: Búa\n2: Bao");
            System.out.print("Lựa chọn của bạn là: ");
            userChoice = getUserChoice();
            validChoice = checkUserChoice(userChoice);
            if (validChoice) {
                computerChoice = getComputerChoice();
                startGameAnnouncement(userChoice, computerChoice);

                //Run the game and get result
                gameResult = run(userChoice, computerChoice);
                getResult(gameResult);
            } else {
                System.out.println("Xin hãy nhập vào 0, 1 hoặc 2");
            }
        } while (!validChoice);
    }

    public static short getUserChoice() {
        short userChoice = Short.parseShort(scanner.nextLine());
        return userChoice;
    }

    public static boolean checkUserChoice(short userChoice) {
        return (userChoice < 0 || userChoice > 2) ? false : true;
    }

    public static short getComputerChoice() {
        short computerChoice = (short) random.nextInt(3);
        return computerChoice;
    }

    public static void startGameAnnouncement(short userChoice, short computerChoice) {
        if (userChoice == KEO)
            System.out.println("Bạn ra KÉO");
        else if (userChoice == BUA)
            System.out.println("Bạn ra BÚA");
        else if (userChoice == BAO)
            System.out.println("Bạn ra BAO");

        if (computerChoice == KEO)
            System.out.println("Máy tính ra KÉO");
        else if (computerChoice == BUA)
            System.out.println("Máy tính ra BÚA");
        else if (computerChoice == BAO)
            System.out.println("Máy tính ra BAO");
    }

    public static short run(short userChoice, short computerChoice) {
        //Mặc định result là HÒA, vì HÒA thì sẽ không tính thêm số trận thắng cho NGƯỜI lẫn MÁY
        short result = DRAW;

        if (userChoice == KEO) {
            switch (computerChoice) {
                case KEO:
                    result = DRAW;
                    break;
                case BUA:
                    result = LOSE;
                    break;
                case BAO:
                    result = WIN;
                    break;
            }
        } else if (userChoice == BUA) {
            switch (computerChoice) {
                case KEO:
                    result = WIN;
                    break;
                case BUA:
                    result = DRAW;
                    break;
                case BAO:
                    result = LOSE;
                    break;
            }
        } else if (userChoice == BAO) {
            switch (computerChoice) {
                case KEO:
                    result = LOSE;
                    break;
                case BUA:
                    result = WIN;
                    break;
                case BAO:
                    result = DRAW;
                    break;
            }
        }

        return result;
    }

    public static void getResult(short result) {
        if (result == WIN) {
            System.out.println("Bạn thắng");
            userWinCount += 1;
        } else if (result == LOSE) {
            System.out.println("Bạn thua");
            computerWinCount += 1;
        } else if (result == DRAW) {
            System.out.println("Hòa");
            drawCount += 1;
        }
    }

    public static short restartGameChoice() {
        System.out.println("Bạn có muốn chơi tiếp?");
        System.out.println("Nhập một số khác 0 để chơi tiếp hoặc nhập 0 để dừng lại");
        System.out.print("> ");
        short restartGameChoice = Short.parseShort(scanner.nextLine());

        return restartGameChoice;
    }

    public static boolean isRestart(short restartGameChoice) {
        return (restartGameChoice != 0) ? true : false;
    }

    public static void endGame() {
        System.out.println("Kết thúc!!");
        System.out.println("Bạn đã thắng " + userWinCount + " ván");
        System.out.println("Máy đã thắng " + computerWinCount + " ván");
        if (drawCount != 0)
            System.out.println("Hòa " + drawCount + " ván");
    }
}
