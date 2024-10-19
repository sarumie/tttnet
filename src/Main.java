import java.util.Objects;

public class Main {
    static String inp, winner;
    static int startPlayer, idx, currentPlayer, inpPosition;

    public static void main(String[] args) {
        while (true) {
            System.out.println("Tic tac toe game");
            TicTacToe game = new TicTacToe();

//          set start player
            while (true) {
                System.out.println("Who will start the game? (X/O)");
                inp = System.console().readLine();
                if (inp.equals("X") || inp.equals("O") || inp.equals("x") || inp.equals("o")) {
                    startPlayer = inp.equals("X") || inp.equals("x") ? 1 : 2;
                    break;
                }
            }

//          start
            for (idx = 0; idx < game.getPlacesLength(); idx++) {
                currentPlayer = (startPlayer + idx) % 2 == 0 ? 2 : 1;
                game.print();
                System.out.println("Player " + (currentPlayer == 2 ? "O" : "X") + " turn");
                while (true) {
                    System.out.println("Enter the position (1 - 9): ");
                    inpPosition = Integer.parseInt(System.console().readLine());
                    if (inpPosition < 1 || inpPosition > 9) {
                        System.out.println("Invalid position");
                        continue;
                    }
                    if (game.get(inpPosition - 1) != 0) {
                        System.out.println("Position already taken");
                        continue;
                    }
                    break;
                }
                game.set(inpPosition - 1, currentPlayer);
                winner = game.getWinner();
                if (!Objects.equals(winner, "DRAW")) {
                    break;
                }
            }

            game.print();
            if (Objects.equals(winner, "DRAW")) {
                System.out.println("The game is draw");
            } else {
                System.out.println("\uD83D\uDC51 \uD83D\uDC51 \uD83D\uDC51 \uD83D\uDC51 \uD83D\uDC51 \uD83D\uDC51 \uD83D\uDC51\n" +
                        "The winner is player " + winner + "\n" +
                        "\uD83D\uDC51 \uD83D\uDC51 \uD83D\uDC51 \uD83D\uDC51 \uD83D\uDC51 \uD83D\uDC51 \uD83D\uDC51\n");
            }

            System.out.println("Play again? (y/n)");
            inp = System.console().readLine();
            if (inp.equals("n") || inp.equals("N")) {
                break;
            }

            System.out.println("\n\n\n\n");
        }
    }
}
