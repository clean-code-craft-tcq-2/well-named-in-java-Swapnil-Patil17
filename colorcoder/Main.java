package colorcoder;

public class Main {
    
    public static void main(String[] args) {
        
        ColorCodeTest.testNumberToPair(4, MajorColor.WHITE, MinorColor.BROWN);
        ColorCodeTest.testNumberToPair(5, MajorColor.WHITE, MinorColor.SLATE);
    
        ColorCodeTest.testPairToNumber(MajorColor.BLACK, MinorColor.ORANGE, 12);
        ColorCodeTest.testPairToNumber(MajorColor.VIOLET, MinorColor.SLATE, 25);
    }
}
