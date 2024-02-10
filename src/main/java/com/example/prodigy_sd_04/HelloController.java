package com.example.prodigy_sd_04;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

import java.util.Objects;

public class HelloController {

    @FXML
    private TextField cell00;

    @FXML
    private TextField cell01;

    @FXML
    private TextField cell02;

    @FXML
    private TextField cell03;

    @FXML
    private TextField cell04;

    @FXML
    private TextField cell05;

    @FXML
    private TextField cell06;

    @FXML
    private TextField cell07;

    @FXML
    private TextField cell08;

    @FXML
    private TextField cell10;

    @FXML
    private TextField cell11;

    @FXML
    private TextField cell12;

    @FXML
    private TextField cell13;

    @FXML
    private TextField cell14;

    @FXML
    private TextField cell15;

    @FXML
    private TextField cell16;

    @FXML
    private TextField cell17;

    @FXML
    private TextField cell18;

    @FXML
    private TextField cell20;

    @FXML
    private TextField cell21;

    @FXML
    private TextField cell22;

    @FXML
    private TextField cell23;

    @FXML
    private TextField cell24;

    @FXML
    private TextField cell25;

    @FXML
    private TextField cell26;

    @FXML
    private TextField cell27;

    @FXML
    private TextField cell28;

    @FXML
    private TextField cell30;

    @FXML
    private TextField cell31;

    @FXML
    private TextField cell32;

    @FXML
    private TextField cell33;

    @FXML
    private TextField cell34;

    @FXML
    private TextField cell35;

    @FXML
    private TextField cell36;

    @FXML
    private TextField cell37;

    @FXML
    private TextField cell38;

    @FXML
    private TextField cell40;

    @FXML
    private TextField cell41;

    @FXML
    private TextField cell42;

    @FXML
    private TextField cell43;

    @FXML
    private TextField cell44;

    @FXML
    private TextField cell45;

    @FXML
    private TextField cell46;

    @FXML
    private TextField cell47;

    @FXML
    private TextField cell48;

    @FXML
    private TextField cell50;

    @FXML
    private TextField cell51;

    @FXML
    private TextField cell52;

    @FXML
    private TextField cell53;

    @FXML
    private TextField cell54;

    @FXML
    private TextField cell55;

    @FXML
    private TextField cell56;

    @FXML
    private TextField cell57;

    @FXML
    private TextField cell58;

    @FXML
    private TextField cell60;

    @FXML
    private TextField cell61;

    @FXML
    private TextField cell62;

    @FXML
    private TextField cell63;

    @FXML
    private TextField cell64;

    @FXML
    private TextField cell65;

    @FXML
    private TextField cell66;

    @FXML
    private TextField cell67;

    @FXML
    private TextField cell68;

    @FXML
    private TextField cell70;

    @FXML
    private TextField cell71;

    @FXML
    private TextField cell72;

    @FXML
    private TextField cell73;

    @FXML
    private TextField cell74;

    @FXML
    private TextField cell75;

    @FXML
    private TextField cell76;

    @FXML
    private TextField cell77;

    @FXML
    private TextField cell78;

    @FXML
    private TextField cell80;

    @FXML
    private TextField cell81;

    @FXML
    private TextField cell82;

    @FXML
    private TextField cell83;

    @FXML
    private TextField cell84;

    @FXML
    private TextField cell85;

    @FXML
    private TextField cell86;

    @FXML
    private TextField cell87;

    @FXML
    private TextField cell88;

    @FXML
    private Text message;

