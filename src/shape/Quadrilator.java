package shape;
public class Quadrilator{

    public void buildSquare(int n,int m){
        for(int row=1; row<=m; row++){
            for(int col=1; col<=n; col++){
                if(row==1 || row ==m){
                    System.out.print("*");
                }
                else{
                    if(col==1 || col== n){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}