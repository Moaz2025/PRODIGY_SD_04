package com.example.prodigy_sd_04;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.util.Arrays;
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
    void solve(MouseEvent event) {
        int[][] grid = new int[9][9];

        if(Objects.equals(cell00.getText(), ""))
            grid [0][0] = 0;
        else
            grid [0][0] = Integer.parseInt(cell00.getText());

        if(Objects.equals(cell01.getText(), ""))
            grid [0][1] = 0;
        else
            grid[0][1] = Integer.parseInt(cell01.getText());

        if(Objects.equals(cell02.getText(), ""))
            grid [0][2] = 0;
        else
            grid[0][2] = Integer.parseInt(cell02.getText());

        if(Objects.equals(cell03.getText(), ""))
            grid [0][3] = 0;
        else
            grid[0][3] = Integer.parseInt(cell03.getText());

        if(Objects.equals(cell04.getText(), ""))
            grid [0][4] = 0;
        else
            grid[0][4] = Integer.parseInt(cell04.getText());

        if(Objects.equals(cell05.getText(), ""))
            grid [0][5] = 0;
        else
            grid[0][5] = Integer.parseInt(cell05.getText());

        if(Objects.equals(cell06.getText(), ""))
            grid [0][6] = 0;
        else
            grid[0][6] = Integer.parseInt(cell06.getText());

        if(Objects.equals(cell07.getText(), ""))
            grid [0][7] = 0;
        else
            grid[0][7] = Integer.parseInt(cell07.getText());

        if(Objects.equals(cell08.getText(), ""))
            grid [0][8] = 0;
        else
            grid[0][8] = Integer.parseInt(cell08.getText());

        if(Objects.equals(cell10.getText(), ""))
            grid [1][0] = 0;
        else
            grid [1][0] = Integer.parseInt(cell10.getText());

        if(Objects.equals(cell11.getText(), ""))
            grid [1][1] = 0;
        else
            grid[1][1] = Integer.parseInt(cell11.getText());

        if(Objects.equals(cell12.getText(), ""))
            grid [1][2] = 0;
        else
            grid[1][2] = Integer.parseInt(cell12.getText());

        if(Objects.equals(cell13.getText(), ""))
            grid [1][3] = 0;
        else
            grid[1][3] = Integer.parseInt(cell13.getText());

        if(Objects.equals(cell14.getText(), ""))
            grid [1][4] = 0;
        else
            grid[1][4] = Integer.parseInt(cell14.getText());

        if(Objects.equals(cell15.getText(), ""))
            grid [1][5] = 0;
        else
            grid[1][5] = Integer.parseInt(cell15.getText());

        if(Objects.equals(cell16.getText(), ""))
            grid [1][6] = 0;
        else
            grid[1][6] = Integer.parseInt(cell16.getText());

        if(Objects.equals(cell17.getText(), ""))
            grid [1][7] = 0;
        else
            grid[1][7] = Integer.parseInt(cell17.getText());

        if(Objects.equals(cell18.getText(), ""))
            grid [1][8] = 0;
        else
            grid[1][8] = Integer.parseInt(cell18.getText());

        if(Objects.equals(cell20.getText(), ""))
            grid [2][0] = 0;
        else
            grid [2][0] = Integer.parseInt(cell20.getText());

        if(Objects.equals(cell21.getText(), ""))
            grid [2][1] = 0;
        else
            grid[2][1] = Integer.parseInt(cell21.getText());

        if(Objects.equals(cell22.getText(), ""))
            grid [2][2] = 0;
        else
            grid[2][2] = Integer.parseInt(cell22.getText());

        if(Objects.equals(cell23.getText(), ""))
            grid [2][3] = 0;
        else
            grid[2][3] = Integer.parseInt(cell23.getText());

        if(Objects.equals(cell24.getText(), ""))
            grid [2][4] = 0;
        else
            grid[2][4] = Integer.parseInt(cell24.getText());

        if(Objects.equals(cell25.getText(), ""))
            grid [2][5] = 0;
        else
            grid[2][5] = Integer.parseInt(cell25.getText());

        if(Objects.equals(cell26.getText(), ""))
            grid [2][6] = 0;
        else
            grid[2][6] = Integer.parseInt(cell26.getText());

        if(Objects.equals(cell27.getText(), ""))
            grid [2][7] = 0;
        else
            grid[2][7] = Integer.parseInt(cell27.getText());

        if(Objects.equals(cell28.getText(), ""))
            grid [2][8] = 0;
        else
            grid[2][8] = Integer.parseInt(cell28.getText());

        if(Objects.equals(cell30.getText(), ""))
            grid [3][0] = 0;
        else
            grid [3][0] = Integer.parseInt(cell30.getText());

        if(Objects.equals(cell31.getText(), ""))
            grid [3][1] = 0;
        else
            grid[3][1] = Integer.parseInt(cell31.getText());

        if(Objects.equals(cell32.getText(), ""))
            grid [3][2] = 0;
        else
            grid[3][2] = Integer.parseInt(cell32.getText());

        if(Objects.equals(cell33.getText(), ""))
            grid [3][3] = 0;
        else
            grid[3][3] = Integer.parseInt(cell33.getText());

        if(Objects.equals(cell34.getText(), ""))
            grid [3][4] = 0;
        else
            grid[3][4] = Integer.parseInt(cell34.getText());

        if(Objects.equals(cell35.getText(), ""))
            grid [3][5] = 0;
        else
            grid[3][5] = Integer.parseInt(cell35.getText());

        if(Objects.equals(cell36.getText(), ""))
            grid [3][6] = 0;
        else
            grid[3][6] = Integer.parseInt(cell36.getText());

        if(Objects.equals(cell37.getText(), ""))
            grid [3][7] = 0;
        else
            grid[3][7] = Integer.parseInt(cell37.getText());

        if(Objects.equals(cell38.getText(), ""))
            grid [3][8] = 0;
        else
            grid[3][8] = Integer.parseInt(cell38.getText());

        if(Objects.equals(cell40.getText(), ""))
            grid [4][0] = 0;
        else
            grid [4][0] = Integer.parseInt(cell40.getText());

        if(Objects.equals(cell41.getText(), ""))
            grid [4][1] = 0;
        else
            grid[4][1] = Integer.parseInt(cell41.getText());

        if(Objects.equals(cell42.getText(), ""))
            grid [4][2] = 0;
        else
            grid[4][2] = Integer.parseInt(cell42.getText());

        if(Objects.equals(cell43.getText(), ""))
            grid [4][3] = 0;
        else
            grid[4][3] = Integer.parseInt(cell43.getText());

        if(Objects.equals(cell44.getText(), ""))
            grid [4][4] = 0;
        else
            grid[4][4] = Integer.parseInt(cell44.getText());

        if(Objects.equals(cell45.getText(), ""))
            grid [4][5] = 0;
        else
            grid[4][5] = Integer.parseInt(cell45.getText());

        if(Objects.equals(cell46.getText(), ""))
            grid [4][6] = 0;
        else
            grid[4][6] = Integer.parseInt(cell46.getText());

        if(Objects.equals(cell47.getText(), ""))
            grid [4][7] = 0;
        else
            grid[4][7] = Integer.parseInt(cell47.getText());

        if(Objects.equals(cell48.getText(), ""))
            grid [4][8] = 0;
        else
            grid[4][8] = Integer.parseInt(cell48.getText());

        if(Objects.equals(cell50.getText(), ""))
            grid [5][0] = 0;
        else
            grid [5][0] = Integer.parseInt(cell50.getText());

        if(Objects.equals(cell51.getText(), ""))
            grid [5][1] = 0;
        else
            grid[5][1] = Integer.parseInt(cell51.getText());

        if(Objects.equals(cell52.getText(), ""))
            grid [5][2] = 0;
        else
            grid[5][2] = Integer.parseInt(cell52.getText());

        if(Objects.equals(cell53.getText(), ""))
            grid [5][3] = 0;
        else
            grid[5][3] = Integer.parseInt(cell53.getText());

        if(Objects.equals(cell54.getText(), ""))
            grid [5][4] = 0;
        else
            grid[5][4] = Integer.parseInt(cell54.getText());

        if(Objects.equals(cell55.getText(), ""))
            grid [5][5] = 0;
        else
            grid[5][5] = Integer.parseInt(cell55.getText());

        if(Objects.equals(cell56.getText(), ""))
            grid [5][6] = 0;
        else
            grid[5][6] = Integer.parseInt(cell56.getText());

        if(Objects.equals(cell57.getText(), ""))
            grid [5][7] = 0;
        else
            grid[5][7] = Integer.parseInt(cell57.getText());

        if(Objects.equals(cell58.getText(), ""))
            grid [5][8] = 0;
        else
            grid[5][8] = Integer.parseInt(cell58.getText());

        if(Objects.equals(cell60.getText(), ""))
            grid [6][0] = 0;
        else
            grid [6][0] = Integer.parseInt(cell60.getText());

        if(Objects.equals(cell61.getText(), ""))
            grid [6][1] = 0;
        else
            grid[6][1] = Integer.parseInt(cell61.getText());

        if(Objects.equals(cell62.getText(), ""))
            grid [6][2] = 0;
        else
            grid[6][2] = Integer.parseInt(cell62.getText());

        if(Objects.equals(cell63.getText(), ""))
            grid [6][3] = 0;
        else
            grid[6][3] = Integer.parseInt(cell63.getText());

        if(Objects.equals(cell64.getText(), ""))
            grid [6][4] = 0;
        else
            grid[6][4] = Integer.parseInt(cell64.getText());

        if(Objects.equals(cell65.getText(), ""))
            grid [6][5] = 0;
        else
            grid[6][5] = Integer.parseInt(cell65.getText());

        if(Objects.equals(cell66.getText(), ""))
            grid [6][6] = 0;
        else
            grid[6][6] = Integer.parseInt(cell66.getText());

        if(Objects.equals(cell67.getText(), ""))
            grid [6][7] = 0;
        else
            grid[6][7] = Integer.parseInt(cell67.getText());

        if(Objects.equals(cell68.getText(), ""))
            grid [6][8] = 0;
        else
            grid[6][8] = Integer.parseInt(cell68.getText());

        if(Objects.equals(cell70.getText(), ""))
            grid [7][0] = 0;
        else
            grid [7][0] = Integer.parseInt(cell70.getText());

        if(Objects.equals(cell71.getText(), ""))
            grid [7][1] = 0;
        else
            grid[7][1] = Integer.parseInt(cell71.getText());

        if(Objects.equals(cell72.getText(), ""))
            grid [7][2] = 0;
        else
            grid[7][2] = Integer.parseInt(cell72.getText());

        if(Objects.equals(cell73.getText(), ""))
            grid [7][3] = 0;
        else
            grid[7][3] = Integer.parseInt(cell73.getText());

        if(Objects.equals(cell74.getText(), ""))
            grid [7][4] = 0;
        else
            grid[7][4] = Integer.parseInt(cell74.getText());

        if(Objects.equals(cell75.getText(), ""))
            grid [7][5] = 0;
        else
            grid[7][5] = Integer.parseInt(cell75.getText());

        if(Objects.equals(cell76.getText(), ""))
            grid [7][6] = 0;
        else
            grid[7][6] = Integer.parseInt(cell76.getText());

        if(Objects.equals(cell77.getText(), ""))
            grid [7][7] = 0;
        else
            grid[7][7] = Integer.parseInt(cell77.getText());

        if(Objects.equals(cell78.getText(), ""))
            grid [7][8] = 0;
        else
            grid[7][8] = Integer.parseInt(cell78.getText());

        if(Objects.equals(cell80.getText(), ""))
            grid [8][0] = 0;
        else
            grid [8][0] = Integer.parseInt(cell80.getText());

        if(Objects.equals(cell81.getText(), ""))
            grid [8][1] = 0;
        else
            grid[8][1] = Integer.parseInt(cell81.getText());

        if(Objects.equals(cell82.getText(), ""))
            grid [8][2] = 0;
        else
            grid[8][2] = Integer.parseInt(cell82.getText());

        if(Objects.equals(cell83.getText(), ""))
            grid [8][3] = 0;
        else
            grid[8][3] = Integer.parseInt(cell83.getText());

        if(Objects.equals(cell84.getText(), ""))
            grid [8][4] = 0;
        else
            grid[8][4] = Integer.parseInt(cell84.getText());

        if(Objects.equals(cell85.getText(), ""))
            grid [8][5] = 0;
        else
            grid[8][5] = Integer.parseInt(cell85.getText());

        if(Objects.equals(cell86.getText(), ""))
            grid [8][6] = 0;
        else
            grid[8][6] = Integer.parseInt(cell86.getText());

        if(Objects.equals(cell87.getText(), ""))
            grid [8][7] = 0;
        else
            grid[8][7] = Integer.parseInt(cell87.getText());

        if(Objects.equals(cell88.getText(), ""))
            grid [8][8] = 0;
        else
            grid[8][8] = Integer.parseInt(cell88.getText());

    }

}