    @FXML
    void clear(MouseEvent event) {
        cell00.clear();
        cell01.clear();
        cell02.clear();
        cell03.clear();
        cell04.clear();
        cell05.clear();
        cell06.clear();
        cell07.clear();
        cell08.clear();

        cell10.clear();
        cell11.clear();
        cell12.clear();
        cell13.clear();
        cell14.clear();
        cell15.clear();
        cell16.clear();
        cell17.clear();
        cell18.clear();

        cell20.clear();
        cell21.clear();
        cell22.clear();
        cell23.clear();
        cell24.clear();
        cell25.clear();
        cell26.clear();
        cell27.clear();
        cell28.clear();

        cell30.clear();
        cell31.clear();
        cell32.clear();
        cell33.clear();
        cell34.clear();
        cell35.clear();
        cell36.clear();
        cell37.clear();
        cell38.clear();

        cell40.clear();
        cell41.clear();
        cell42.clear();
        cell43.clear();
        cell44.clear();
        cell45.clear();
        cell46.clear();
        cell47.clear();
        cell48.clear();

        cell50.clear();
        cell51.clear();
        cell52.clear();
        cell53.clear();
        cell54.clear();
        cell55.clear();
        cell56.clear();
        cell57.clear();
        cell58.clear();

        cell60.clear();
        cell61.clear();
        cell62.clear();
        cell63.clear();
        cell64.clear();
        cell65.clear();
        cell66.clear();
        cell67.clear();
        cell68.clear();

        cell70.clear();
        cell71.clear();
        cell72.clear();
        cell73.clear();
        cell74.clear();
        cell75.clear();
        cell76.clear();
        cell77.clear();
        cell78.clear();

        cell80.clear();
        cell81.clear();
        cell82.clear();
        cell83.clear();
        cell84.clear();
        cell85.clear();
        cell86.clear();
        cell87.clear();
        cell88.clear();
    }

