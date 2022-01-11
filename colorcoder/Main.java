package colorcoder;

public class Main {
    
    public static void main(String[] args) {
        
        ColorCodetesting.testNumberToPair(4, MajorColor.WHITE, MinorColor.BROWN);
        ColorCodetesting.testNumberToPair(5, MajorColor.WHITE, MinorColor.SLATE);
    
        ColorCodetesting.testPairToNumber(MajorColor.BLACK, MinorColor.ORANGE, 12);
        ColorCodetesting.testPairToNumber(MajorColor.VIOLET, MinorColor.SLATE, 25);
    }
}
