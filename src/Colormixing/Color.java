package Colormixing;

public class Color {
    private int red;
    private int blue;
    private int green;




    public Color (int red, int green, int blue){
        this.red=red;
        this.blue=blue;
        this.green=green;

    }

    public void setRed(){
        this.red=red;
    }
    public void setBlue(){
        this.blue=blue;
    }
    public void setGreen(){
        this.green=green;
    }

    public int getRed(){
        return red;
    }
    public int getBlue(){
        return blue;
    }
    public int getGreen(){
        return green;
    }

    public boolean isGrey(){

        if (red ==blue && green ==red){
            return true;
        }
        else{
            return false;


        }}
    public void mixWith(Color color2){
        red = ((red + color2.getRed()) + ((red + color2.getRed()) % 2)) / 2;
        blue = ((blue + color2.getBlue()) + ((blue + color2.getBlue()) % 2)) / 2;
        green = ((green + color2.getGreen()) + ((green + color2.getGreen()) % 2)) / 2;
    }


    public Color copy(){
        Color copy=new Color(this.red, this.blue, this.green);
        return (copy);
    }


    @Override
    public boolean equals(Object obj) {
        if (this==obj) return true;
        if (obj==null||getClass()!=obj.getClass()) return false;
        Color color=(Color) obj;
        if (red!=color.red) return false;
        if (blue!=color.blue) return false;
        return green==color.green;

    }

    @Override
    public String toString() {
        return "Color{" +
                ",red=" + red +
                ",blue=" + blue +
                ",green=" + green +
                '}';
    }


}


