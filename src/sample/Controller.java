package sample;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.media.AudioClip;
import javafx.scene.text.Text;
import sun.lwawt.macosx.CPrinterDevice;

public class Controller {
    private int NumTurns;
    private String playerTurn;
    private AudioClip audio;
    private StringProperty label;
    private StringProperty R1C1;
    private StringProperty R2C1;
    private StringProperty R3C1;
    private StringProperty R1C2;
    private StringProperty R2C2;
    private StringProperty R3C2;
    private StringProperty R1C3;
    private StringProperty R2C3;
    private StringProperty R3C3;

    public Controller() {
        setPlayerTurn("Player 1");
        R1C1 = new SimpleStringProperty();
        R2C1 = new SimpleStringProperty();
        R3C1 = new SimpleStringProperty();
        R1C2 = new SimpleStringProperty();
        R2C2 = new SimpleStringProperty();
        R3C2 = new SimpleStringProperty();
        R1C3 = new SimpleStringProperty();
        R2C3 = new SimpleStringProperty();
        R3C3 = new SimpleStringProperty();
        label = new SimpleStringProperty();
        reset();
        audio = new AudioClip(getClass().getResource("/sounds/win.mp3").toExternalForm());
    }

    public void reset() {
        setR1C1("  ");
        setR1C2("  ");
        setR1C3("  ");
        setR2C1("  ");
        setR2C2("  ");
        setR2C3("  ");
        setR3C1("  ");
        setR3C2("  ");
        setR3C3("  ");
        setLabel("Player 1");
        NumTurns = 0;
    }

    public String checkWin(String b1, String b2, String b3) {
        if ((b1 == "X") && (b2 == "X") && (b3 == "X")){
            return "winx";
        }
        else if ((b1 == "O") && (b2 == "O") && (b3 == "O")){
            return "wino";
        }
        return "no";

    }

    public String verifyWin() {
        String col1X = checkWin(getR1C1(), getR2C1(), getR3C1());
        if (col1X != "no") {
            return col1X;
        }

        String col2X = checkWin(getR1C2(), getR2C2(), getR3C2());
        if (col2X != "no") {
            return col2X;
        }
        String col3X = checkWin(getR1C3(), getR2C3(), getR3C3());
        if (col3X != "no") {
            return col3X;
        }

        String row1X = checkWin(getR1C1(), getR1C2(), getR1C3());
        if (row1X != "no") {
            return row1X;
        }
        String row2X = checkWin(getR2C1(), getR2C2(), getR2C3());
        if (row2X != "no") {
            return row2X;
        }
        String row3X = checkWin(getR3C1(), getR3C2(), getR3C3());
        if (row3X != "no") {
            return row3X;
        }
        String leftDiagonalX = checkWin(getR1C1(), getR2C2(), getR3C3());
        if (leftDiagonalX != "no") {
            return leftDiagonalX;
        }
        String rightDiagonalX = checkWin(getR3C1(), getR2C2(), getR1C3());
        if (rightDiagonalX != "no") {
            return rightDiagonalX;
        }

        return "no";
    }



    public void buttonClickedR1C1(ActionEvent actionEvent) {
        if (getR1C1() == "  ") {
            NumTurns++;
            System.out.println("picking");
            if (NumTurns % 2 == 1) {
                setR1C1("X");
            } else {
                setR1C1("O");
            }
        }
        System.out.println("passed");
        endTurn();
    }

    public void buttonClickedR2C1(ActionEvent actionEvent) {
        if (getR2C1() == "  ") {
            NumTurns++;
            if (NumTurns % 2 == 1) {
                setR2C1("X");
            } else {
                setR2C1("O");
            }
        }
        endTurn();
    }

    public void buttonClickedR3C1(ActionEvent actionEvent) {
        if (getR3C1() == "  ") {
            NumTurns++;
            if (NumTurns % 2 == 1) {
                setR3C1("X");
            } else {
                setR3C1("O");
            }
        }
        endTurn();
    }

    public void buttonClickedR1C2(ActionEvent actionEvent) {
        if (getR1C2() == "  ") {
            NumTurns++;
            if (NumTurns % 2 == 1) {
                setR1C2("X");
            } else {
                setR1C2("O");
            }
        }
        endTurn();
    }

