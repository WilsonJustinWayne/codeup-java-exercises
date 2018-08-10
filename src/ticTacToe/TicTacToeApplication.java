package ticTacToe;

import util.Input;

public class TicTacToeApplication {
    private static Input tools = new Input();
    private static Spot a1 = new Spot("-", "-");
    private static Spot b1 = new Spot("-", "-");
    private static Spot c1 = new Spot("-", "-");
    private static Spot a2 = new Spot("-", "-");
    private static Spot b2 = new Spot("-", "-");
    private static Spot c2 = new Spot("-", "-");
    private static Spot a3 = new Spot("-", "-");
    private static Spot b3 = new Spot("-", "-");
    private static Spot c3 = new Spot("-", "-");
    private static Player player1 = new Player("Player1", "O");
    private static Player player2 = new Player("Player2", "X");

    private static void startGame() {
        System.out.println("/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\\n\\    Welcome to        /\n/        Tic-Tac-Toe   \\\n\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/");
        tools.getString("");
    }

    private static void printGameBoard() {
        System.out.printf("%n//\\/\\/\\/\\/\\/\\/\\/\\/\\/\\\\%n\\\\      A   B   C   //%n//  1  %s %s %s  \\\\%n\\\\  2  %s %s %s  //%n//  3  %s %s %s  \\\\%n\\\\/\\/\\/\\/\\/\\/\\/\\/\\/\\//%n", a1.getFiller(), b1.getFiller(), c1.getFiller(), a2.getFiller(), b2.getFiller(), c2.getFiller(), a3.getFiller(), b3.getFiller(), c3.getFiller());
    }

    private static Player playerTurn(Player player) {
        // Don't forget to add check if spot is full functionality
        System.out.println(player.getName() + " = " + player.getMarker());
        String choice = tools.getString("Please choose a spot to place your marker(ex. A1, C3)").toLowerCase();
        switch (choice) {
            case "a1":
                a1.setContent(player.getMarker());
                break;
            case "a2":
                a2.setContent(player.getMarker());
                break;
            case "a3":
                a3.setContent(player.getMarker());
                break;
            case "b1":
                b1.setContent(player.getMarker());
                break;
            case "b2":
                b2.setContent(player.getMarker());
                break;
            case "b3":
                b3.setContent(player.getMarker());
                break;
            case "c1":
                c1.setContent(player.getMarker());
                break;
            case "c2":
                c2.setContent(player.getMarker());
                break;
            case "c3":
                c3.setContent(player.getMarker());
                break;
        }
        return player;
    }

    private static boolean checkIfWon() {
        if ((a1.getContent().equals("X") && a2.getContent().equals("X") && a3.getContent().equals("X")) || (a1.getContent().equals("O") && a2.getContent().equals("O") && a3.getContent().equals("O"))) {
            a1.setFiller("*", a1.getContent());
            a2.setFiller("*", a2.getContent());
            a3.setFiller("*", a3.getContent());
            return true;
        } else if ((b1.getContent().equals("X") && b2.getContent().equals("X") && b3.getContent().equals("X")) || (b1.getContent().equals("O") && b2.getContent().equals("O") && b3.getContent().equals("O"))) {
            b1.setFiller("*", b1.getContent());
            b2.setFiller("*", b2.getContent());
            b3.setFiller("*", b3.getContent());
            return true;
        } else if ((c1.getContent().equals("X") && c2.getContent().equals("X") && c3.getContent().equals("X")) || (c1.getContent().equals("O") && c2.getContent().equals("O") && c3.getContent().equals("O"))) {
            c1.setFiller("*", c1.getContent());
            c2.setFiller("*", c2.getContent());
            c3.setFiller("*", c3.getContent());
            return true;
        } else if ((a1.getContent().equals("X") && b1.getContent().equals("X") && c1.getContent().equals("X")) || (a1.getContent().equals("O") && b1.getContent().equals("O") && c1.getContent().equals("O"))) {
            a1.setFiller("*", a1.getContent());
            b1.setFiller("*", b1.getContent());
            c1.setFiller("*", c1.getContent());
            return true;
        } else if ((a2.getContent().equals("X") && b2.getContent().equals("X") && c2.getContent().equals("X")) || (a2.getContent().equals("O") && b2.getContent().equals("O") && c2.getContent().equals("O"))) {
            a2.setFiller("*", a2.getContent());
            b2.setFiller("*", b2.getContent());
            c2.setFiller("*", c2.getContent());
            return true;
        } else if ((a3.getContent().equals("X") && b3.getContent().equals("X") && c3.getContent().equals("X")) || (a3.getContent().equals("O") && b3.getContent().equals("O") && c3.getContent().equals("O"))) {
            a3.setFiller("*", a3.getContent());
            b3.setFiller("*", b3.getContent());
            c3.setFiller("*", c3.getContent());
            return true;
        } else if ((a1.getContent().equals("X") && b2.getContent().equals("X") && c3.getContent().equals("X")) || (a1.getContent().equals("O") && b2.getContent().equals("O") && c3.getContent().equals("O"))) {
            a1.setFiller("*", a1.getContent());
            b2.setFiller("*", b2.getContent());
            c3.setFiller("*", c3.getContent());
            return true;
        } else if ((a3.getContent().equals("X") && b2.getContent().equals("X") && c1.getContent().equals("X")) || (a3.getContent().equals("O") && b2.getContent().equals("O") && c1.getContent().equals("O"))) {
            a3.setFiller("*", a3.getContent());
            b2.setFiller("*", b2.getContent());
            c1.setFiller("*", c1.getContent());
            return true;
        } else {
            return false;
        }
    }

    private static void gameWon(Player winner) {
        System.out.println("Congratulations! " + winner.getName() + " is the winner!!!");

    }

    public static void main(String[] args) {
        Player winningPlayer;
        boolean hasWon;
        int count = 1;
        startGame();
        printGameBoard();
        do {
            switch (count) {
                case 1:
                    winningPlayer = playerTurn(player1);
                    count++;
                    break;
                case 2:
                    winningPlayer = playerTurn(player2);
                    count--;
                    break;
                default:
                    winningPlayer = new Player(null, null);
            }
            printGameBoard();
            hasWon = checkIfWon();
        } while (!hasWon);
        printGameBoard();
        gameWon(winningPlayer);

    }

}