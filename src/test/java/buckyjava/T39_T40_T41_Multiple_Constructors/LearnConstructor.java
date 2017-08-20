package buckyjava.T39_T40_T41_Multiple_Constructors;

public class LearnConstructor {
    private int hour;
    private int minute;
    private int second;

    public LearnConstructor(){
        // this (this(0,0,0);) is to invoke another constructor
        this(0,0,0);
    }
    public LearnConstructor(int h){
        this(h,0,0);
    }
    public LearnConstructor(int h, int m){
        this(h,m,0);
    }
    public LearnConstructor(int h,int m, int s){
        setTime(h,m,s);
    }
    public void setTime(int h,int m, int s){
        setHour(h);
        setMinute(m);
        setSecond(s);
    }

    public void setHour(int h) {
        hour = ((h>0&&h<24)?h:0);
    }

    public void setMinute(int m) {
        minute = ((m>0&&m<60)?m:0);
    }

    public void setSecond(int s) {
        second = ((s>0&&s<60)?s:0);
    }

    public int getHour(){
        return hour;
    }

    public int getMinute(){
        return minute;
    }

    public int getSecond(){
        return second;
    }

    public String toMillitary(){
        return String.format("%02d:%02d:%02d",getHour(),getMinute(),getSecond());
    }

    public static void main(String[] args) {

    LearnConstructor lc  = new LearnConstructor();
    LearnConstructor lc2 = new LearnConstructor(5);
    LearnConstructor lc3 = new LearnConstructor(5,13);
    LearnConstructor lc4 = new LearnConstructor(5,13,43);


    //\n meaning new line
        System.out.printf("%s\n",lc.toMillitary());
        System.out.printf("%s\n",lc2.toMillitary());
        System.out.printf("%s\n",lc3.toMillitary());
        System.out.printf("%s\n",lc4.toMillitary());

    }
}
