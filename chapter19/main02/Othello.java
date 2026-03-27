package sukkiri.chapter19.main02;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Othello extends JFrame{
	
	private static final int SIZE = 8;
    private JButton[][] buttons = new JButton[SIZE][SIZE];
    private char[][] board = new char[SIZE][SIZE];
    private char currentPlayer = 'B'; // B=黒, W=白

    public Othello() {
        setTitle("オセロ");
        setSize(600, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(SIZE, SIZE));

        initBoard();

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                buttons[i][j] = new JButton();
                buttons[i][j].setFont(new Font("Arial", Font.BOLD, 30));
                buttons[i][j].addActionListener(new ButtonListener(i, j));
                add(buttons[i][j]);
            }
        }

        updateBoard();
        setVisible(true);
    }

    void initBoard() {
        for (int i = 0; i < SIZE; i++)
            for (int j = 0; j < SIZE; j++)
                board[i][j] = '.';

        board[3][3] = 'W';
        board[3][4] = 'B';
        board[4][3] = 'B';
        board[4][4] = 'W';
    }

    void updateBoard() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (board[i][j] == 'B') {
                    buttons[i][j].setText("●");
                } else if (board[i][j] == 'W') {
                    buttons[i][j].setText("○");
                } else {
                    buttons[i][j].setText("");
                }
            }
        }
    }

    boolean isValidMove(int row, int col) {
        if (board[row][col] != '.') return false;

        char opponent = (currentPlayer == 'B') ? 'W' : 'B';

        for (int dx = -1; dx <= 1; dx++) {
            for (int dy = -1; dy <= 1; dy++) {
                if (dx == 0 && dy == 0) continue;

                int x = row + dx;
                int y = col + dy;
                boolean hasOpponent = false;

                while (x >= 0 && x < SIZE && y >= 0 && y < SIZE && board[x][y] == opponent) {
                    x += dx;
                    y += dy;
                    hasOpponent = true;
                }

                if (hasOpponent && x >= 0 && x < SIZE && y >= 0 && y < SIZE
                        && board[x][y] == currentPlayer) {
                    return true;
                }
            }
        }
        return false;
    }

    void placeStone(int row, int col) {
        board[row][col] = currentPlayer;
        char opponent = (currentPlayer == 'B') ? 'W' : 'B';

        for (int dx = -1; dx <= 1; dx++) {
            for (int dy = -1; dy <= 1; dy++) {
                if (dx == 0 && dy == 0) continue;

                int x = row + dx;
                int y = col + dy;
                boolean hasOpponent = false;

                while (x >= 0 && x < SIZE && y >= 0 && y < SIZE && board[x][y] == opponent) {
                    x += dx;
                    y += dy;
                    hasOpponent = true;
                }

                if (hasOpponent && x >= 0 && x < SIZE && y >= 0 && y < SIZE
                        && board[x][y] == currentPlayer) {

                    int flipX = row + dx;
                    int flipY = col + dy;

                    while (board[flipX][flipY] == opponent) {
                        board[flipX][flipY] = currentPlayer;
                        flipX += dx;
                        flipY += dy;
                    }
                }
            }
        }
    }

    class ButtonListener implements ActionListener {
        int row, col;

        ButtonListener(int r, int c) {
            row = r;
            col = c;
        }

        public void actionPerformed(ActionEvent e) {
            if (isValidMove(row, col)) {
                placeStone(row, col);
                currentPlayer = (currentPlayer == 'B') ? 'W' : 'B';
                updateBoard();
            } else {
                JOptionPane.showMessageDialog(null, "そこには置けません！");
            }
        }
    }

    public static void main(String[] args) {
        new Othello();
    }
}