    public void buttonClickedR2C2(ActionEvent actionEvent) {
        if (getR2C2() == "  ") {
            NumTurns++;
            if (NumTurns % 2 == 1) {
                setR2C2("X");
            } else {
                setR2C2("O");
            }
        }
        endTurn();
    }

    public void buttonClickedR3C2(ActionEvent actionEvent) {
        if (getR3C2() == "  ") {
            NumTurns++;
            if (NumTurns % 2 == 1) {
                setR3C2("X");
            } else {
                setR3C2("O");
            }
        }
        endTurn();
    }

    public void buttonClickedR1C3(ActionEvent actionEvent) {
        if (getR1C3() == "  ") {
            NumTurns++;
            if (NumTurns % 2 == 1) {
                setR1C3("X");
            } else {
                setR1C3("O");
            }
        }
        endTurn();
    }

    public void buttonClickedR2C3(ActionEvent actionEvent) {
        if (getR2C3() == "  ") {
            NumTurns++;
            if (NumTurns % 2 == 1) {
                setR2C3("X");
            } else {
                setR2C3("O");
            }
        }
        endTurn();
    }

    public void buttonClickedR3C3(ActionEvent actionEvent) {
        if (getR3C3() == "  ") {
            NumTurns++;
            if (NumTurns % 2 == 1) {
                setR3C3("X");
            } else {
                setR3C3("O");
            }
        }
        endTurn();
    }

    public String getPlayerTurn() {
        return playerTurn;
    }

    public void setPlayerTurn(String playerTurn) {
        this.playerTurn = playerTurn;
    }


    public void endTurn() {
        String verifyWin = verifyWin();
        if (verifyWin != "no") {
            if (verifyWin == "winx") {
                setLabel("Player 1 Wins!");
            }
            else {
                setLabel("Player 2 Wins!");
            }
            audio.play();
        }
        else {
            if (NumTurns % 2 == 1) {
                setLabel("Player 2");
            } else {
                setLabel("Player 1");
            }


        }

    }

    public void restart(ActionEvent actionEvent) {
        reset();
        resetPicks();
    }

    public String getLabel() {
        return label.get();
    }

    public StringProperty labelProperty() {
        return label;
    }

    public void setLabel(String label) {
        this.label.set(label);
    }

    public String getR1C1() {
        return R1C1.get();
    }

    public StringProperty r1C1Property() {
        return R1C1;
    }

    public void setR1C1(String r1C1) {
        this.R1C1.set(r1C1);
    }

    public String getR2C1() {
        return R2C1.get();
    }

    public StringProperty r2C1Property() {
        return R2C1;
    }

    public void setR2C1(String r2C1) {
        this.R2C1.set(r2C1);
    }

    public String getR3C1() {
        return R3C1.get();
    }

    public StringProperty r3C1Property() {
        return R3C1;
    }

    public void setR3C1(String r3C1) {
        this.R3C1.set(r3C1);
    }

    public String getR1C2() {
        return R1C2.get();
    }

    public StringProperty r1C2Property() {
        return R1C2;
    }

    public void setR1C2(String r1C2) {
        this.R1C2.set(r1C2);
    }

    public String getR2C2() {
        return R2C2.get();
    }

    public StringProperty r2C2Property() {
        return R2C2;
    }

    public void setR2C2(String r2C2) {
        this.R2C2.set(r2C2);
    }

    public String getR3C2() {
        return R3C2.get();
    }

    public StringProperty r3C2Property() {
        return R3C2;
    }

    public void setR3C2(String r3C2) {
        this.R3C2.set(r3C2);
    }

    public String getR1C3() {
        return R1C3.get();
    }

    public StringProperty r1C3Property() {
        return R1C3;
    }

    public void setR1C3(String r1C3) {
        this.R1C3.set(r1C3);
    }

    public String getR2C3() {
        return R2C3.get();
    }

    public StringProperty r2C3Property() {
        return R2C3;
    }

    public void setR2C3(String r2C3) {
        this.R2C3.set(r2C3);
    }

    public String getR3C3() {
        return R3C3.get();
    }

    public StringProperty r3C3Property() {
        return R3C3;
    }

    public void setR3C3(String r3C3) {
        this.R3C3.set(r3C3);
    }
}