    @FXML
    void solve(MouseEvent event) {
        int[][] grid = new int[9][9];

        if(Objects.equals(cell00.getText(), ""))
            grid[0][0] = 0;
        else
            grid[0][0] = Integer.parseInt(cell00.getText());

        if(Objects.equals(cell01.getText(), ""))
            grid[0][1] = 0;
        else
            grid[0][1] = Integer.parseInt(cell01.getText());

        if(Objects.equals(cell02.getText(), ""))
            grid[0][2] = 0;
        else
            grid[0][2] = Integer.parseInt(cell02.getText());

        if(Objects.equals(cell03.getText(), ""))
            grid[0][3] = 0;
        else
            grid[0][3] = Integer.parseInt(cell03.getText());

        if(Objects.equals(cell04.getText(), ""))
            grid[0][4] = 0;
        else
            grid[0][4] = Integer.parseInt(cell04.getText());

        if(Objects.equals(cell05.getText(), ""))
            grid[0][5] = 0;
        else
            grid[0][5] = Integer.parseInt(cell05.getText());

        if(Objects.equals(cell06.getText(), ""))
            grid[0][6] = 0;
        else
            grid[0][6] = Integer.parseInt(cell06.getText());

        if(Objects.equals(cell07.getText(), ""))
            grid[0][7] = 0;
        else
            grid[0][7] = Integer.parseInt(cell07.getText());

        if(Objects.equals(cell08.getText(), ""))
            grid[0][8] = 0;
        else
            grid[0][8] = Integer.parseInt(cell08.getText());

        if(Objects.equals(cell10.getText(), ""))
            grid[1][0] = 0;
        else
            grid[1][0] = Integer.parseInt(cell10.getText());

        if(Objects.equals(cell11.getText(), ""))
            grid[1][1] = 0;
        else
            grid[1][1] = Integer.parseInt(cell11.getText());

        if(Objects.equals(cell12.getText(), ""))
            grid[1][2] = 0;
        else
            grid[1][2] = Integer.parseInt(cell12.getText());

        if(Objects.equals(cell13.getText(), ""))
            grid[1][3] = 0;
        else
            grid[1][3] = Integer.parseInt(cell13.getText());

        if(Objects.equals(cell14.getText(), ""))
            grid[1][4] = 0;
        else
            grid[1][4] = Integer.parseInt(cell14.getText());

        if(Objects.equals(cell15.getText(), ""))
            grid[1][5] = 0;
        else
            grid[1][5] = Integer.parseInt(cell15.getText());

        if(Objects.equals(cell16.getText(), ""))
            grid[1][6] = 0;
        else
            grid[1][6] = Integer.parseInt(cell16.getText());

        if(Objects.equals(cell17.getText(), ""))
            grid[1][7] = 0;
        else
            grid[1][7] = Integer.parseInt(cell17.getText());

        if(Objects.equals(cell18.getText(), ""))
            grid[1][8] = 0;
        else
            grid[1][8] = Integer.parseInt(cell18.getText());

        if(Objects.equals(cell20.getText(), ""))
            grid[2][0] = 0;
        else
            grid[2][0] = Integer.parseInt(cell20.getText());

        if(Objects.equals(cell21.getText(), ""))
            grid[2][1] = 0;
        else
            grid[2][1] = Integer.parseInt(cell21.getText());

        if(Objects.equals(cell22.getText(), ""))
            grid[2][2] = 0;
        else
            grid[2][2] = Integer.parseInt(cell22.getText());

        if(Objects.equals(cell23.getText(), ""))
            grid[2][3] = 0;
        else
            grid[2][3] = Integer.parseInt(cell23.getText());

        if(Objects.equals(cell24.getText(), ""))
            grid[2][4] = 0;
        else
            grid[2][4] = Integer.parseInt(cell24.getText());

        if(Objects.equals(cell25.getText(), ""))
            grid[2][5] = 0;
        else
            grid[2][5] = Integer.parseInt(cell25.getText());

        if(Objects.equals(cell26.getText(), ""))
            grid[2][6] = 0;
        else
            grid[2][6] = Integer.parseInt(cell26.getText());

        if(Objects.equals(cell27.getText(), ""))
            grid[2][7] = 0;
        else
            grid[2][7] = Integer.parseInt(cell27.getText());

        if(Objects.equals(cell28.getText(), ""))
            grid[2][8] = 0;
        else
            grid[2][8] = Integer.parseInt(cell28.getText());

        if(Objects.equals(cell30.getText(), ""))
            grid[3][0] = 0;
        else
            grid[3][0] = Integer.parseInt(cell30.getText());

        if(Objects.equals(cell31.getText(), ""))
            grid[3][1] = 0;
        else
            grid[3][1] = Integer.parseInt(cell31.getText());

        if(Objects.equals(cell32.getText(), ""))
            grid[3][2] = 0;
        else
            grid[3][2] = Integer.parseInt(cell32.getText());

        if(Objects.equals(cell33.getText(), ""))
            grid[3][3] = 0;
        else
            grid[3][3] = Integer.parseInt(cell33.getText());

        if(Objects.equals(cell34.getText(), ""))
            grid[3][4] = 0;
        else
            grid[3][4] = Integer.parseInt(cell34.getText());

        if(Objects.equals(cell35.getText(), ""))
            grid[3][5] = 0;
        else
            grid[3][5] = Integer.parseInt(cell35.getText());

        if(Objects.equals(cell36.getText(), ""))
            grid[3][6] = 0;
        else
            grid[3][6] = Integer.parseInt(cell36.getText());

        if(Objects.equals(cell37.getText(), ""))
            grid[3][7] = 0;
        else
            grid[3][7] = Integer.parseInt(cell37.getText());

        if(Objects.equals(cell38.getText(), ""))
            grid[3][8] = 0;
        else
            grid[3][8] = Integer.parseInt(cell38.getText());

        if(Objects.equals(cell40.getText(), ""))
            grid[4][0] = 0;
        else
            grid[4][0] = Integer.parseInt(cell40.getText());

        if(Objects.equals(cell41.getText(), ""))
            grid[4][1] = 0;
        else
            grid[4][1] = Integer.parseInt(cell41.getText());

        if(Objects.equals(cell42.getText(), ""))
            grid[4][2] = 0;
        else
            grid[4][2] = Integer.parseInt(cell42.getText());

        if(Objects.equals(cell43.getText(), ""))
            grid[4][3] = 0;
        else
            grid[4][3] = Integer.parseInt(cell43.getText());

        if(Objects.equals(cell44.getText(), ""))
            grid[4][4] = 0;
        else
            grid[4][4] = Integer.parseInt(cell44.getText());

        if(Objects.equals(cell45.getText(), ""))
            grid[4][5] = 0;
        else
            grid[4][5] = Integer.parseInt(cell45.getText());

        if(Objects.equals(cell46.getText(), ""))
            grid[4][6] = 0;
        else
            grid[4][6] = Integer.parseInt(cell46.getText());

        if(Objects.equals(cell47.getText(), ""))
            grid[4][7] = 0;
        else
            grid[4][7] = Integer.parseInt(cell47.getText());

        if(Objects.equals(cell48.getText(), ""))
            grid[4][8] = 0;
        else
            grid[4][8] = Integer.parseInt(cell48.getText());

        if(Objects.equals(cell50.getText(), ""))
            grid[5][0] = 0;
        else
            grid[5][0] = Integer.parseInt(cell50.getText());

        if(Objects.equals(cell51.getText(), ""))
            grid[5][1] = 0;
        else
            grid[5][1] = Integer.parseInt(cell51.getText());

        if(Objects.equals(cell52.getText(), ""))
            grid[5][2] = 0;
        else
            grid[5][2] = Integer.parseInt(cell52.getText());

        if(Objects.equals(cell53.getText(), ""))
            grid[5][3] = 0;
        else
            grid[5][3] = Integer.parseInt(cell53.getText());

        if(Objects.equals(cell54.getText(), ""))
            grid[5][4] = 0;
        else
            grid[5][4] = Integer.parseInt(cell54.getText());

        if(Objects.equals(cell55.getText(), ""))
            grid[5][5] = 0;
        else
            grid[5][5] = Integer.parseInt(cell55.getText());

        if(Objects.equals(cell56.getText(), ""))
            grid[5][6] = 0;
        else
            grid[5][6] = Integer.parseInt(cell56.getText());

        if(Objects.equals(cell57.getText(), ""))
            grid[5][7] = 0;
        else
            grid[5][7] = Integer.parseInt(cell57.getText());

        if(Objects.equals(cell58.getText(), ""))
            grid[5][8] = 0;
        else
            grid[5][8] = Integer.parseInt(cell58.getText());

        if(Objects.equals(cell60.getText(), ""))
            grid[6][0] = 0;
        else
            grid[6][0] = Integer.parseInt(cell60.getText());

        if(Objects.equals(cell61.getText(), ""))
            grid[6][1] = 0;
        else
            grid[6][1] = Integer.parseInt(cell61.getText());

        if(Objects.equals(cell62.getText(), ""))
            grid[6][2] = 0;
        else
            grid[6][2] = Integer.parseInt(cell62.getText());

        if(Objects.equals(cell63.getText(), ""))
            grid[6][3] = 0;
        else
            grid[6][3] = Integer.parseInt(cell63.getText());

        if(Objects.equals(cell64.getText(), ""))
            grid[6][4] = 0;
        else
            grid[6][4] = Integer.parseInt(cell64.getText());

        if(Objects.equals(cell65.getText(), ""))
            grid[6][5] = 0;
        else
            grid[6][5] = Integer.parseInt(cell65.getText());

        if(Objects.equals(cell66.getText(), ""))
            grid[6][6] = 0;
        else
            grid[6][6] = Integer.parseInt(cell66.getText());

        if(Objects.equals(cell67.getText(), ""))
            grid[6][7] = 0;
        else
            grid[6][7] = Integer.parseInt(cell67.getText());

        if(Objects.equals(cell68.getText(), ""))
            grid[6][8] = 0;
        else
            grid[6][8] = Integer.parseInt(cell68.getText());

        if(Objects.equals(cell70.getText(), ""))
            grid[7][0] = 0;
        else
            grid[7][0] = Integer.parseInt(cell70.getText());

        if(Objects.equals(cell71.getText(), ""))
            grid[7][1] = 0;
        else
            grid[7][1] = Integer.parseInt(cell71.getText());

        if(Objects.equals(cell72.getText(), ""))
            grid[7][2] = 0;
        else
            grid[7][2] = Integer.parseInt(cell72.getText());

        if(Objects.equals(cell73.getText(), ""))
            grid[7][3] = 0;
        else
            grid[7][3] = Integer.parseInt(cell73.getText());

        if(Objects.equals(cell74.getText(), ""))
            grid[7][4] = 0;
        else
            grid[7][4] = Integer.parseInt(cell74.getText());

        if(Objects.equals(cell75.getText(), ""))
            grid[7][5] = 0;
        else
            grid[7][5] = Integer.parseInt(cell75.getText());

        if(Objects.equals(cell76.getText(), ""))
            grid[7][6] = 0;
        else
            grid[7][6] = Integer.parseInt(cell76.getText());

        if(Objects.equals(cell77.getText(), ""))
            grid[7][7] = 0;
        else
            grid[7][7] = Integer.parseInt(cell77.getText());

        if(Objects.equals(cell78.getText(), ""))
            grid[7][8] = 0;
        else
            grid[7][8] = Integer.parseInt(cell78.getText());

        if(Objects.equals(cell80.getText(), ""))
            grid[8][0] = 0;
        else
            grid[8][0] = Integer.parseInt(cell80.getText());

        if(Objects.equals(cell81.getText(), ""))
            grid[8][1] = 0;
        else
            grid[8][1] = Integer.parseInt(cell81.getText());

        if(Objects.equals(cell82.getText(), ""))
            grid[8][2] = 0;
        else
            grid[8][2] = Integer.parseInt(cell82.getText());

        if(Objects.equals(cell83.getText(), ""))
            grid[8][3] = 0;
        else
            grid[8][3] = Integer.parseInt(cell83.getText());

        if(Objects.equals(cell84.getText(), ""))
            grid[8][4] = 0;
        else
            grid[8][4] = Integer.parseInt(cell84.getText());

        if(Objects.equals(cell85.getText(), ""))
            grid [8][5] = 0;
        else
            grid[8][5] = Integer.parseInt(cell85.getText());

        if(Objects.equals(cell86.getText(), ""))
            grid[8][6] = 0;
        else
            grid[8][6] = Integer.parseInt(cell86.getText());

        if(Objects.equals(cell87.getText(), ""))
            grid[8][7] = 0;
        else
            grid[8][7] = Integer.parseInt(cell87.getText());

        if(Objects.equals(cell88.getText(), ""))
            grid [8][8] = 0;
        else
            grid[8][8] = Integer.parseInt(cell88.getText());

        Solver solver = new Solver();
        if (solver.solveSudoku(grid, 9)){
            message.setText("Solved");

            cell00.setText(String.valueOf(grid[0][0]));
            cell01.setText(String.valueOf(grid[0][1]));
            cell02.setText(String.valueOf(grid[0][2]));
            cell03.setText(String.valueOf(grid[0][3]));
            cell04.setText(String.valueOf(grid[0][4]));
            cell05.setText(String.valueOf(grid[0][5]));
            cell06.setText(String.valueOf(grid[0][6]));
            cell07.setText(String.valueOf(grid[0][7]));
            cell08.setText(String.valueOf(grid[0][8]));

            cell10.setText(String.valueOf(grid[1][0]));
            cell11.setText(String.valueOf(grid[1][1]));
            cell12.setText(String.valueOf(grid[1][2]));
            cell13.setText(String.valueOf(grid[1][3]));
            cell14.setText(String.valueOf(grid[1][4]));
            cell15.setText(String.valueOf(grid[1][5]));
            cell16.setText(String.valueOf(grid[1][6]));
            cell17.setText(String.valueOf(grid[1][7]));
            cell18.setText(String.valueOf(grid[1][8]));

            cell20.setText(String.valueOf(grid[2][0]));
            cell21.setText(String.valueOf(grid[2][1]));
            cell22.setText(String.valueOf(grid[2][2]));
            cell23.setText(String.valueOf(grid[2][3]));
            cell24.setText(String.valueOf(grid[2][4]));
            cell25.setText(String.valueOf(grid[2][5]));
            cell26.setText(String.valueOf(grid[2][6]));
            cell27.setText(String.valueOf(grid[2][7]));
            cell28.setText(String.valueOf(grid[2][8]));

            cell30.setText(String.valueOf(grid[3][0]));
            cell31.setText(String.valueOf(grid[3][1]));
            cell32.setText(String.valueOf(grid[3][2]));
            cell33.setText(String.valueOf(grid[3][3]));
            cell34.setText(String.valueOf(grid[3][4]));
            cell35.setText(String.valueOf(grid[3][5]));
            cell36.setText(String.valueOf(grid[3][6]));
            cell37.setText(String.valueOf(grid[3][7]));
            cell38.setText(String.valueOf(grid[3][8]));

            cell40.setText(String.valueOf(grid[4][0]));
            cell41.setText(String.valueOf(grid[4][1]));
            cell42.setText(String.valueOf(grid[4][2]));
            cell43.setText(String.valueOf(grid[4][3]));
            cell44.setText(String.valueOf(grid[4][4]));
            cell45.setText(String.valueOf(grid[4][5]));
            cell46.setText(String.valueOf(grid[4][6]));
            cell47.setText(String.valueOf(grid[4][7]));
            cell48.setText(String.valueOf(grid[4][8]));

            cell50.setText(String.valueOf(grid[5][0]));
            cell51.setText(String.valueOf(grid[5][1]));
            cell52.setText(String.valueOf(grid[5][2]));
            cell53.setText(String.valueOf(grid[5][3]));
            cell54.setText(String.valueOf(grid[5][4]));
            cell55.setText(String.valueOf(grid[5][5]));
            cell56.setText(String.valueOf(grid[5][6]));
            cell57.setText(String.valueOf(grid[5][7]));
            cell58.setText(String.valueOf(grid[5][8]));

            cell60.setText(String.valueOf(grid[6][0]));
            cell61.setText(String.valueOf(grid[6][1]));
            cell62.setText(String.valueOf(grid[6][2]));
            cell63.setText(String.valueOf(grid[6][3]));
            cell64.setText(String.valueOf(grid[6][4]));
            cell65.setText(String.valueOf(grid[6][5]));
            cell66.setText(String.valueOf(grid[6][6]));
            cell67.setText(String.valueOf(grid[6][7]));
            cell68.setText(String.valueOf(grid[6][8]));

            cell70.setText(String.valueOf(grid[7][0]));
            cell71.setText(String.valueOf(grid[7][1]));
            cell72.setText(String.valueOf(grid[7][2]));
            cell73.setText(String.valueOf(grid[7][3]));
            cell74.setText(String.valueOf(grid[7][4]));
            cell75.setText(String.valueOf(grid[7][5]));
            cell76.setText(String.valueOf(grid[7][6]));
            cell77.setText(String.valueOf(grid[7][7]));
            cell78.setText(String.valueOf(grid[7][8]));

            cell80.setText(String.valueOf(grid[8][0]));
            cell81.setText(String.valueOf(grid[8][1]));
            cell82.setText(String.valueOf(grid[8][2]));
            cell83.setText(String.valueOf(grid[8][3]));
            cell84.setText(String.valueOf(grid[8][4]));
            cell85.setText(String.valueOf(grid[8][5]));
            cell86.setText(String.valueOf(grid[8][6]));
            cell87.setText(String.valueOf(grid[8][7]));
            cell88.setText(String.valueOf(grid[8][8]));
        }
        else
            message.setText("Unsolvable");
    }

}