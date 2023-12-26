package src.Transcript;

import src.Enums.Marks;

import java.io.Serializable;

public class Mark implements Serializable {
    private double att1;
    private double att2;
    private double finalMark;

    private Marks mark;

    public Mark(double att1, double att2, double finalMark) {
        this.att1 = att1;
        this.att2 = att2;
        this.finalMark = finalMark;
        this.mark = calculateLetterMark();
    }

    public double getAtt1() {
        return this.att1;
    }

    public void setAtt1(double att1) {
        this.att1 = att1;
    }

    public double getAtt2() {
        return this.att2;
    }

    public void setAtt2(double att2) {
        this.att2 = att2;
    }

    public double getFinalMark() {
        return this.finalMark;
    }

    public void setFinalMark(double finalMark) {
        this.finalMark = finalMark;
    }

    public Marks getMark() {
        return this.mark;
    }

    public void setMark(Marks mark) {
        this.mark = mark;
    }

    public double calculateGP() {
        return att1 + att2 + finalMark;
    }

    public Marks calculateLetterMark() {
        double totalGP = calculateGP();

        if (totalGP >= 90) {
            return Marks.A;
        } else if (totalGP >= 85) {
            return Marks.MINES_A;
        } else if (totalGP >= 80) {
            return Marks.PLUS_B;
        } else if (totalGP >= 75) {
            return Marks.B;
        } else if (totalGP >= 70) {
            return Marks.MINES_B;
        } else if (totalGP >= 65) {
            return Marks.PLUS_C;
        } else if (totalGP >= 60) {
            return Marks.C;
        } else if (totalGP >= 55) {
            return Marks.MINES_C;
        } else if (totalGP >= 50) {
            return Marks.PLUS_D;
        } else if (totalGP >= 45) {
            return Marks.D;
        } else {
            return Marks.F;
        }
    }
}
