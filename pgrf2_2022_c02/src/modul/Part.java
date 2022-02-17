package modul;

public class Part {

    private int count;
    private int start;

    public int getStart() {
        return start;
    }

    public int getCount() {
        return count;
    }

    //private Topology topology;//POINTS,LINES,LINE
    public enum Topology {POINTS,LINES,LINES_STRIP};

    public Part(int start,int count
    ){
        this.start=start;
        this.count=count;
    }

    @Override
    public String toString(){
        return "Part{start:"+start+",count:"+count+"}";
    }
}
