package sample.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import sample.Model.Palyer;
import sample.View.Popupwindow;
import sample.View.StartWindow;

import java.awt.*;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable{
    @FXML
    public Button btn0;
    @FXML
    public Button btn1;
    @FXML
    public Button btn2;
    @FXML
    public Button btn3;
    @FXML
    public Button btn4;
    @FXML
    public Button btn5;
    @FXML
    public Button btn6;
    @FXML
    public Button btn7;
    @FXML
    public Button btn8;
    @FXML
    public Button btn10;
    @FXML
    public Button btn11;
    @FXML
    public Button btn12;
    @FXML
    public Button btn13;
    @FXML
    public Button btn14;
    @FXML
    public Button btn15;
    @FXML
    public Button btn16;
    @FXML
    public Button btn17;
    @FXML
    public Button btn18;
    @FXML
    public Button btn20;
    @FXML
    public Button btn21;
    @FXML
    public Button btn22;
    @FXML
    public Button btn23;
    @FXML
    public Button btn24;
    @FXML
    public Button btn25;
    @FXML
    public Button btn26;
    @FXML
    public Button btn27;
    @FXML
    public Button btn28;
    @FXML
    public Button btn30;
    @FXML
    public Button btn31;
    @FXML
    public Button btn32;
    @FXML
    public Button btn33;
    @FXML
    public Button btn34;
    @FXML
    public Button btn35;
    @FXML
    public Button btn36;
    @FXML
    public Button btn37;
    @FXML
    public Button btn38;
    @FXML
    public Button btn40;
    @FXML
    public Button btn41;
    @FXML
    public Button btn42;
    @FXML
    public Button btn43;
    @FXML
    public Button btn44;
    @FXML
    public Button btn45;
    @FXML
    public Button btn46;
    @FXML
    public Button btn47;
    @FXML
    public Button btn48;
    @FXML
    public Button btn50;
    @FXML
    public Button btn51;
    @FXML
    public Button btn52;
    @FXML
    public Button btn53;
    @FXML
    public Button btn54;
    @FXML
    public Button btn55;
    @FXML
    public Button btn56;
    @FXML
    public Button btn57;
    @FXML
    public Button btn58;
    @FXML
    public Button btn60;
    @FXML
    public Button btn61;
    @FXML
    public Button btn62;
    @FXML
    public Button btn63;
    @FXML
    public Button btn64;
    @FXML
    public Button btn65;
    @FXML
    public Button btn66;
    @FXML
    public Button btn67;
    @FXML
    public Button btn68;
    @FXML
    public Button btn70;
    @FXML
    public Button btn71;
    @FXML
    public Button btn72;
    @FXML
    public Button btn73;
    @FXML
    public Button btn74;
    @FXML
    public Button btn75;
    @FXML
    public Button btn76;
    @FXML
    public Button btn77;
    @FXML
    public Button btn78;
    @FXML
    public Button btn80;
    @FXML
    public Button btn81;
    @FXML
    public Button btn82;
    @FXML
    public Button btn83;
    @FXML
    public Button btn84;
    @FXML
    public Button btn85;
    @FXML
    public Button btn86;
    @FXML
    public Button btn87;
    @FXML
    public Button btn88;
    @FXML
    private Label player;

    private boolean isO;
    private Palyer player1;
    private Palyer player2;
    private Button[][] grid;

    @Override
    public void initialize(URL location, ResourceBundle resourceBundle){

        isO = true;
        player1 = new Palyer("Player 1");
        player2 = new Palyer("Player 2");
        grid = new Button[][]{
                {btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8},
                {btn10, btn11, btn12, btn13, btn14, btn15, btn16, btn17, btn18},
                {btn20, btn21, btn22, btn23, btn24, btn25, btn26, btn27, btn28},
                {btn30, btn31, btn32, btn33, btn34, btn35, btn36, btn37, btn38},
                {btn40, btn41, btn42, btn43, btn44, btn45, btn46, btn47, btn48},
                {btn50, btn51, btn52, btn53, btn54, btn55, btn56, btn57, btn58},
                {btn60, btn61, btn62, btn63, btn64, btn65, btn66, btn67, btn68},
                {btn70, btn71, btn72, btn73, btn74, btn75, btn76, btn77, btn78},
                {btn80, btn81, btn82, btn83, btn84, btn85, btn86, btn87, btn88},
        };
        StartWindow.display1("GOMOKU", "Start to play by " + player1.getName());
        changeLable();
    }

    private void changeLable(){
        if (isO){
            player.setText(player1.getName());
        }else {
            player.setText(player2.getName());
        }
    }

    @FXML
    public void buttonClicked(ActionEvent actionEvent) {

        Button btnClicked = (Button) actionEvent.getSource();

        if (btnClicked.getText().equals("")) {
            if (isO) {
                btnClicked.setText("●");
            } else {
                btnClicked.setText("○");
            }
            judge(); // popup window!
            isO = !isO;
            changeLable();
        }
    }

    private boolean checkDiagonals(){
        String Owin = "○○○○○";
        String Xwin = "●●●●●";

// cal
        String diag0 = grid[0][0].getText() + grid[1][0].getText() + grid[2][0].getText() + grid[3][0].getText() + grid[4][0].getText();
        String diag1 = grid[1][0].getText() + grid[2][0].getText() + grid[3][0].getText() + grid[4][0].getText() + grid[5][0].getText();
        String diag2 = grid[2][0].getText() + grid[3][0].getText() + grid[4][0].getText() + grid[5][0].getText() + grid[6][0].getText();
        String diag3 = grid[3][0].getText() + grid[4][0].getText() + grid[5][0].getText() + grid[6][0].getText() + grid[7][0].getText();
        String diag4 = grid[4][0].getText() + grid[5][0].getText() + grid[6][0].getText() + grid[7][0].getText() + grid[8][0].getText();
        String diag5 = grid[0][1].getText() + grid[1][1].getText() + grid[2][1].getText() + grid[3][1].getText() + grid[4][1].getText();
        String diag6 = grid[1][1].getText() + grid[2][1].getText() + grid[3][1].getText() + grid[4][1].getText() + grid[5][1].getText();
        String diag7 = grid[2][1].getText() + grid[3][1].getText() + grid[4][1].getText() + grid[5][1].getText() + grid[6][1].getText();
        String diag8 = grid[3][1].getText() + grid[4][1].getText() + grid[5][1].getText() + grid[6][1].getText() + grid[7][1].getText();
        String diag9 = grid[4][1].getText() + grid[5][1].getText() + grid[6][1].getText() + grid[7][1].getText() + grid[8][1].getText();

        String diag10 = grid[0][2].getText() + grid[1][2].getText() + grid[2][2].getText() + grid[3][2].getText() + grid[4][2].getText();
        String diag11 = grid[1][2].getText() + grid[2][2].getText() + grid[3][2].getText() + grid[4][2].getText() + grid[5][2].getText();
        String diag12 = grid[2][2].getText() + grid[3][2].getText() + grid[4][2].getText() + grid[5][2].getText() + grid[6][2].getText();
        String diag13 = grid[3][2].getText() + grid[4][2].getText() + grid[5][2].getText() + grid[6][2].getText() + grid[7][2].getText();
        String diag14 = grid[4][2].getText() + grid[5][2].getText() + grid[6][2].getText() + grid[7][2].getText() + grid[8][2].getText();
        String diag15 = grid[0][3].getText() + grid[1][3].getText() + grid[2][3].getText() + grid[3][3].getText() + grid[4][3].getText();
        String diag16 = grid[1][3].getText() + grid[2][3].getText() + grid[3][3].getText() + grid[4][3].getText() + grid[5][3].getText();
        String diag17 = grid[2][3].getText() + grid[3][3].getText() + grid[4][3].getText() + grid[5][3].getText() + grid[6][3].getText();
        String diag18 = grid[3][3].getText() + grid[4][3].getText() + grid[5][3].getText() + grid[6][3].getText() + grid[7][3].getText();
        String diag19 = grid[4][3].getText() + grid[5][3].getText() + grid[6][3].getText() + grid[7][3].getText() + grid[8][3].getText();

        String diag20 = grid[0][4].getText() + grid[1][4].getText() + grid[2][4].getText() + grid[3][4].getText() + grid[4][4].getText();
        String diag21 = grid[1][4].getText() + grid[2][4].getText() + grid[3][4].getText() + grid[4][4].getText() + grid[5][4].getText();
        String diag22 = grid[2][4].getText() + grid[3][4].getText() + grid[4][4].getText() + grid[5][4].getText() + grid[6][4].getText();
        String diag23 = grid[3][4].getText() + grid[4][4].getText() + grid[5][4].getText() + grid[6][4].getText() + grid[7][4].getText();
        String diag24 = grid[4][4].getText() + grid[5][4].getText() + grid[6][4].getText() + grid[7][4].getText() + grid[8][4].getText();
        String diag25 = grid[0][5].getText() + grid[1][5].getText() + grid[2][5].getText() + grid[3][5].getText() + grid[4][5].getText();
        String diag26 = grid[1][5].getText() + grid[2][5].getText() + grid[3][5].getText() + grid[4][5].getText() + grid[5][5].getText();
        String diag27 = grid[2][5].getText() + grid[3][5].getText() + grid[4][5].getText() + grid[5][5].getText() + grid[6][5].getText();
        String diag28 = grid[3][5].getText() + grid[4][5].getText() + grid[5][5].getText() + grid[6][5].getText() + grid[7][5].getText();
        String diag29 = grid[4][5].getText() + grid[5][5].getText() + grid[6][5].getText() + grid[7][5].getText() + grid[8][5].getText();

        String diag30 = grid[0][6].getText() + grid[1][6].getText() + grid[2][6].getText() + grid[3][6].getText() + grid[4][6].getText();
        String diag31 = grid[1][6].getText() + grid[2][6].getText() + grid[3][6].getText() + grid[4][6].getText() + grid[5][6].getText();
        String diag32 = grid[2][6].getText() + grid[3][6].getText() + grid[4][6].getText() + grid[5][6].getText() + grid[6][6].getText();
        String diag33 = grid[3][6].getText() + grid[4][6].getText() + grid[5][6].getText() + grid[6][6].getText() + grid[7][6].getText();
        String diag34 = grid[4][6].getText() + grid[5][6].getText() + grid[6][6].getText() + grid[7][6].getText() + grid[8][6].getText();
        String diag35 = grid[0][7].getText() + grid[1][7].getText() + grid[2][7].getText() + grid[3][7].getText() + grid[4][7].getText();
        String diag36 = grid[1][7].getText() + grid[2][7].getText() + grid[3][7].getText() + grid[4][7].getText() + grid[5][7].getText();
        String diag37 = grid[2][7].getText() + grid[3][7].getText() + grid[4][7].getText() + grid[5][7].getText() + grid[6][7].getText();
        String diag38 = grid[3][7].getText() + grid[4][7].getText() + grid[5][7].getText() + grid[6][7].getText() + grid[7][7].getText();
        String diag39 = grid[4][7].getText() + grid[5][7].getText() + grid[6][7].getText() + grid[7][7].getText() + grid[8][7].getText();

        String diag40 = grid[0][8].getText() + grid[1][8].getText() + grid[2][8].getText() + grid[3][8].getText() + grid[4][8].getText();
        String diag41 = grid[1][8].getText() + grid[2][8].getText() + grid[3][8].getText() + grid[4][8].getText() + grid[5][8].getText();
        String diag42 = grid[2][8].getText() + grid[3][8].getText() + grid[4][8].getText() + grid[5][8].getText() + grid[6][8].getText();
        String diag43 = grid[3][8].getText() + grid[4][8].getText() + grid[5][8].getText() + grid[6][8].getText() + grid[7][8].getText();
        String diag44 = grid[4][8].getText() + grid[5][8].getText() + grid[6][8].getText() + grid[7][8].getText() + grid[8][8].getText();

// row
        String diag50 = grid[0][0].getText() + grid[0][1].getText() + grid[0][2].getText() + grid[0][3].getText() + grid[0][4].getText();
        String diag51 = grid[0][1].getText() + grid[0][2].getText() + grid[0][3].getText() + grid[0][4].getText() + grid[0][5].getText();
        String diag52 = grid[0][2].getText() + grid[0][3].getText() + grid[0][4].getText() + grid[0][5].getText() + grid[0][6].getText();
        String diag53 = grid[0][3].getText() + grid[0][4].getText() + grid[0][5].getText() + grid[0][6].getText() + grid[0][7].getText();
        String diag54 = grid[0][4].getText() + grid[0][5].getText() + grid[0][6].getText() + grid[0][7].getText() + grid[0][8].getText();
        String diag55 = grid[1][0].getText() + grid[1][1].getText() + grid[1][2].getText() + grid[1][3].getText() + grid[1][4].getText();
        String diag56 = grid[1][1].getText() + grid[1][2].getText() + grid[1][3].getText() + grid[1][4].getText() + grid[1][5].getText();
        String diag57 = grid[1][2].getText() + grid[1][3].getText() + grid[1][4].getText() + grid[1][5].getText() + grid[1][6].getText();
        String diag58 = grid[1][3].getText() + grid[1][4].getText() + grid[1][5].getText() + grid[1][6].getText() + grid[1][7].getText();
        String diag59 = grid[1][4].getText() + grid[1][5].getText() + grid[1][6].getText() + grid[1][7].getText() + grid[1][8].getText();

        String diag60 = grid[2][0].getText() + grid[2][1].getText() + grid[2][2].getText() + grid[2][3].getText() + grid[2][4].getText();
        String diag61 = grid[2][1].getText() + grid[2][2].getText() + grid[2][3].getText() + grid[2][4].getText() + grid[2][5].getText();
        String diag62 = grid[2][2].getText() + grid[2][3].getText() + grid[2][4].getText() + grid[2][5].getText() + grid[2][6].getText();
        String diag63 = grid[2][3].getText() + grid[2][4].getText() + grid[2][5].getText() + grid[2][6].getText() + grid[2][7].getText();
        String diag64 = grid[2][4].getText() + grid[2][5].getText() + grid[2][6].getText() + grid[2][7].getText() + grid[2][8].getText();
        String diag65 = grid[3][0].getText() + grid[3][1].getText() + grid[3][2].getText() + grid[3][3].getText() + grid[3][4].getText();
        String diag66 = grid[3][1].getText() + grid[3][2].getText() + grid[3][3].getText() + grid[3][4].getText() + grid[3][5].getText();
        String diag67 = grid[3][2].getText() + grid[3][3].getText() + grid[3][4].getText() + grid[3][5].getText() + grid[3][6].getText();
        String diag68 = grid[3][3].getText() + grid[3][4].getText() + grid[3][5].getText() + grid[3][6].getText() + grid[3][7].getText();
        String diag69 = grid[3][4].getText() + grid[3][5].getText() + grid[3][6].getText() + grid[3][7].getText() + grid[3][8].getText();

        String diag70 = grid[4][0].getText() + grid[4][1].getText() + grid[4][2].getText() + grid[4][3].getText() + grid[4][4].getText();
        String diag71 = grid[4][1].getText() + grid[4][2].getText() + grid[4][3].getText() + grid[4][4].getText() + grid[4][5].getText();
        String diag72 = grid[4][2].getText() + grid[4][3].getText() + grid[4][4].getText() + grid[4][5].getText() + grid[4][6].getText();
        String diag73 = grid[4][3].getText() + grid[4][4].getText() + grid[4][5].getText() + grid[4][6].getText() + grid[4][7].getText();
        String diag74 = grid[4][4].getText() + grid[4][5].getText() + grid[4][6].getText() + grid[4][7].getText() + grid[4][8].getText();
        String diag75 = grid[5][0].getText() + grid[5][1].getText() + grid[5][2].getText() + grid[5][3].getText() + grid[5][4].getText();
        String diag76 = grid[5][1].getText() + grid[5][2].getText() + grid[5][3].getText() + grid[5][4].getText() + grid[5][5].getText();
        String diag77 = grid[5][2].getText() + grid[5][3].getText() + grid[5][4].getText() + grid[5][5].getText() + grid[5][6].getText();
        String diag78 = grid[5][3].getText() + grid[5][4].getText() + grid[5][5].getText() + grid[5][6].getText() + grid[5][7].getText();
        String diag79 = grid[5][4].getText() + grid[5][5].getText() + grid[5][6].getText() + grid[5][7].getText() + grid[5][8].getText();

        String diag80 = grid[6][0].getText() + grid[6][1].getText() + grid[6][2].getText() + grid[6][3].getText() + grid[6][4].getText();
        String diag81 = grid[6][1].getText() + grid[6][2].getText() + grid[6][3].getText() + grid[6][4].getText() + grid[6][5].getText();
        String diag82 = grid[6][2].getText() + grid[6][3].getText() + grid[6][4].getText() + grid[6][5].getText() + grid[6][6].getText();
        String diag83 = grid[6][3].getText() + grid[6][4].getText() + grid[6][5].getText() + grid[6][6].getText() + grid[6][7].getText();
        String diag84 = grid[6][4].getText() + grid[6][5].getText() + grid[6][6].getText() + grid[6][7].getText() + grid[6][8].getText();
        String diag85 = grid[7][0].getText() + grid[7][1].getText() + grid[7][2].getText() + grid[7][3].getText() + grid[7][4].getText();
        String diag86 = grid[7][1].getText() + grid[7][2].getText() + grid[7][3].getText() + grid[7][4].getText() + grid[7][5].getText();
        String diag87 = grid[7][2].getText() + grid[7][3].getText() + grid[7][4].getText() + grid[7][5].getText() + grid[7][6].getText();
        String diag88 = grid[7][3].getText() + grid[7][4].getText() + grid[7][5].getText() + grid[7][6].getText() + grid[7][7].getText();
        String diag89 = grid[7][4].getText() + grid[7][5].getText() + grid[7][6].getText() + grid[7][7].getText() + grid[7][8].getText();

        String diag90 = grid[8][0].getText() + grid[8][1].getText() + grid[8][2].getText() + grid[8][3].getText() + grid[8][4].getText();
        String diag91 = grid[8][1].getText() + grid[8][2].getText() + grid[8][3].getText() + grid[8][4].getText() + grid[8][5].getText();
        String diag92 = grid[8][2].getText() + grid[8][3].getText() + grid[8][4].getText() + grid[8][5].getText() + grid[8][6].getText();
        String diag93 = grid[8][3].getText() + grid[8][4].getText() + grid[8][5].getText() + grid[8][6].getText() + grid[8][7].getText();
        String diag94 = grid[8][4].getText() + grid[8][5].getText() + grid[8][6].getText() + grid[8][7].getText() + grid[8][8].getText();

// left up - right down
        String diag100 = grid[0][4].getText() + grid[1][5].getText() + grid[2][6].getText() + grid[3][7].getText() + grid[4][8].getText();

        String diag101 = grid[1][4].getText() + grid[2][5].getText() + grid[3][6].getText() + grid[4][7].getText() + grid[5][8].getText();
        String diag102 = grid[0][3].getText() + grid[1][4].getText() + grid[2][5].getText() + grid[3][6].getText() + grid[4][7].getText();

        String diag103 = grid[2][4].getText() + grid[3][5].getText() + grid[4][6].getText() + grid[5][7].getText() + grid[6][8].getText();
        String diag104 = grid[1][3].getText() + grid[2][4].getText() + grid[3][5].getText() + grid[4][6].getText() + grid[5][7].getText();
        String diag105 = grid[0][2].getText() + grid[1][3].getText() + grid[2][4].getText() + grid[3][5].getText() + grid[4][6].getText();

        String diag106 = grid[3][4].getText() + grid[4][5].getText() + grid[5][6].getText() + grid[6][7].getText() + grid[7][8].getText(); //
        String diag107 = grid[2][3].getText() + grid[3][4].getText() + grid[4][5].getText() + grid[5][6].getText() + grid[6][7].getText();
        String diag108 = grid[1][2].getText() + grid[2][3].getText() + grid[3][4].getText() + grid[4][5].getText() + grid[5][6].getText();
        String diag109 = grid[0][1].getText() + grid[1][2].getText() + grid[2][3].getText() + grid[3][4].getText() + grid[4][5].getText();

        String diag110 = grid[4][4].getText() + grid[5][5].getText() + grid[6][6].getText() + grid[7][7].getText() + grid[8][8].getText();
        String diag111 = grid[3][3].getText() + grid[4][4].getText() + grid[5][5].getText() + grid[6][6].getText() + grid[7][7].getText();
        String diag112 = grid[2][2].getText() + grid[3][3].getText() + grid[4][4].getText() + grid[5][5].getText() + grid[6][6].getText();
        String diag113 = grid[1][1].getText() + grid[2][2].getText() + grid[3][3].getText() + grid[4][4].getText() + grid[5][5].getText();
        String diag114 = grid[0][0].getText() + grid[1][1].getText() + grid[2][2].getText() + grid[3][3].getText() + grid[4][4].getText();

        String diag115 = grid[4][3].getText() + grid[5][4].getText() + grid[6][5].getText() + grid[7][6].getText() + grid[8][7].getText();
        String diag116 = grid[3][2].getText() + grid[4][3].getText() + grid[5][4].getText() + grid[6][5].getText() + grid[7][6].getText();
        String diag117 = grid[2][1].getText() + grid[3][2].getText() + grid[4][3].getText() + grid[5][4].getText() + grid[6][5].getText();
        String diag118 = grid[1][0].getText() + grid[2][1].getText() + grid[3][2].getText() + grid[4][3].getText() + grid[5][4].getText();

        String diag119 = grid[4][2].getText() + grid[5][3].getText() + grid[6][4].getText() + grid[7][5].getText() + grid[8][6].getText();
        String diag120 = grid[3][1].getText() + grid[4][2].getText() + grid[5][3].getText() + grid[6][4].getText() + grid[7][5].getText();
        String diag121 = grid[2][0].getText() + grid[3][1].getText() + grid[4][2].getText() + grid[5][3].getText() + grid[6][4].getText();

        String diag122 = grid[4][1].getText() + grid[5][2].getText() + grid[6][3].getText() + grid[7][4].getText() + grid[8][5].getText();
        String diag123 = grid[3][0].getText() + grid[4][1].getText() + grid[5][2].getText() + grid[6][3].getText() + grid[7][4].getText();

        String diag124 = grid[4][0].getText() + grid[5][1].getText() + grid[6][2].getText() + grid[7][3].getText() + grid[8][4].getText();

// right up - left down
        String diag125 = grid[4][8].getText() + grid[5][7].getText() + grid[6][6].getText() + grid[7][5].getText() + grid[8][4].getText();

        String diag126 = grid[4][7].getText() + grid[5][6].getText() + grid[6][5].getText() + grid[7][4].getText() + grid[8][3].getText();
        String diag127 = grid[3][8].getText() + grid[4][7].getText() + grid[5][6].getText() + grid[6][5].getText() + grid[7][4].getText();

        String diag128 = grid[4][6].getText() + grid[5][5].getText() + grid[6][4].getText() + grid[7][3].getText() + grid[8][2].getText();
        String diag129 = grid[3][7].getText() + grid[4][6].getText() + grid[5][5].getText() + grid[6][4].getText() + grid[7][3].getText();
        String diag130 = grid[2][8].getText() + grid[3][7].getText() + grid[4][6].getText() + grid[5][5].getText() + grid[6][4].getText();

        String diag131 = grid[3][6].getText() + grid[5][4].getText() + grid[6][3].getText() + grid[7][2].getText() + grid[8][1].getText();
        String diag132 = grid[3][6].getText() + grid[4][5].getText() + grid[5][4].getText() + grid[6][3].getText() + grid[7][2].getText();
        String diag133 = grid[2][7].getText() + grid[3][6].getText() + grid[4][5].getText() + grid[5][4].getText() + grid[6][3].getText();
        String diag134 = grid[1][8].getText() + grid[2][7].getText() + grid[3][6].getText() + grid[4][5].getText() + grid[5][4].getText();

        String diag135 = grid[4][4].getText() + grid[5][3].getText() + grid[6][2].getText() + grid[7][1].getText() + grid[8][0].getText();
        String diag136 = grid[3][5].getText() + grid[4][4].getText() + grid[5][3].getText() + grid[6][2].getText() + grid[7][1].getText();
        String diag137 = grid[2][6].getText() + grid[3][5].getText() + grid[4][4].getText() + grid[5][3].getText() + grid[6][2].getText();
        String diag138 = grid[1][7].getText() + grid[2][6].getText() + grid[3][5].getText() + grid[4][4].getText() + grid[5][3].getText();
        String diag139 = grid[0][8].getText() + grid[1][7].getText() + grid[2][6].getText() + grid[3][5].getText() + grid[4][4].getText();

        String diag140 = grid[3][4].getText() + grid[4][3].getText() + grid[5][2].getText() + grid[6][1].getText() + grid[7][0].getText();
        String diag141 = grid[2][5].getText() + grid[3][4].getText() + grid[4][3].getText() + grid[5][2].getText() + grid[6][1].getText();
        String diag142 = grid[1][6].getText() + grid[2][5].getText() + grid[3][4].getText() + grid[4][3].getText() + grid[5][2].getText();
        String diag143 = grid[0][7].getText() + grid[1][6].getText() + grid[2][5].getText() + grid[3][4].getText() + grid[4][3].getText();

        String diag144 = grid[2][4].getText() + grid[3][3].getText() + grid[4][2].getText() + grid[5][1].getText() + grid[6][0].getText();
        String diag145 = grid[1][5].getText() + grid[2][4].getText() + grid[3][3].getText() + grid[4][2].getText() + grid[5][1].getText();
        String diag146 = grid[0][6].getText() + grid[1][5].getText() + grid[2][4].getText() + grid[3][3].getText() + grid[4][2].getText();

        String diag147 =grid[1][4].getText() + grid[2][3].getText() + grid[3][2].getText() + grid[4][1].getText() + grid[5][0].getText();
        String diag148 = grid[0][5].getText() + grid[1][4].getText() + grid[2][3].getText() + grid[3][2].getText() + grid[4][1].getText();

        String diag149 = grid[0][4].getText() + grid[1][3].getText() + grid[2][2].getText() + grid[3][1].getText() + grid[4][0].getText();


        if (diag0.equals(Owin) || diag0.equals(Xwin)
                || diag1.equals(Owin) || diag1.equals(Xwin)
                || diag2.equals(Owin) || diag2.equals(Xwin)
                || diag3.equals(Owin) || diag3.equals(Xwin)
                || diag4.equals(Owin) || diag4.equals(Xwin)
                || diag5.equals(Owin) || diag5.equals(Xwin)
                || diag6.equals(Owin) || diag6.equals(Xwin)
                || diag7.equals(Owin) || diag7.equals(Xwin)
                || diag8.equals(Owin) || diag8.equals(Xwin)
                || diag9.equals(Owin) || diag9.equals(Xwin)

                || diag10.equals(Owin) || diag10.equals(Xwin)
                || diag11.equals(Owin) || diag11.equals(Xwin)
                || diag12.equals(Owin) || diag12.equals(Xwin)
                || diag13.equals(Owin) || diag13.equals(Xwin)
                || diag14.equals(Owin) || diag14.equals(Xwin)
                || diag15.equals(Owin) || diag15.equals(Xwin)
                || diag16.equals(Owin) || diag16.equals(Xwin)
                || diag17.equals(Owin) || diag17.equals(Xwin)
                || diag18.equals(Owin) || diag18.equals(Xwin)
                || diag19.equals(Owin) || diag19.equals(Xwin)

                || diag20.equals(Owin) || diag20.equals(Xwin)
                || diag21.equals(Owin) || diag21.equals(Xwin)
                || diag22.equals(Owin) || diag22.equals(Xwin)
                || diag23.equals(Owin) || diag23.equals(Xwin)
                || diag24.equals(Owin) || diag24.equals(Xwin)
                || diag25.equals(Owin) || diag25.equals(Xwin)
                || diag26.equals(Owin) || diag26.equals(Xwin)
                || diag27.equals(Owin) || diag27.equals(Xwin)
                || diag28.equals(Owin) || diag28.equals(Xwin)
                || diag29.equals(Owin) || diag29.equals(Xwin)

                || diag30.equals(Owin) || diag30.equals(Xwin)
                || diag31.equals(Owin) || diag31.equals(Xwin)
                || diag32.equals(Owin) || diag32.equals(Xwin)
                || diag33.equals(Owin) || diag33.equals(Xwin)
                || diag34.equals(Owin) || diag34.equals(Xwin)
                || diag35.equals(Owin) || diag35.equals(Xwin)
                || diag36.equals(Owin) || diag36.equals(Xwin)
                || diag37.equals(Owin) || diag37.equals(Xwin)
                || diag38.equals(Owin) || diag38.equals(Xwin)
                || diag39.equals(Owin) || diag39.equals(Xwin)

                || diag40.equals(Owin) || diag40.equals(Xwin)
                || diag41.equals(Owin) || diag41.equals(Xwin)
                || diag42.equals(Owin) || diag42.equals(Xwin)
                || diag43.equals(Owin) || diag43.equals(Xwin)
                || diag44.equals(Owin) || diag44.equals(Xwin)

                || diag50.equals(Owin) || diag50.equals(Xwin)
                || diag51.equals(Owin) || diag51.equals(Xwin)
                || diag52.equals(Owin) || diag52.equals(Xwin)
                || diag53.equals(Owin) || diag53.equals(Xwin)
                || diag54.equals(Owin) || diag54.equals(Xwin)
                || diag55.equals(Owin) || diag55.equals(Xwin)
                || diag56.equals(Owin) || diag56.equals(Xwin)
                || diag57.equals(Owin) || diag57.equals(Xwin)
                || diag58.equals(Owin) || diag58.equals(Xwin)
                || diag59.equals(Owin) || diag59.equals(Xwin)

                || diag60.equals(Owin) || diag60.equals(Xwin)
                || diag61.equals(Owin) || diag61.equals(Xwin)
                || diag62.equals(Owin) || diag62.equals(Xwin)
                || diag63.equals(Owin) || diag63.equals(Xwin)
                || diag64.equals(Owin) || diag64.equals(Xwin)
                || diag65.equals(Owin) || diag65.equals(Xwin)
                || diag66.equals(Owin) || diag66.equals(Xwin)
                || diag67.equals(Owin) || diag67.equals(Xwin)
                || diag68.equals(Owin) || diag68.equals(Xwin)
                || diag69.equals(Owin) || diag69.equals(Xwin)

                || diag70.equals(Owin) || diag70.equals(Xwin)
                || diag71.equals(Owin) || diag71.equals(Xwin)
                || diag72.equals(Owin) || diag72.equals(Xwin)
                || diag73.equals(Owin) || diag73.equals(Xwin)
                || diag74.equals(Owin) || diag74.equals(Xwin)
                || diag75.equals(Owin) || diag75.equals(Xwin)
                || diag76.equals(Owin) || diag76.equals(Xwin)
                || diag77.equals(Owin) || diag77.equals(Xwin)
                || diag78.equals(Owin) || diag78.equals(Xwin)
                || diag79.equals(Owin) || diag79.equals(Xwin)

                || diag80.equals(Owin) || diag80.equals(Xwin)
                || diag81.equals(Owin) || diag81.equals(Xwin)
                || diag82.equals(Owin) || diag82.equals(Xwin)
                || diag83.equals(Owin) || diag83.equals(Xwin)
                || diag84.equals(Owin) || diag84.equals(Xwin)
                || diag85.equals(Owin) || diag85.equals(Xwin)
                || diag86.equals(Owin) || diag86.equals(Xwin)
                || diag87.equals(Owin) || diag87.equals(Xwin)
                || diag88.equals(Owin) || diag88.equals(Xwin)
                || diag89.equals(Owin) || diag89.equals(Xwin)

                || diag90.equals(Owin) || diag90.equals(Xwin)
                || diag91.equals(Owin) || diag91.equals(Xwin)
                || diag92.equals(Owin) || diag92.equals(Xwin)
                || diag93.equals(Owin) || diag93.equals(Xwin)
                || diag94.equals(Owin) || diag94.equals(Xwin)

                || diag100.equals(Owin) || diag100.equals(Xwin)
                || diag101.equals(Owin) || diag101.equals(Xwin)
                || diag102.equals(Owin) || diag102.equals(Xwin)
                || diag103.equals(Owin) || diag103.equals(Xwin)
                || diag104.equals(Owin) || diag104.equals(Xwin)
                || diag105.equals(Owin) || diag105.equals(Xwin)
                || diag106.equals(Owin) || diag106.equals(Xwin)
                || diag107.equals(Owin) || diag107.equals(Xwin)
                || diag108.equals(Owin) || diag108.equals(Xwin)
                || diag109.equals(Owin) || diag109.equals(Xwin)

                || diag110.equals(Owin) || diag110.equals(Xwin)
                || diag111.equals(Owin) || diag111.equals(Xwin)
                || diag112.equals(Owin) || diag112.equals(Xwin)
                || diag113.equals(Owin) || diag113.equals(Xwin)
                || diag114.equals(Owin) || diag114.equals(Xwin)
                || diag115.equals(Owin) || diag115.equals(Xwin)
                || diag116.equals(Owin) || diag116.equals(Xwin)
                || diag117.equals(Owin) || diag117.equals(Xwin)
                || diag118.equals(Owin) || diag118.equals(Xwin)
                || diag119.equals(Owin) || diag119.equals(Xwin)

                || diag120.equals(Owin) || diag120.equals(Xwin)
                || diag121.equals(Owin) || diag121.equals(Xwin)
                || diag122.equals(Owin) || diag122.equals(Xwin)
                || diag123.equals(Owin) || diag123.equals(Xwin)
                || diag124.equals(Owin) || diag124.equals(Xwin)
                || diag125.equals(Owin) || diag125.equals(Xwin)
                || diag126.equals(Owin) || diag126.equals(Xwin)
                || diag127.equals(Owin) || diag127.equals(Xwin)
                || diag128.equals(Owin) || diag128.equals(Xwin)
                || diag129.equals(Owin) || diag129.equals(Xwin)

                || diag130.equals(Owin) || diag130.equals(Xwin)
                || diag131.equals(Owin) || diag131.equals(Xwin)
                || diag132.equals(Owin) || diag132.equals(Xwin)
                || diag133.equals(Owin) || diag133.equals(Xwin)
                || diag134.equals(Owin) || diag134.equals(Xwin)
                || diag135.equals(Owin) || diag135.equals(Xwin)
                || diag136.equals(Owin) || diag136.equals(Xwin)
                || diag137.equals(Owin) || diag137.equals(Xwin)
                || diag138.equals(Owin) || diag138.equals(Xwin)
                || diag139.equals(Owin) || diag139.equals(Xwin)

                || diag140.equals(Owin) || diag140.equals(Xwin)
                || diag141.equals(Owin) || diag141.equals(Xwin)
                || diag142.equals(Owin) || diag142.equals(Xwin)
                || diag143.equals(Owin) || diag143.equals(Xwin)
                || diag144.equals(Owin) || diag144.equals(Xwin)
                || diag145.equals(Owin) || diag145.equals(Xwin)
                || diag146.equals(Owin) || diag146.equals(Xwin)
                || diag147.equals(Owin) || diag147.equals(Xwin)
                || diag148.equals(Owin) || diag148.equals(Xwin)
                || diag149.equals(Owin) || diag149.equals(Xwin)

        ){
            return true;
        }
        return false;
    }

    private void judge() {

        if (checkDiagonals()){
            // TODO : POPUP Window! (dialog)
            if (isO){
                Popupwindow.display("Game Over", player1.getName() + " won !");
            }else {
                Popupwindow.display("Game Over", player2.getName() + " won !");
            }
            reset();
        }
    }

    public void reset(){
        for (int r = 0; r < grid.length; r++){
            for (int c = 0; c < grid.length; c++){
                grid[r][c].setText("");
                isO = false;
            }
        }
    }
}