package shape;
public class Quadrilator{

    public Quadrilator(){

    }

    public void buildRow(int col){
        for(int i=1;i<=col;i++){
                System.out.print("*")
        }
    }

    public void builRowWhiteSpace(int colSize){
        for(int i=1; i <= colSize;i++){
            if(i==1 || i== colSize){
                System.out.print("*")
            }else{
                System.out.print(" ")
            }
        }
    }

    public void buildSquare(int n){
        for(int row=1; row<=n; row++){
            for(int col=1; col<=n; col++){
                if(row==1 || row ==n){
                    buildRow(n);
                }else{
                    builRowWhiteSpace(n);
                }
            }
        }
    }
}