public class TicTacToe {
    /*
    0 = empty
    1 = X
    2 = O
     */
    final private int[] places = {0, 0, 0, 0, 0, 0, 0, 0, 0};

    public void set(int index, int value) {
        if (places[index] != 0) {
            return;
        }
        places[index] = value;
    }

    public int get(int index) {
        return places[index];
    }

    public int getPlacesLength() {
        return places.length;
    }

    public void print() {
        for (int i = 0; i < places.length; i++) {
            if (i % 3 == 0) {
                System.out.println();
            }
            System.out.print(switch (places[i])  {
                case 1 -> "X";
                case 2 -> "O";
                default -> "•";
            } + " ");
        }
        System.out.println();
    }

    public String getWinner() {
        if (places[0] == places[1] && places[1] == places[2]) {
            if (places[0] == 0) {
                return "DRAW";
            }
            return places[0] == 1 ? "X" : "O";
        }
        if (places[3] == places[4] && places[4] == places[5]) {
            if (places[3] == 0) {
                return "DRAW";
            }
            return places[3] == 1 ? "X" : "O";
        }
        if (places[6] == places[7] && places[7] == places[8]) {
            if (places[6] == 0) {
                return "DRAW";
            }
            return places[6] == 1 ? "X" : "O";
        }
        if (places[0] == places[3] && places[3] == places[6]) {
            if (places[0] == 0) {
                return "DRAW";
            }
            return places[0] == 1 ? "X" : "O";
        }
        if (places[1] == places[4] && places[4] == places[7]) {
            if (places[1] == 0) {
                return "DRAW";
            }
            return places[1] == 1 ? "X" : "O";
        }
        if (places[2] == places[5] && places[5] == places[8]) {
            if (places[2] == 0) {
                return "DRAW";
            }
            return places[2] == 1 ? "X" : "O";
        }
        if (places[0] == places[4] && places[4] == places[8]) {
            if (places[0] == 0) {
                return "DRAW";
            }
            return places[0] == 1 ? "X" : "O";
        }
        if (places[2] == places[4] && places[4] == places[6]) {
            if (places[2] == 0) {
                return "DRAW";
            }
            return places[2] == 1 ? "X" : "O";
        }

        return "DRAW";
    }
}
