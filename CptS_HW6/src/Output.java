import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;


public class Output extends JFrame implements ActionListener {

    int size = 19;
    boolean cellsMap[][];
    JButton cells[][];

    private JButton start,stop;
    private JLabel label;
    private JTextField textArea;


    public Output() {
        //Random number generator object
        Random random = new Random();

        //two dimensional arrays
        cellsMap = new boolean[size][size];
        cells = new JButton[size][size];

        //Create Dimensions
        setSize(500, 500);
        setLayout(new GridLayout(size, size));


        //generate board with random cells
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < 19; j++) {
                cellsMap[i][j] = random.nextInt(38) < 11;
                JButton temp = new JButton();
                if (cellsMap[i][j]) {
                    temp.setBackground(Color.BLACK);
                } else {
                    temp.setBackground(Color.LIGHT_GRAY);
                }
                add(temp);
                cells[i][j] = temp;
            }
        }

        //Set board visible
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        //Button Window
        JFrame frame = new JFrame("Game of Life");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 90);
        JPanel panel = new JPanel();
        frame.add(panel);

        //Button Label
        label = new JLabel("Generations per Minute:");
        panel.add(label);

        //Button text box
        textArea = new JTextField("60", 10);
        panel.add(textArea);
        textArea.setEditable(true);

        //start button
        start = new JButton("Start");
        start.addActionListener(this);
        panel.add(start);

        //stop button
        stop = new JButton("Stop");
        stop.addActionListener(this);
        panel.add(stop);


    }




    //count how many alive cells are next to each other
    int countNeighbors(int x, int y) {
        int count = 0;

        for (int i = x - 1; i <= x + 1; i++) {
            for (int j = y - 1; j <= y + 1; j++) {

                try {
                    if (cellsMap[i][j]) {
                        count++;
                    }
                } catch (Exception e) {
                }
            }
        }
        if (cellsMap[x][y]) {
            count--;
        }
        return count;
    }





    //sets the frequency of generation iterations
    Timer timer = new Timer(1000, new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {

            //temporary array
            boolean[][] temp = new boolean[size][size];

            //game of life rules
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < 19; j++) {
                    int count = countNeighbors(i, j);

                    if (cellsMap[i][j]) {
                        if (count < 2) {
                            temp[i][j] = false;
                        }

                        if (count == 3 || count == 2) {
                            temp[i][j] = true;
                        }

                        if (count > 3) {
                            temp[i][j] = false;
                        }

                    } else {
                        if (count == 3) {
                            temp[i][j] = true;
                        }
                    }
                }
            }

            cellsMap = temp;

            //populates board with alive and dead cells
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < 19; j++) {
                    if (cellsMap[i][j]) {
                        cells[i][j].setBackground(Color.BLACK);
                    } else {
                        cells[i][j].setBackground(Color.WHITE);
                    }
                }
            }

        }
    });

    @Override
    public void actionPerformed(ActionEvent e) {

        //get a number in the form of a string from text box
        String input = textArea.getText();
        //convert string to int
        double inputToDouble = Double.parseDouble(input);
        //convert int milliseconds
        inputToDouble = inputToDouble;
        //timer delays each iteration in milliseconds
        timer.setDelay((int) (60000/(inputToDouble)));


        //starts timer when start button is clicked
        if(e.getSource() == start){
            timer.start();

        }

        //stop timer when stop button is clicked
        else if (e.getSource() == stop){
            timer.stop();
        }

    }




    //output game of life
    public static void main(String[] args) {
        new Output();
    }

}