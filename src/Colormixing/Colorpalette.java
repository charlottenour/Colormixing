package Colormixing;

import java.util.ArrayList;

public class Colorpalette {
    private int numberOfColors;



    public ArrayList<Color> colors=new ArrayList<>();



    public int getColorPalette() {
        int[]colorPalette = new int[colors.size()];
        int i=0;
        for (Color color : colors){
            colorPalette[i] = color.getBlue();
            colorPalette[i] = color.getGreen();
            colorPalette[i] = color.getRed();
            i++;
        }
        return getColorPalette();
    }
    public Colorpalette(int maxColors){
        numberOfColors=maxColors;
    }


    public int getNumberOfColors() {
        return colors.size();
    }

    public void addColor(Color color){

        colors.add(color);
    }
    public Color getColor(int index){
        return (colors.get(index));
    }
    public ArrayList getAllColors(){
        return colors;
    }

    public int getNumberOfGreyColors(){
        int greys=0;
        for (Color color: colors){
            if(color.isGrey()){
                greys++;
            }
        }
        return greys;
    }

    public void mixColor(int index, Color color2){
        Color color=colors.get(index);
        color.mixWith(color2);
    }

    @Override
    public boolean equals(Object obj) {
        if(this==obj) return true;
        if (obj==null || getClass()!= obj.getClass()) return false;

        Colorpalette that=(Colorpalette)obj;

        if (numberOfColors != that.numberOfColors) return false;
        return colors.equals(that.colors);
    }

    @Override
    public String toString() {
        return "ColorPalette{" +
                "numberOfColors="+ numberOfColors+
                ", colors="+ colors+
                '}' ;
    }


}

